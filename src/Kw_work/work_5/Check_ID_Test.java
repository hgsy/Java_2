package Kw_work.work_5;
import java.util.Scanner;


public class Check_ID_Test {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        Check_ID c = new Check_ID();

        System.out.println("아이디를 입력하세요");
        String id = s.next();
        try{
            c.checkID(id);
        }catch (NotUseld e){
            System.out.println(id + "는 사용할 수 없는 아이디");
        }

    }
}
