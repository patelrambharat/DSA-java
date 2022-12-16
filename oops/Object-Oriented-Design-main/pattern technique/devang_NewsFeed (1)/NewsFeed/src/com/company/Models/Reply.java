package com.company.Models;

import java.sql.Timestamp;
import java.util.*;
import com.company.Util.IDGenerator;

public class Reply {
    private int replyId;
    private String replyingUserName;
    private String replyMessage;
    private int postId;

    public Reply(){}

    public Reply(String replyingUserName, String replyMessage, int postId){
        this.postId = postId;
        this.replyMessage = replyMessage;
        this.replyingUserName = replyingUserName;
        setReplyTimestamp();
    }

    private Timestamp replyTimestamp;

    public int getReplyId() {
        return replyId;
    }

    public void setReplyId() {
        this.replyId = IDGenerator.getId();
    }

    public String getReplyingUserName() {
        return replyingUserName;
    }

    public void setReplyingUserName(String replyingUserName) {
        this.replyingUserName = replyingUserName;
    }

    public String getReplyMessage() {
        return replyMessage;
    }

    public void setReplyMessage(String replyMessage) {
        this.replyMessage = replyMessage;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public Timestamp getReplyTimestamp() {
        return replyTimestamp;
    }

    public void setReplyTimestamp() {
        this.replyTimestamp = new Timestamp(System.currentTimeMillis());
    }
}
