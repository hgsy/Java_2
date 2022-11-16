package work_1103_Project.work_7;

public class Point <K extends Number,V extends Number, T extends Number> {

    K x;
    V y;
    T z;

    Point(K x, V y, T z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX(){
        return this.x.doubleValue();
    }

    public double getY(){
        return this.y.doubleValue();
    }

    public double getZ() {
        return this.z.doubleValue();
    }

    public <G extends Number> void printCdn(){
        System.out.println("(" + this.x + ", " + this.y + ", " + this.z + ")");
    }

    public String toString()  {
        return "(" + this.x.doubleValue() + ", " + this.y.doubleValue() + ", " + this.z.doubleValue() + ")";
    }

}
