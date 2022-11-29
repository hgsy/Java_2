package work_1103_Project.work_7;

public class Point_2D<K extends Number, V extends Number> extends Point{
    //제네릭 클래스 2 :: x, y 좌표 평면 클래스

    Point_2D(K x, V y){
        super(x, y, 0);
    }

    public String toString()  {
        return "( " + this.x.doubleValue() + ", " + this.y.doubleValue() + " )";
    }

}
