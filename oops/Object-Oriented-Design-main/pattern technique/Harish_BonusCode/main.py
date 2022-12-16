from service.userService import UserService
from service.postService import PostService

class Main:

    def __init__(self) -> None:
        self.user = UserService()
        self.post = PostService()

    def userActions(self, name: str):
        user = None
        if 'signup~' in name:
            name = name.replace('signup~', '')
            user = self.user.registerUser(name)
            print('User Registered...................')

        elif 'login~' in name:
            name = name.replace('login~', '')
            user = self.user.logIn(name)
            if user is None:
                print("User Not Found..................")
                return

        return user

    def run(self):

        name = "signup~Harish"
        user = self.userActions(name)
        name = "login~Harish"
        user = self.userActions(name)

        if user is not None:

            userPost1 = self.post.addPost("First Feed", user)
            userPost2 = self.post.addPost("Second Feed", user)

            print("\n\n---------------------- Posts ----------------------\n\n")
            allPosts = self.post.getAllPosts()
            for post in allPosts:
                print(post)

            comment1 = self.post.addCommentInPost(user, userPost2, "comment1.........")
            comment1 = self.post.addCommentInPost(user, userPost2, "comment2.........")

            print("\n\n---------------------- Comments ----------------------\n\n")
            comments = self.post.getAllCommentOfPost(userPost2)
            for comment in comments:
                print(comment)

            print("\n\n---------------------- upVote in Comment and Post ----------------------\n\n")
            print(self.post.upVotePost(userPost2, user))
            print(self.post.upVoteComment(4, userPost2))
            
            print("\n\n---------------------- Posts ----------------------\n\n")
            allPosts = self.post.getAllPosts()
            for post in allPosts:
                print(post)

            print("\n\n---------------------- Comments ----------------------\n\n")
            comments = self.post.getAllCommentOfPost(userPost2)
            for comment in comments:
                print(comment)

            print("\n\n---------------------- downVote in Comment and Post ----------------------\n\n")
            print(self.post.downVotePost(userPost2, user))
            print(self.post.downVoteComment(4, userPost2))
            
            print("\n\n---------------------- Posts ----------------------\n\n")
            allPosts = self.post.getAllPosts()
            for post in allPosts:
                print(post)

            print("\n\n---------------------- Comments ----------------------\n\n")
            comments = self.post.getAllCommentOfPost(userPost2)
            for comment in comments:
                print(comment)
            
            print("\n---------------------- Comments Reply ----------------------\n")
            self.post.addReplyOnComment(4, user, "reply1..............")
            print("reply done........")

            print("\n\n---------------------- Comments After reply ----------------------\n\n")
            comments = self.post.getAllCommentOfPost(userPost2)
            for comment in comments:
                print(comment)

        user2 = self.userActions("signup~Tony")
        user2 = self.userActions("login~Tony")

        if user2 is not None:

            userPost3 = self.post.addPost("First Feed", user2)

            print("\n\n---------------------- Posts ----------------------\n\n")
            allPosts = self.post.getAllPosts()
            for post in allPosts:
                print(post)
        

if __name__ == "__main__":

    main = Main()
    main.run()
