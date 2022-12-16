package builder;

import models.Post;
import utils.IdGenerator;

import java.util.Date;

public class PostBuilder {

    private Post post;
    public PostBuilder(){
        post = new Post();
    }

    public PostBuilder setPostId() {
        post.setPostId(IdGenerator.generateNewsId());
        return this;
    }

    public PostBuilder setUpVotes() {
        post.setUpVotes(0);
        return this;
    }

    public PostBuilder setDownVote() {
        post.setDownVote(0);
        return this;
    }

    public PostBuilder setUserName(String userName) {
        post.setUserName(userName);
        return this;
    }

    public PostBuilder setMessage(String message) {
        post.setMessage(message);
        return this;
    }

    public PostBuilder setDate() {
        post.setDate(new Date());
        return this;
    }

    public Post build(){
        return this.post;
    }

    public PostBuilder setScore() {
        post.setScore();
        return this;
    }
}
