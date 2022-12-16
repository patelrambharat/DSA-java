package service;

import dao.Dao;
import models.Post;
import models.Reply;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


public class FeedService {
    private static FeedService instance = null;
    private Dao dao = Dao.getInstance();
    private FeedService(){

    }
    public static synchronized FeedService getInstance(){
        if(instance == null){
            instance = new FeedService();
        }
        return instance;
    }
    public void post(String message){
        dao.post(message);
    }

    public void upvote(int postId) {
        dao.upVote(postId);
    }
    public void downvote(int postId) {
        dao.downVote(postId);
    }
    public void showNewsFeed(){
        ArrayList<Post> postList = dao.showPost();
        Collections.sort(postList,new SortbyDate());
        Collections.sort(postList,new SortbyVote());
        Collections.sort(postList, new SortbyCommentCount());

//        ArrayList<Post> unFollowedUserPost = dao.getUnFollowedUserPost();
//        ArrayList<Post> followedUserPost = dao.getFollowedUserPost();

        for(int i = 0 ; i < postList.size(); i = i +1){
            Post post = postList.get(i);
            System.out.println("id: " + post.getPostId());
            System.out.println("(" + post.getUpVotes() + " upvotes, " + post.getDownVote() + " downvotes)");
            System.out.println(post.getUserName());
            System.out.println(post.getMessage());
            System.out.println(post.getDate());
            ArrayList<Reply> replyList = dao.getReplyList(post.getPostId());
            for(int replyNo = 0 ; replyNo < replyList.size(); replyNo = replyNo + 1) {
                Reply reply = replyList.get(replyNo);
                System.out.println("        id: " + reply.getReplyId());
                System.out.println("        " + reply.getUserCommented());
                System.out.println("        " + reply.getMessage());
                System.out.println("        " + reply.getDate());
            }
            System.out.println();
            System.out.println();
        }


/*
        for(int i = 0 ; i < followedUserPost.size(); i = i +1){
            Post post = followedUserPost.get(i);
            System.out.println("id: " + post.getPostId());
            System.out.println("(" + post.getUpVotes() + " upvotes, " + post.getDownVote() + " downvotes)");
            System.out.println(post.getUserName());
            System.out.println(post.getMessage());
            System.out.println(post.getDate());
            ArrayList<Reply> replyList = dao.getReplyList(post.getPostId());
            for(int replyNo = 0 ; replyNo < replyList.size(); replyNo = replyNo + 1) {
                Reply reply = replyList.get(replyNo);
                System.out.println("        id: " + reply.getReplyId());
                System.out.println("        " + reply.getUserCommented());
                System.out.println("        " + reply.getMessage());
                System.out.println("        " + reply.getDate());
            }
            System.out.println();
            System.out.println();
        }



        for(int i = 0 ; i < unFollowedUserPost.size(); i = i +1 ){
            Post post = unFollowedUserPost.get(i);
            System.out.println("id: " + post.getPostId());
            System.out.println("(" + post.getUpVotes() + " upvotes, " + post.getDownVote() + " downvotes)");
            System.out.println(post.getUserName());
            System.out.println(post.getMessage());
            System.out.println(post.getDate());
            ArrayList<Reply> replyList = dao.getReplyList(post.getPostId());
            for(int replyNo = 0 ; replyNo < replyList.size(); replyNo = replyNo + 1) {
                Reply reply = replyList.get(replyNo);
                System.out.println("        id: " + reply.getReplyId());
                System.out.println("        " + reply.getUserCommented());
                System.out.println("        " + reply.getMessage());
                System.out.println("        " + reply.getDate());
            }
            System.out.println();
            System.out.println();
        }

 */
    }

    class SortbyDate implements Comparator<Post>
    {
        public int compare(Post a, Post b)
        {
            return b.getDate().compareTo(a.getDate());
        }
    }
    class SortbyVote implements Comparator<Post>
    {
        public int compare(Post a, Post b)
        {
            return b.getScore() - a.getScore();
        }
    }
    class SortbyCommentCount implements Comparator<Post>
    {
        public int compare(Post a, Post b)
        {
            return b.getCount()- a.getCount();
        }
    }
}
