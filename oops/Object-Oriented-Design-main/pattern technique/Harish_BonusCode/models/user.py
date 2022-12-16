from models.post import UserPost


class User:

    def __init__(self, id, name, email, gender, phone) -> None:
        self.__id = id
        self.__name = name
        self.__email = email
        self.__phone = phone
        self.__gender = gender
        self.__posts = []

    def getId(self):
        return self.__id

    def getName(self):
        return self.__name

    def getPosts(self):
        return self.__posts

    def modifyPosts(self, posts):
        self.__posts = posts
        return 

    def addPost(self, post: UserPost):
        self.__posts.insert(0, post)
