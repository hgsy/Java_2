package Kw_work.work_2;

public class LoginExample {
    public static void main(String[] args) {
        try {
            login("white", 12345);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            login("blue", 54321);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void login(String id, int password) throws NotExistIDException, WrongPasswordException {
        //id가 blue가 아니라면 NotExistIDException 발생시킴
        if(!id.equals("blue")){
            throw (new NotExistIDException("NotExistIDException"));
        }

        //password가 12345가 아니라면 WrongPasswordException 발생시킴
        if(password!=12345){
            throw (new WrongPasswordException("WrongPasswordException"));
        }
    }
}
