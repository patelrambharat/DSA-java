package dao;

import builder.PostBuilder;
import builder.ReplyBuilder;
import builder.UserBuilder;
import models.Post;
import models.Reply;
import models.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Dao {
    private static Dao instance = null;
    private HashMap<String, User> userHashMap;
    private ArrayList<Post> postList;
    private HashMap<Integer, Post> postHashMap;
    private HashMap<Integer, ArrayList<Reply>> postReplyHashMap;

    private User loggedInUser = null;
    private Dao(){
        userHashMap = new HashMap<>();
        postList = new ArrayList<>();
        postHashMap = new HashMap<>();
        postReplyHashMap = new HashMap<>();
    }

    public synchronized static Dao getInstance() {
        if (instance == null) {
            instance = new Dao();
        }
        return instance;
    }

    public void createUser(String name) {
        UserBuilder userBuilder = new UserBuilder();
        User user = userBuilder
                .setUserId()
                .setFollowing()
                .setName(name).build();
        userHashMap.put(name, user);
    }
    public boolean existUser(String name){
        if(userHashMap.containsKey(name)){
            return true;
        }
        return false;
    }

    public void post(String message) {
        PostBuilder postBuilder = new PostBuilder();
        Post post = postBuilder
                .setPostId()
                .setDate()
                .setDownVote()
                .setUpVotes()
                .setMessage(message)
                .setUserName(loggedInUser.getName())
                .setScore()
                .build();
        postList.add(post);
        postHashMap.put(post.getPostId(), post);
        postReplyHashMap.put(post.getPostId(), new ArrayList<Reply>());
    }
    public ArrayList<Post> showPost(){
        return postList;
    }

    public void login(String name) {
        loggedInUser = userHashMap.get(name);
    }

    public void upVote(int postId) {
        Post post = postHashMap.get(postId);
        post.setUpVotes(post.getUpVotes() + 1);
    }
    public void downVote(int postId) {
        Post post = postHashMap.get(postId);
        post.setDownVote(post.getDownVote() + 1);
    }

    public void follow(String userToBeFollowed) {
        loggedInUser.getFollowing().add(userHashMap.get(userToBeFollowed));
    }

    public void replyOnPost(int postId, String comment) {
        ReplyBuilder replyBuilder = new ReplyBuilder();
        Reply reply = replyBuilder
                .setMessage(comment)
                .setReplyId()
                .setDate()
                .setUserCommented(loggedInUser.getName())
                .build();
        postReplyHashMap.get(postId).add(reply);
        postHashMap.get(postId).setCount();
    }

    public ArrayList<Reply> getReplyList(int postId) {
        return postReplyHashMap.get(postId);
    }
/*
    public ArrayList<Post> getFollowedUserPost(){
        ArrayList<Post> followerUserPost = new ArrayList<>();
        ArrayList<User> followedUser = loggedInUser.getFollowing();
        for(int i = 0 ; i < postList.size() ; i++){
            Post post = postList.get(i);
            for(int j = 0 ; j < followedUser.size(); j++){
                if(post.getUserName() == followedUser.get(j).getName()){
                   followerUserPost.add(post);
                }
            }
        }
        return followerUserPost;
    }
    public ArrayList<Post> getUnFollowedUserPost(){
        ArrayList<Post> unFollowerUserPost = new ArrayList<>();
        ArrayList<User> followedUser = loggedInUser.getFollowing();
        for(int i = 0 ; i < postList.size() ; i++){
            Post post = postList.get(i);
            for(int j = 0 ; j < followedUser.size(); j++){
                if(!Objects.equals(post.getUserName(), followedUser.get(j).getName())){
                    unFollowerUserPost.add(post);
                }
            }
        }
        return unFollowerUserPost;
    }


 */

}

