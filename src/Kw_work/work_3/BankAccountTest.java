package Kw_work.work_3;

public class BankAccountTest {
    public static void main(String []args){
        BankAccount b1 = new BankAccount();
        //초기 잔액 = 0;

        System.out.println(b1.deposit(10000));
        System.out.println(b1.withdraw(1000));
        System.out.println(b1.withdraw(10000));
    }
}
