package utils;

public class IdGenerator {
    public static int userId = 0;
    public static int newsId = 0;
    public static int replyId = 0;
    public static int generateUserId(){
        userId++;
        return userId;
    }
    public static int generateNewsId(){
        newsId++;
        return newsId;
    }
    public static int generateReplyId(){
        replyId++;
        return replyId;
    }
}
