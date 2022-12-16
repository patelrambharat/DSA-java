package News_Feed_System.src.com.company.utils;

public class IDgenerator {
    private  static  int userId=0;
    private  static  int postId=0;
    private  static  int commentId=0;

    public static int getId(String type) {
        
        if(type=="user"){
            userId++;
            return userId;
        }

        
        else if(type=="post"){
            postId++;
            return postId;
        }

        
        else {
            commentId++;
            return commentId;
        }
    }

}