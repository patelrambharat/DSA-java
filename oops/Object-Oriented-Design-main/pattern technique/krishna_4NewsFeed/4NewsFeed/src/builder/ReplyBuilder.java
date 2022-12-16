package builder;

import models.Reply;
import utils.IdGenerator;

import java.util.Date;

public class ReplyBuilder {
    private Reply reply;
    private int replyId;
    private String userCommented;
    private String message;
    private Date date;

    public  ReplyBuilder() {
        this.reply = new Reply();
    }



    public ReplyBuilder setReplyId() {
        reply.setReplyId(IdGenerator.generateReplyId());
        return this;
    }

    public ReplyBuilder setUserCommented(String userCommented) {
       reply.setUserCommented(userCommented);
       return this;
    }

    public ReplyBuilder setMessage(String message) {
        reply.setMessage(message);
        return this;
    }

    public ReplyBuilder setDate() {
       reply.setDate(new Date());
       return this;
    }
    public Reply build(){
        return this.reply;
    }
}
