import service.FeedService;
import service.UserService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Execution started");
        UserService userService = UserService.getInstance();
        FeedService feedService = FeedService.getInstance();
        //register lucious
        try {
            userService.registerUser("lucious");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        //register albus
        try {
            userService.registerUser("albus");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        //register tom
        try {
            userService.registerUser("tom");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        //logging in tom
        try {
            userService.login("tom");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        //posting the post
        feedService.post("I am going to be the darkest dark wizard of all time ");
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        feedService.post("I am lord Voldemort btw 3:)");
        //logging in lucious
        try {
            userService.login("lucious");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        //upvoting the post id 1
        feedService.upvote(1);
        //following tom
        userService.follow("tom");
        // replying on post id 001
        userService.replyOnPost(1, "I am with you dark lord!");
        //logging in albus
        try {
            userService.login("albus");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        feedService.post("Happiness can be found, even in the darkest of times, if one only remembers to turn on the light");
        userService.follow("tom");
        feedService.downvote(1);
        feedService.downvote(2);
        userService.replyOnPost(2, "LOL!");
        feedService.showNewsFeed();




    }
}