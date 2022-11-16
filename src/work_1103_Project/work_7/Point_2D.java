package work_1103_Project.work_7;

public class Point_2D <K extends Number, V extends Number> extends Point {

    Point_2D(K x, V y){
        super(x, y, 0);
    }

    public String toString()  {
        return "(" + this.x + ", " + this.y +  ")";
    }

}
