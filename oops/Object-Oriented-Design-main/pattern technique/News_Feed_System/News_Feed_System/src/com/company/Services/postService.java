package News_Feed_System.src.com.company.Services;

import News_Feed_System.src.com.company.Data.Dao;
import News_Feed_System.src.com.company.constants.Vote;
import News_Feed_System.src.com.company.exception.NoPostFoundException;
import News_Feed_System.src.com.company.exception.NoUserFoundException;

public class postService {
    
    public Dao userDao = Dao.getInstance();

    private static postService pService = null;


    public static postService getInstance() {
        if(pService==null) pService = new postService();

        return pService;
    }

    public void createPost(String text){

       if(text==""){
            System.out.println("Post cannot be empty!");
            return;
       }

       userDao.createPost( text);
    }
    public void reply(int postId,String text) throws NoUserFoundException{

        if(text==""){
            System.out.println("Comment cannot be empty!");
            return;
       }

       userDao.reply(postId, text);
    }

    public void vote(int postId,Vote voteType) throws NoPostFoundException{

       userDao.vote(postId, voteType);
    }
 
}
