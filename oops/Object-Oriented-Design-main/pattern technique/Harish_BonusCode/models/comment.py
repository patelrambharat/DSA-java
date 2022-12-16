from datetime import datetime

class Postcomment:

    def __init__(self, id, comment, userId, postId) -> None:
        self.__id = id
        self.__userId = userId
        self.__postId = postId
        self.__comment = comment
        self.__upVote = 0
        self.__downVote = 0
        self.datetime = str(datetime.now())

    def getId(self):
        return self.__id

    def getComment(self):
        return self.__comment

    def getUpvote(self):
        return self.__upVote

    def getDownVote(self):
        return self.__downVote

    def getUserId(self):
        return self.__userId

    def getPostId(self):
        return self.__postId

    def updateUpVote(self):
        self.__upVote+=1
    
    def updateDownVote(self):
        self.__downVote+=1

    def getDate(self):
        return self.datetime