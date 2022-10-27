package ClassDesign;

public class ComputerTest {
    public static void main(String[] args){
        Computer c1 = new Computer(4, 4.0, 3000);
        Computer c2 = new Computer(4, 4.0, 3000);

        Computer.printComputerCount();

        c1.printINFO();
        c2.printINFO();
        Computer.speedCompare(c1, c2);

        c1.overClocking(true);

        c1.printINFO();
        c2.printINFO();
        Computer.speedCompare(c1, c2);

        c1.overClocking(false);

        System.out.println("CPU CORE : " + c1.getCORE());
        System.out.println("CPU SPEED : " + c1.getCPUSPEED());
        System.out.println("GPU SPEED : " + c1.getGPUSPEED());

        c1.printINFO();
        c2.printINFO();
        Computer.speedCompare(c1, c2);

    }


}
