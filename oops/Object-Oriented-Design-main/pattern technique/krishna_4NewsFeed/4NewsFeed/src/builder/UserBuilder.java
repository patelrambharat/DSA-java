package builder;

import models.User;
import utils.IdGenerator;

import java.util.ArrayList;

public class UserBuilder {
    private User user;
    public UserBuilder() {
        user = new User();
    }

    public UserBuilder setUserId() {
        user.setUserId(IdGenerator.generateUserId());
        return this;
    }

    public UserBuilder setName(String name) {
        user.setName(name);
        return this;
    }




    public UserBuilder setFollowing() {
        user.setFollowing(new ArrayList<User>());
        return this;
    }

    public User build() {
        return user;
    }



}
