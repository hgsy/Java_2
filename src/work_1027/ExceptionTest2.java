package work_1027;

class Mydate {
    int year = 2035;
    int month = 12;
    int day =25;
}

public class ExceptionTest2 {
    public static void main(String args[]) {
        Mydate d = null;
        try{
            System.out.printf("%d %d %d \n", d.year, d.month, d.day);
        }catch (NullPointerException e){
            System.out.println("NullPointerException");
        }
    }
}