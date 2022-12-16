package models;

import java.util.ArrayList;

public class User {
    private int userId;
    private String name;
    private ArrayList<User> following;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<User> getFollowing() {
        return following;
    }

    public void setFollowing(ArrayList following) {
        this.following = following;
    }


}
