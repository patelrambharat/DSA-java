package News_Feed_System.src.com.company.utils;

import News_Feed_System.src.com.company.Model.Post;

public class Score {

    public static int getScore(Post post1){

        return post1.getUpVote()-post1.getDownVote();
    }
    
}
