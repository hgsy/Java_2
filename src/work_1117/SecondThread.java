package work_1117;

public class SecondThread implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i >= 0; i--)
            System.out.print("B: " + i + "; ");
    }
}

