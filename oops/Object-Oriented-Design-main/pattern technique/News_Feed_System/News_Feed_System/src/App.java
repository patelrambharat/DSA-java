package News_Feed_System.src;
import News_Feed_System.src.com.company.Services.postService;
import News_Feed_System.src.com.company.Services.userService;
import News_Feed_System.src.com.company.constants.Gender;
import News_Feed_System.src.com.company.constants.Vote;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("\n");

        userService uService = userService.getInstance();
        postService pService = postService.getInstance();

        System.out.println("Registering new users");

        uService.registerUser("lorem", "1234567893",
         34, Gender.MALE);

         uService.registerUser("camel", "8834567895",
         34, Gender.FEMALE);

         uService.registerUser("Aman", "8834317895",
         24, Gender.FEMALE);

        //  logging in as 1st user
         uService.loginUser("lorem");

        //  creating post
         pService.createPost("Dummy Post! yaay!!");

         // logging in as 2nd user
         uService.loginUser("camel");

         // 2nd user followed 1st user
         uService.followUser("lorem");
         
         uService.loginUser("Aman");
         
         pService.vote(1, Vote.DOWNVOTE);
         
         pService.createPost("Just joined Connect+ !!");
         
         uService.loginUser("camel");
         uService.followUser("Aman");

         pService.createPost("my first post! wowww!!!");

         uService.loginUser("lorem");

         pService.vote(3,Vote.UPVOTE);

         uService.loginUser("Aman");

         pService.vote(3, Vote.UPVOTE);
         
         uService.registerUser("James", "8831417895",
         15, Gender.MALE);

         uService.registerUser("Ram", "8834329895",
         54, Gender.FEMALE);

        uService.loginUser("James");

        uService.followUser("Aman");

        pService.reply(2, "Welcome broooo!");

        uService.loginUser("camel");
        
         // show feed for current logged in user
         uService.showNewsFeed();
    }
}
