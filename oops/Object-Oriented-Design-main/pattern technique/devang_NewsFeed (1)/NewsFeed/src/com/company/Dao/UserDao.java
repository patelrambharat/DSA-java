package com.company.Dao;

import com.company.Exception.NoPostFoundException;
import com.company.Exception.NoUserFoundException;
import com.company.Exception.UserAlreadyExistsException;
import com.company.Models.Follow;
import com.company.Models.Post;
import com.company.Models.Reply;
import com.company.Models.User;

import java.net.StandardSocketOptions;
import java.util.*;

public class UserDao {

    private static UserDao userDao = null;

    private UserDao() {

    }

    private HashMap<Integer, User> userHashMap = new HashMap<>();

    private HashMap<String, Integer> userList = new HashMap();

    private List<Post> postsList = new ArrayList<>();

    private HashMap<Integer, Post> postHashMap = new HashMap<>();

    private HashMap<Integer, Reply> replyHashMap = new HashMap<>();

    private List<Follow> followList = new ArrayList<>();

    public static UserDao getInstance() {
        if (userDao == null) {
            userDao = new UserDao();
        }
        return userDao;
    }

    public User registerUser(String name) throws UserAlreadyExistsException {
        if(userList.containsKey(name)){
            throw new UserAlreadyExistsException();
        }
        User newUser = new User(name);
        userList.put(name, newUser.getUserId());
        userHashMap.put(newUser.getUserId(),newUser);
        System.out.println("User "+name+" Successfully Registered with User id: "+newUser.getUserId());
        System.out.println();
        return newUser;
    }

    public User userLogin(String name) throws NoUserFoundException {
        if(!userList.containsKey(name))
            throw new NoUserFoundException();
        User loggedInUser = userHashMap.get(userList.get(name));
        System.out.println("User "+name+" Successfully Logged in with User id: "+userList.get(name));
        System.out.println();
        showAllPosts();
        return loggedInUser;
    }

    public void follow(String userFollowing, String userBeingFollowed) throws NoUserFoundException {
        if(!userList.containsKey(userFollowing) || !userList.containsKey(userBeingFollowed))
            throw new NoUserFoundException();
        User userfollowing = userHashMap.get(userList.get(userFollowing));
        User userbeingfollowed = userHashMap.get(userList.get(userBeingFollowed));
        userfollowing.getFollowed().add(userbeingfollowed);
        userbeingfollowed.getFollowers().add(userfollowing);
        Follow newfollow = new Follow(userfollowing.getUserId(), userbeingfollowed.getUserId());
        System.out.println("User "+userfollowing.getUserName()+" Successfully followed User "+userbeingfollowed.getUserName());
        System.out.println();
        followList.add(newfollow);
    }

    public void post(User userPosting, String postMessage) throws NoUserFoundException {
        if(!userHashMap.containsKey(userPosting.getUserId()))
            throw new NoUserFoundException();
        Post newPost = new Post(userPosting.getUserName(), postMessage);
        postsList.add(newPost);
        postHashMap.put(newPost.getPostId(), newPost);
        System.out.println("User "+userPosting.getUserName()+" Successfully Posted on News Feed");
        System.out.println();
    }

    public void showAllPosts(){
        Collections.sort(postsList, new SortByScore());
//        Collections.sort(postsList, new SortByTimestamp());
//        Collections.sort(postsList, new SortByFollowed());
        for(Post currentPost:postsList){
            System.out.println(currentPost.getPostId());
            System.out.println("( "+currentPost.getUpvotes()+" upvotes, "+currentPost.getDownvotes()+" downvotes )");
            System.out.println(currentPost.getPosteeUserName());
            System.out.println(currentPost.getPostMessage());
            System.out.println(currentPost.getPostTimestamp());
            for(Reply replies : currentPost.getReplies())
            {
                System.out.println("\t"+replies.getReplyId());
                System.out.println("\t"+replies.getReplyingUserName());
                System.out.println("\t"+replies.getReplyMessage());
                System.out.println("\t"+replies.getReplyTimestamp());
            }
            System.out.println();
        }
    }

    public void upvote(int postId) throws NoPostFoundException {
        if(!postHashMap.containsKey(postId))
            throw new NoPostFoundException();
        Post upvotePost = postHashMap.get(postId);
        upvotePost.setUpvotes(upvotePost.getUpvotes()+1);
        System.out.println("Post Upvoted Successfully");
        System.out.println();
    }

    public void downvote(int postId) throws NoPostFoundException {
        if(!postHashMap.containsKey(postId))
            throw new NoPostFoundException();
        Post upvotePost = postHashMap.get(postId);
        if(upvotePost.getUpvotes()>0) {
            upvotePost.setUpvotes(upvotePost.getUpvotes() - 1);
            System.out.println("Post Downvoted Successfully");
            System.out.println();
        }
        else
            System.out.println("Could not Downvote, downvotes are already 0");
    }

    public void reply(String replyingUserName, int postId, String replyMessage) throws NoPostFoundException {
        if(!postHashMap.containsKey(postId))
            throw new NoPostFoundException();
        Post replyOnPost = postHashMap.get(postId);
        replyOnPost.getReplies().add(new Reply(replyingUserName, replyMessage, replyOnPost.getPostId()));
    }


    class SortByFollowed implements Comparator<Post> {

        @Override
        public int compare(Post firstPost, Post secondPost) {

            //Can't anticipate
            return 0;
        }
    }

    class SortByTimestamp implements Comparator<Post> {

        @Override
        public int compare(Post firstPost, Post secondPost) {
            if(firstPost.getPostTimestamp().after(secondPost.getPostTimestamp()))
                return 1;
            else if(secondPost.getPostTimestamp().after(firstPost.getPostTimestamp()))
                return -1;
            else
                return 0;
        }
    }

    class SortByScore implements Comparator<Post> {

        @Override
        public int compare(Post firstPost, Post secondPost) {
            return firstPost.getScore()-secondPost.getScore();
        }
    }
}
