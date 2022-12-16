package com.company.Models;

import java.util.*;

public class Follow {
    private int followeeUserId;
    private int followedUserId;

    public Follow(Integer userFollowing, Integer userBeingFollowed) {
        followedUserId = userFollowing;
        followedUserId = userBeingFollowed;
    }

    public int getFolloweeUserId() {
        return followeeUserId;
    }

    public void setFolloweeUserId(int followeeUserId) {
        this.followeeUserId = followeeUserId;
    }

    public int getFollowedUserId() {
        return followedUserId;
    }

    public void setFollowedUserId(int followedUserId) {
        this.followedUserId = followedUserId;
    }
}
