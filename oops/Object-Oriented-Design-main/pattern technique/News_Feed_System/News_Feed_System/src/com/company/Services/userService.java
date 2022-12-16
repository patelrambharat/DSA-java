package News_Feed_System.src.com.company.Services;

import java.util.List;

import News_Feed_System.src.com.company.Data.Dao;
import News_Feed_System.src.com.company.Model.Post;
import News_Feed_System.src.com.company.constants.Gender;
import News_Feed_System.src.com.company.exception.NoUserFoundException;

public class userService {
    
    public Dao userDao = Dao.getInstance();
    
    private static userService uService = null;


    public static userService getInstance() {
        if(uService==null) uService = new userService();

        return uService;
    }

    public void registerUser(String username,String phoneNo,int age,
    Gender male){

        if(username==""){
            System.out.println("Username cannot be empty!");
            return;
        }

        if(phoneNo.length()!=10){
            System.out.println("Phone no. should have 10 digits");
            return;
        }

        userDao.registerUser(username,phoneNo,age,male);
    }

    public void loginUser(String username) throws NoUserFoundException{

        if(username==""){
            System.out.println("Username cannot be blank!");
            return;
        }

        userDao.loginUser(username);
    }

    public void followUser(String username) throws NoUserFoundException{

        if(username==""){
            System.out.println("Username cannot be blank!");
            return;
        }

        userDao.followUser(username);
        
    }

    public List<Post> showNewsFeed(){
        
        return userDao.showNewsFeed();
    }

}
