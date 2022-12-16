package com.company;

import com.company.Exception.InvalidDetailsException;
import com.company.Exception.NoPostFoundException;
import com.company.Exception.NoUserFoundException;
import com.company.Exception.UserAlreadyExistsException;
import com.company.Models.User;
import com.company.Services.UserService;

public class Driver {
    public static void main(String args[]){
        try{
            UserService userservice = UserService.getUserServiceInstance();

            User devang = userservice.resgisterUser("devang");
            User ramesh = userservice.resgisterUser("ramesh");
            User suresh = userservice.resgisterUser("suresh");

            userservice.userLogin(devang.getUserName());
            userservice.post(devang, "Hello!, I'm Devang. Nice to meet you!");


            userservice.userLogin("ramesh");
            userservice.post(ramesh, "Hi!, Myself Ramesh.");

            userservice.follow("devang","ramesh");

            userservice.upvote(5);

            userservice.downvote(4);

            userservice.reply("suresh",4, "Nice to meet you too!!!");

            userservice.userLogin(suresh.getUserName());
            userservice.upvote(5);

            userservice.userLogin(devang.getUserName());

        }catch(NoUserFoundException e){
            System.out.println("No User Found");
            e.printStackTrace();
        }catch(InvalidDetailsException e){
            System.out.println("You have entered Invalid details");
            e.printStackTrace();
        }catch(UserAlreadyExistsException e){
            System.out.println("User Already Exists");
            e.printStackTrace();
        }catch(NoPostFoundException e){
            System.out.println("No Post Found");
            e.printStackTrace();
        }
    }
}
