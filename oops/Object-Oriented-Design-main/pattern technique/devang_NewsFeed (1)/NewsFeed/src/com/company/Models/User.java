package com.company.Models;

import com.company.Util.IDGenerator;

import java.util.*;

public class User {
    private int userId;
    private String userName;
    private List<User> followers;
    private List<User> followed;

    public User(){

    }

    public User(String name){
        this.userName = name;
        setUserId();
        this.followers = new ArrayList<>();
        this.followed = new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId() {
        this.userId = IDGenerator.getId();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }

    public List<User> getFollowed() {
        return followed;
    }

    public void setFollowed(List<User> followed) {
        this.followed = followed;
    }
}
