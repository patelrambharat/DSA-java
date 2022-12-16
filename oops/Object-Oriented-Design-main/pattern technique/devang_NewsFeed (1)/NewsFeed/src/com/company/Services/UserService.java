package com.company.Services;

import com.company.Dao.UserDao;
import com.company.Exception.InvalidDetailsException;
import com.company.Exception.NoPostFoundException;
import com.company.Exception.NoUserFoundException;
import com.company.Exception.UserAlreadyExistsException;
import com.company.Models.User;

public class UserService {

    private static UserService userServiceInstance = null;

    private UserService(){

    }

    UserDao userDao = UserDao.getInstance();

    public static UserService getUserServiceInstance(){
        if(userServiceInstance==null)
            userServiceInstance = new UserService();
        return userServiceInstance;
    }

    public User resgisterUser(String name) throws InvalidDetailsException, UserAlreadyExistsException {
        if(name==null)
            throw new InvalidDetailsException();
        return userDao.registerUser(name);
    }

    public User userLogin(String name) throws NoUserFoundException, InvalidDetailsException {
        if(name.isEmpty())
            throw new InvalidDetailsException();
        return userDao.userLogin(name);
    }

    public void follow(String userFollowing, String userBeingFollowed) throws InvalidDetailsException, NoUserFoundException {
        if(userFollowing.isEmpty() || userBeingFollowed.isEmpty())
            throw new InvalidDetailsException();
        userDao.follow(userFollowing, userBeingFollowed);
    }

    public void post(User userPosting, String postMessage) throws InvalidDetailsException, NoUserFoundException {
        if(userPosting==null || postMessage.isEmpty())
            throw new InvalidDetailsException();
        userDao.post(userPosting, postMessage);
    }

    public void upvote(int i) throws InvalidDetailsException, NoPostFoundException {
        if(i==0)
            throw new InvalidDetailsException();
        userDao.upvote(i);
    }

    public void downvote(int postId) throws InvalidDetailsException, NoPostFoundException {
        if(postId==0)
            throw new InvalidDetailsException();
        userDao.downvote(postId);
    }

    public void reply(String replyingUserName, int postId, String replyMessage) throws InvalidDetailsException, NoPostFoundException {
        if(replyingUserName.isEmpty() || postId==0 || replyMessage.isEmpty())
            throw new InvalidDetailsException();
        userDao.reply(replyingUserName, postId, replyMessage);
    }
}
