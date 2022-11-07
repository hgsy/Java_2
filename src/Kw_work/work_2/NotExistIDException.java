package Kw_work.work_2;

public class NotExistIDException extends Exception{
    public NotExistIDException(String message){
        super(message);
    }
}

class WrongPasswordException extends Exception{
    public WrongPasswordException(String message){
        super(message);
    }
}