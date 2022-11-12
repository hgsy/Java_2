package work_1103_Project.work_7;

public class Point <K extends Number,V extends Number>{
    // 제네릭 클래스 1
    K x;
    V y;

    Point(K x, V y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x.doubleValue();
    }

    public double getY(){
        return this.y.doubleValue();
    }

}
