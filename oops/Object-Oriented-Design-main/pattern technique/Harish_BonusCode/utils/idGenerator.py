Id=0

class idGenerator:

    # singletone pattern
    def __new__(cls):
        if not hasattr(cls, 'instance'):
            cls.instance = super(idGenerator, cls).__new__(cls)
        return cls.instance

    def getId():
        global Id
        newId = Id + 1
        Id = newId
        return newId

