from models.user import User
from data.postDAO import postDAO
from data.userDAO import userDAO
from models.comment import Postcomment

class PostService:

    # singletone pattern
    def __new__(cls):
        if not hasattr(cls, 'instance'):
            cls.instance = super(PostService, cls).__new__(cls)
        return cls.instance

    def __init__(self) -> None:
        self.post = postDAO()
        self.user = userDAO()

    def addPost(self, data: str, userId: int):
        if data == "":
            return "Please add some data for Your Feed"
        
        return self.post.addPost(data, self.user.getUserById(userId))

    def getAllPosts(self):
        return self.post.getAllPosts()

    def addCommentInPost(self, user: User, postId: int, comment: str):
        comment = self.post.addCommentToPost(self.user.getUserById(user), self.post.getPostById(postId), comment)
        if comment['status']:
            return comment['response']
        else:
            return None

    def addReplyOnComment(self, comment: Postcomment, user: User, reply: str):
        comment = self.post.addReplyToComment(comment, user, reply)
        if comment['status']:
            return comment['response']
        else:
            return None

    def getAllCommentOfPost(self, postId: int):
        posts = self.post.getAllcomments(self.post.getPostById(postId))
        if posts is None:
            return []
        return posts

    def upVotePost(self, postId: int, userId: int):
        self.post.upVoteUserPost(self.post.getPostById(postId), self.user.getUserById(userId))
        return "upvote done"

    def downVotePost(self, postId: int, userId: int):
        self.post.downVoteUserPost(self.post.getPostById(postId), self.user.getUserById(userId))
        return "upvote done"

    def upVoteComment(self, commentId: int, postId: int):
        self.post.upVotePostComment(self.post.getCommentById(commentId), self.post.getPostById(postId))
        return "upvote done"

    def downVoteComment(self, commentId: int, postId: int):
        self.post.downVotePostComment(self.post.getCommentById(commentId), self.post.getPostById(postId))
        return "upvote done"