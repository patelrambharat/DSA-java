package News_Feed_System.src.com.company.Model;

import java.util.List;

public class Post {
    
    private int id;
    private int userId;
    private int upVote;
    private int downVote;
    private String timeStamp;
    private String content;
    private List<Comment> commentsList;
    private String author;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getTimeStamp() {
        return timeStamp;
    }
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public List<Comment> getCommentsList() {
        return commentsList;
    }
    public void setCommentsList(List<Comment> commentsList) {
        this.commentsList = commentsList;
    }
    public int getUpVote() {
        return this.upVote;
    }
    public void setUpVote() {
        this.upVote++;
    }
    public int getDownVote() {
        return this.downVote;
    }
    public void setDownVote() {
        this.downVote++;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    
    
}
