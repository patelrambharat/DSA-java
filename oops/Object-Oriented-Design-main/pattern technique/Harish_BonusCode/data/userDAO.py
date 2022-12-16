from typing import Dict
from models.user import User
from utils.idGenerator import idGenerator

class userDAO:

    # singletone pattern
    def __new__(cls):
        if not hasattr(cls, 'instance'):
            cls.instance = super(userDAO, cls).__new__(cls)
        return cls.instance

    def __init__(self) -> None:
        self.userMap = {}
        self.userNameMap = {}
        self.loggedInUser =None

    def registerUser(self, name, email, gender, phone) -> Dict:

        try:
            if name in self.userNameMap.keys():
                return self.userMap[self.userNameMap[name]]

            newUser = User(idGenerator.getId(), name, email, gender, phone)
            self.userNameMap[name] = newUser.getId()
            self.userMap[newUser.getId()] = newUser
            return {'status': True, 'response': newUser}

        except Exception as e:
            return {'status': False, 'response': str(e)}
    
    def logIn(self, name) -> Dict:

        if name not in self.userNameMap.keys():
            return {'status': False, 'response': "User Not Found"}

        return {'status': True, 'response': self.userNameMap[name]}

    def getUserById(self, id: int):
        return self.userMap[id]


