package exception;

public class UserNotFoundException extends Exception{
    public UserNotFoundException(){
        super("user does not exists, please register");
    }
}
