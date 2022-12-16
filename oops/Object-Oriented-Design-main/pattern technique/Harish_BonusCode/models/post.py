from datetime import datetime

class UserPost:

    def __init__(self, id, userId, data) -> None:
        self.__id = id
        self.__data = data
        self.__userId = userId
        self.__upVote = 0
        self.__downVote = 0
        self.datetime = str(datetime.now())

    def getId(self):
        return self.__id

    def getData(self):
        return self.__data

    def getUpvote(self):
        return self.__upVote

    def getDownVote(self):
        return self.__downVote

    def getUserId(self):
        return self.__userId

    def getDate(self):
        return self.datetime

    def updateUpVote(self):
        self.__upVote+=1
    
    def updateDownVote(self):
        self.__downVote+=1

