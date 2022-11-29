package work_1117;

public class Test {

    //내부 클래스 - Thread 상속받기
    class ThirdThread extends Thread {
        @Override
        public void run() {
            for (int i = 10; i >= 0; i--)
                System.out.print("C: " + i + "; ");
        }
    }

    //내부 클래스 - Runnable 구현
    class fourthThread implements Runnable {
        @Override
        public void run() {
            for (int i = 10; i >= 0; i--)
                System.out.print("D: " + i + "; ");
        }
    }

    //메인함수
    public static void main(String[] args) {
        Test t = new Test();

        //스레드1 A
        FirstThread th1 = new FirstThread();
        th1.setPriority(2);

        //스레드2 B
        SecondThread sec_thread = new SecondThread();
        Thread th2 = new Thread(sec_thread);
        th2.setPriority(6);

        //스레드3 C
        ThirdThread th3 = t.new ThirdThread();

        //스레드4 D
        Thread th4 = new Thread(t.new fourthThread());
        th4.setPriority(7);

        //스레드5 E
        Thread th5 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 10; i >= 0; i--)
                            System.out.print("E: " + i + "; ");
                    }
                }
        );
        th5.setPriority(1);

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
    }
}
