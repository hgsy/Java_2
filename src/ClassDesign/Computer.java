package ClassDesign;

public class Computer {

    private static int count = 0;
    private double over_ = 1.2;
    private boolean over = false;

    private int core;
    private double cpu_speed;   //GHz
    private int gpu_speed;  //MHz

    Computer(){
        this(4, 3.2, 1000);
    }

    Computer(int core){
        this(core, 3.2, 1000);
    }

    Computer(int core, double cpu_speed){
        this(core, cpu_speed, 1000);
    }
    Computer(int core, double cpu_speed, int gpu_speed){
        this.core = core;
        this.cpu_speed = cpu_speed;
        this.gpu_speed = gpu_speed;
        count++;
    }

    public static void printComputerCount(){
        System.out.println(count);
    }

    public double getCPUSPEED(){
        return this.cpu_speed;
    }

    public int getGPUSPEED(){
        return this.gpu_speed;
    }

    public int getCORE(){
        return this.core;
    }

    public void overClocking(boolean over){
        if (over==true&&this.over==false){
            this.over = true;
            this.cpu_speed *= this.over_;
            this.gpu_speed *= this.over_;
            System.out.println("===============");
            System.out.println("OverClocking ON");
            System.out.println("===============");

        }else if(over==true&&this.over==true){
            System.out.println("Already Running");

        }else {
            this.over = true;
            this.cpu_speed /= this.over_;
            this.gpu_speed /= this.over_;
            System.out.println("===============");
            System.out.println("OverClocking OFF");
            System.out.println("===============");
        }
    }

    public void printINFO(){
        System.out.println("====================");
        System.out.println("CPU CORE : " + this.core);
        System.out.println("CPU SPEED : " + this.cpu_speed);
        System.out.println("GPU SPEED : " + this.gpu_speed);
        System.out.println("====================");
    }

    public static void speedCompare(Computer c1, Computer c2){
        String winner;
        if(c1.getCPUSPEED()>c2.getCPUSPEED()){
            winner = "c1 Win";
        } else if (c1.getCPUSPEED()<c2.getCPUSPEED()) {
            winner = "c2 Win";
        } else{
            winner = "Same Speed";
        }

        System.out.println(winner);
    }

}
