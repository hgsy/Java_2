package work_1117;

public class FirstThread extends Thread{
    @Override
    public void run() {
        for (int i = 10; i >= 0; i--)
            System.out.print("A: "+i + "; ");
    }
}

