package com.company.Models;

import com.company.Util.IDGenerator;

import java.sql.Timestamp;
import java.util.*;

public class Post {

    private int postId;
    private int upvotes;
    private int downvotes;
    private int score;

    private int numberOfReplies;
    private String posteeUserName;
    private String postMessage;
    private Timestamp postTimestamp;
    private List<Reply> replies;

    public Post(){}

    public Post(String posteeUserName, String postMessage){
        this.posteeUserName = posteeUserName;
        this.postMessage = postMessage;
        setPostTimestamp();
        setPostId();
        upvotes = 0;
        downvotes = 0;
        score = 0;
        replies = new ArrayList<>();
        setNumberOfReplies(replies.size());
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId() {
        this.postId = IDGenerator.getId();
    }

    public int getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }

    public int getDownvotes() {
        return downvotes;
    }

    public void setDownvotes(int downvotes) {
        this.downvotes = downvotes;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getNumberOfReplies() {
        return numberOfReplies;
    }

    public void setNumberOfReplies(int numberOfReplies) {
        this.numberOfReplies = numberOfReplies;
    }

    public String getPosteeUserName() {
        return posteeUserName;
    }

    public void setPosteeUserName(String posteeUserName) {
        this.posteeUserName = posteeUserName;
    }

    public String getPostMessage() {
        return postMessage;
    }

    public void setPostMessage(String postMessage) {
        this.postMessage = postMessage;
    }

    public Timestamp getPostTimestamp() {
        return postTimestamp;
    }

    public void setPostTimestamp() {
        this.postTimestamp = new Timestamp(System.currentTimeMillis());
    }

    public List<Reply> getReplies() {
        return replies;
    }

    public void setReplies(List<Reply> replies) {
        this.replies = replies;
    }
}
