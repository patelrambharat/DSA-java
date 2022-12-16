package models;

import java.util.ArrayList;
import java.util.Date;

public class Post {
    private int postId;
    private int upVotes;
    private int downVote;
    private String userName;
    private String message;
    private Date date;
    private int score;
    private int commentCcount;

    public int getScore() {
        return upVotes - downVote;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getCount() {
        return commentCcount;
    }

    public void setCount() {
        this.commentCcount = this.commentCcount + 1;
    }

    public void setScore() {
        this.score = upVotes - downVote;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getUpVotes() {
        return upVotes;
    }

    public void setUpVotes(int upVotes) {
        this.upVotes = upVotes;
    }

    public int getDownVote() {
        return downVote;
    }

    public void setDownVote(int downVote) {
        this.downVote = downVote;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
