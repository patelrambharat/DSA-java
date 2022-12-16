package exception;// A Class that represents use-defined exception

public class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException()
    {
        // Call constructor of parent Exception
        super("user not found, please signup");
    }
}


