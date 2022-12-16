package models;

import java.util.Date;

public class Reply {
    private int replyId;
    private String userCommented;
    private String message;
    private Date date;

    public int getReplyId() {
        return replyId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }

    public String getUserCommented() {
        return userCommented;
    }

    public void setUserCommented(String userCommented) {
        this.userCommented = userCommented;
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
