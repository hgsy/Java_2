package Kw_work.work_3;

public class BankAccount {
    private int balance = 0;

    public int deposit(int amount){
        this.balance += amount;
        return this.balance;
    }

    public int withdraw(int amount) {
        try{
            if((this.balance - amount) < 0){
                throw new NegativeBalanceException("잔고가 음수입니다.");
            }

            this.balance -= amount;
            return this.balance;

        }catch (NegativeBalanceException e){

            System.out.println("잔고가 음수입니다.");
            return this.balance;

        }
    }

}

class NegativeBalanceException extends Exception{
    NegativeBalanceException(String message){
        super(message);
    }
}

