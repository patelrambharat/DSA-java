from models.user import User
from models.post import UserPost
from models.comment import Postcomment
from utils.idGenerator import idGenerator

class postDAO:

    # singletone pattern
    def __new__(cls):
        if not hasattr(cls, 'instance'):
            cls.instance = super(postDAO, cls).__new__(cls)
        return cls.instance

    def __init__(self) -> None:
        self.commentMap = {}
        self.replyMap = {}
        self.userPostMap = {}

    def addPost(self, data: str, userData: User):
        newPost = UserPost(idGenerator.getId(), userData.getId(), data)
        if userData in self.userPostMap.keys():
            self.userPostMap[userData][newPost] = {
                'id': newPost.getId(),
                'Feed': newPost.getData(),
                'postBy': userData.getName(),
                'upVote': newPost.getUpvote(),
                'downVote': newPost.getDownVote(),
                'datetime': newPost.getDate()
            }
        else:
            self.userPostMap[userData] = {
                newPost: {
                    'id': newPost.getId(),
                    'Feed': newPost.getData(),
                    'postBy': userData.getName(),
                    'upVote': newPost.getUpvote(),
                    'downVote': newPost.getDownVote(),
                    'datetime': newPost.getDate()
                }
            }

        return newPost.getId()

    def getPostById(self, id: int) -> UserPost:
        users = self.userPostMap

        for userObject in users:
            posts = self.userPostMap[userObject]
            for postObject in posts:
                if postObject.getId() == id:
                    return postObject

    def getAllPosts(self):
        users = self.userPostMap
        response = []

        for userObject in users:
            posts = self.userPostMap[userObject]
            for postObject in posts:
                response.append(posts[postObject])
            # response.insert(0, post[key])

        return response

    def addCommentToPost(self, userData: User, postData: UserPost, comment: str) -> dict:

        try:
            newComment = Postcomment(idGenerator.getId(), comment, userData.getId(), postData.getId())
            if postData in self.commentMap.keys():
                self.commentMap[postData][newComment] = {
                    'id': newComment.getId(),
                    'comment': newComment.getComment(), 
                    'commentBy': userData.getName(),
                    'upVote': newComment.getUpvote(),
                    'downVote': newComment.getDownVote(),
                    'datetime': newComment.getDate()
                }
            else:
                self.commentMap[postData] = {newComment: {
                    'id': newComment.getId(),
                    'comment': newComment.getComment(), 
                    'commentBy': userData.getName(),
                    'upVote': newComment.getUpvote(),
                    'downVote': newComment.getDownVote(),
                    'datetime': newComment.getDate()
                }}

            return {'status': True, 'response': newComment}

        except Exception as e:
            return {'status': False, 'response': None}

    def getAllcomments(self, postData: UserPost) -> dict:
        
        if postData in self.commentMap.keys():
            comments = []
            for commentObject in self.commentMap[postData]:
                comment = self.commentMap[postData][commentObject]
                if commentObject in self.replyMap.keys():
                    comment['reply'] = self.replyMap[commentObject]
                else:
                    comment['reply'] = {}

                comments.append(comment)

            return comments
        return None

    def getCommentById(self, id: int):
        
        for postObject in self.commentMap:
            commentObject = self.commentMap[postObject]
            for object in  commentObject:
                if object.getId() == id:
                    return object

    def addReplyToComment(self, commentData: Postcomment, userData: User, reply: str):
        try:
            newReply = Postcomment(idGenerator.getId(), reply, userData.getId(), commentData.getId())
            if commentData in self.replyMap.keys():
                self.replyMap[commentData][newReply.getId()] = {
                    'id': newReply.getId(),
                    'comment': newReply.getComment(), 
                    'commentBy': userData.getName(),
                    'upVote': newReply.getUpvote(),
                    'downVote': newReply.getDownVote(),
                    'datetime': newReply.getDate()
                }
            else:
                self.replyMap[commentData] = {newReply.getId(): {
                    'id': newReply.getId(),
                    'comment': newReply.getComment(), 
                    'commentBy': userData.getName(),
                    'upVote': newReply.getUpvote(),
                    'downVote': newReply.getDownVote(),
                    'datetime': newReply.getDate()
                }}

            return {'status': True, 'response': None}

        except Exception as e:
            return {'status': False, 'response': str(e)}
    
    def upVoteUserPost(self, postData: UserPost, user: User):
        postData.updateUpVote()
        posts =self.userPostMap[user]
        postFound = False
        for post in posts:
            if postData == post:
                postFound = True
                posts[postData]['upVote'] = postData.getUpvote()

        if postFound:
            # user.modifyPosts(posts)
            self.userPostMap[user] = posts
            return

        else:
            return False

    def downVoteUserPost(self, postData: UserPost, user: User):
        postData.updateDownVote()
        posts = user.getPosts()
        postFound = False
        for post in posts:
            if postData in post.keys():
                postFound = True
                post[postData]['downVote'] = postData.getDownVote()

        if postFound:
            user.modifyPosts(posts)
            return True

        else:
            return False

    def upVotePostComment(self, commentData: Postcomment, post: UserPost):
        commentData.updateUpVote()
        self.commentMap[post][commentData]['upVote'] = commentData.getUpvote()
        return

    def downVotePostComment(self, commentData: Postcomment, post: UserPost):
        commentData.updateDownVote()
        self.commentMap[post][commentData]['downVote'] = commentData.getDownVote()
        return

