package News_Feed_System.src.com.company.Data;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import News_Feed_System.src.com.company.Model.Comment;
import News_Feed_System.src.com.company.Model.Post;
import News_Feed_System.src.com.company.Model.User;
import News_Feed_System.src.com.company.constants.Gender;
import News_Feed_System.src.com.company.constants.Vote;
import News_Feed_System.src.com.company.exception.NoPostFoundException;
import News_Feed_System.src.com.company.exception.NoUserFoundException;
import News_Feed_System.src.com.company.utils.IDgenerator;
import News_Feed_System.src.com.company.utils.Score;

public class Dao {
    private static Dao userDao = null;
    private Map<String,List<String>> followedUsers;
    private Map<String,User> userMap;
    private Map<Integer,Post> allPosts;
    private Map<String,List<Post>> postMap;
    private String loggedInUser;
    
    private Dao(){
        this.userMap = new HashMap<>();
        this.allPosts = new HashMap<>();
        this.postMap = new HashMap<>();
        this.followedUsers = new HashMap<>();
        this.loggedInUser = null;
    }

    public static Dao getInstance(){

        if(userDao==null) userDao = new Dao();

        return userDao;

    }

    public void registerUser(String username,String phoneNo,int age,
    Gender gender){

        if(this.userMap.containsKey(username)){
            System.out.println("Username already exists!");
            return;
        }

        User user1 = new User();

        user1.setAge(age);
        user1.setGender(gender);
        user1.setUserName(username);
        user1.setPhoneNo(phoneNo);
        user1.setId(IDgenerator.getId("user"));

        this.userMap.put(user1.getUserName(),user1);
    }

    public void loginUser(String username) throws NoUserFoundException{

        if(!userMap.containsKey(username)){
            throw new NoUserFoundException();
        }

        this.loggedInUser = username;
    }

    public void followUser(String username) throws NoUserFoundException{

        if(!this.userMap.containsKey(username)){
            throw new NoUserFoundException();
        }

        if(this.loggedInUser == null){
            System.out.println("You must login first!");
            return;
        }

        List<String> usersFollowed = null;

        if(this.followedUsers.get(this.loggedInUser)!=null)
            usersFollowed = this.followedUsers.get(this.loggedInUser);

        else usersFollowed = new ArrayList<>();

        usersFollowed.add(username);

        this.followedUsers.put(this.loggedInUser,usersFollowed);
    }

    public void createPost(String text){

        Post post1 = new Post();

        post1.setId(IDgenerator.getId("post"));
        post1.setContent(text);

        String timeStamp = new SimpleDateFormat("yyyy-MM-dd KK:mm a").format(new java.util.Date());
        
        post1.setTimeStamp(timeStamp);
        
        post1.setAuthor(this.loggedInUser);
        post1.setUserId(this.userMap.get(this.loggedInUser).getId());
        post1.setCommentsList(new ArrayList<>());

        List<Post> postsList = this.postMap.get(this.loggedInUser);

        if(postsList==null) postsList = new ArrayList<>();

        postsList.add(post1);

        this.postMap.put(this.loggedInUser,postsList);

        this.allPosts.put(post1.getId(),post1);
    }
    public void reply(int postId,String text) throws NoUserFoundException{

        if(this.loggedInUser==null)
            throw new NoUserFoundException();

        Comment comment1 = new Comment();

        comment1.setText(text);

        String timeStamp = new SimpleDateFormat("yyyy-MM-dd KK:mm a").format(new java.util.Date());
        comment1.setTimeStamp(timeStamp);

        comment1.setUserId(this.userMap.get(this.loggedInUser).getId());
        comment1.setId(IDgenerator.getId("comment"));

        Post currentPost = this.allPosts.get(postId);

        List<Comment> commentsList = currentPost.getCommentsList();

        if(commentsList==null) commentsList = new ArrayList<>();

        commentsList.add(comment1);

        currentPost.setCommentsList(commentsList);
    }

    public void vote(int postId,Vote voteType) throws NoPostFoundException{

        if(this.allPosts.get(postId)==null){
            throw new NoPostFoundException();
        }
        
        if(voteType==Vote.UPVOTE)
         this.allPosts.get(postId).setUpVote();
         
         else this.allPosts.get(postId).setDownVote();
    }

    public List<Post> showNewsFeed(){
        
        List<String> followedUsers = this.followedUsers.get(this.loggedInUser);

        if(followedUsers==null){
            System.out.println("Nothing to show.Start following someone to see their posts!");
            return null;
        }
        List<Post> feedPosts = new ArrayList<>();

        for(String username:followedUsers){
            List<Post> followedUsersPosts = this.postMap.get(username);

            if(followedUsersPosts==null) continue;

            for(Post post:followedUsersPosts) feedPosts.add(post);
        }

        // sort posts based on time created
        Collections.sort(feedPosts,new SortbyTimestamp());

        // sort posts based on no. of comments
        Collections.sort(feedPosts,new SortbyComments());

        // sort posts based on no. of votes
        Collections.sort(feedPosts,new SortbyVotes());
        
        System.out.println("--------------------------------------");
        System.out.println(" - NEWS FEED - ");
        System.out.println("--------------------------------------");
        for(Post post:feedPosts){
            System.out.println("id: "+String.format("%03d",post.getId()));
            System.out.println("( "+post.getUpVote()+" upvotes, "+post.getDownVote()+" downvotes )");
            System.out.println(post.getContent());
            System.out.println("Author: "+post.getAuthor());
            System.out.println(post.getTimeStamp());

            System.out.println("\t");

            for(Comment postComment:post.getCommentsList()){
                System.out.println("id: "+String.format("%03d",postComment.getId()));
                System.out.println(postComment.getText());
                System.out.println("Author: "+postComment.getUserName());
                System.out.println(postComment.getTimeStamp());
            }

            
        }
        return feedPosts;

    }

    class SortbyVotes implements Comparator<Post>
    {   
        @Override
        public int compare(Post post1, Post post2)
        {
            return Score.getScore(post2)-Score.getScore(post1);
        }
      
    }

    class SortbyComments implements Comparator<Post>
    {   
        @Override
        public int compare(Post post1, Post post2)
        {
            return post2.getCommentsList().size()-post1.getCommentsList().size();
        }
      
    }

    class SortbyTimestamp implements Comparator<Post>
    {   
        @Override
        public int compare(Post post1, Post post2)
        {
            return post2.getTimeStamp().compareTo(post1.getTimeStamp());
        }
      
    }
}
