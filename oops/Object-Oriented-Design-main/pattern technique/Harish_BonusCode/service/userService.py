from data.userDAO import userDAO
from models.user import User


class UserService:
    
    # singletone pattern
    def __new__(cls):
        if not hasattr(cls, 'instance'):
            cls.instance = super(UserService, cls).__new__(cls)
        return cls.instance

    def __init__(self) -> None:
        self.user = userDAO()

    def registerUser(self, name: str, email: str = "", gender: str = "", phone: str = ""):
        
        if name == "":
            return {'status': False, 'response': "Name is required."}

        newUser = self.user.registerUser(name, email, gender, phone)

        if newUser['status']:
            return newUser['response']
        else:
            return None


    def logIn(self, name: str):

        if name == "":
            return {'status': False, 'response': "Name is required."}
        
        logInUser = self.user.logIn(name)

        if logInUser['status']:
            return logInUser['response']
        else:
            return None

