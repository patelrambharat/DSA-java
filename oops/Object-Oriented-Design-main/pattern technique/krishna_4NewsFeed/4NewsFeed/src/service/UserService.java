package service;

import dao.Dao;
import exception.UserAlreadyExistsException;
import exception.UserNotFoundException;
public class UserService {
    private static UserService instance = null;
    private Dao dao = null;
    private UserService(){
        dao = Dao.getInstance();
    }
    private FeedService feedService = FeedService.getInstance();
    synchronized public static UserService getInstance(){
        if(instance == null){
            instance = new UserService();
        }
        return  instance;
    }
    public void registerUser(String name) throws UserAlreadyExistsException {
        if(name.isEmpty()){
            System.out.println("name field can't be empty");
        }
        if(dao.existUser(name)){
            throw new UserAlreadyExistsException();
        }
        dao.createUser(name);
    }
    public void login(String name) throws UserNotFoundException {
        if(name.isEmpty()){
            System.out.println("Name field can't be empty");
        }
        if(!dao.existUser(name)){
            throw new UserNotFoundException();
        }
        dao.login(name);
        showPost();
    }

    private void showPost(){
        feedService.showNewsFeed();
    }

    public void follow(String sushma) {
        dao.follow(sushma);
    }

    public void replyOnPost(int postId, String comment) {
        dao.replyOnPost(postId, comment);
    }

}
