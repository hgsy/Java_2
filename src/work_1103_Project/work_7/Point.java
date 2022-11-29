package work_1103_Project.work_7;

public class Point <K extends Number,V extends Number, T extends Number> {
    //제네릭 클래스 1 + 제네릭 메소드 :: x, y, z 좌표 공간 클래스

    K x;
    V y;
    T z;

    int num;

    static int cnt = 1;

    Point(K x, V y, T z){
        this.x = x;
        this.y = y;
        this.z = z;
        int num = cnt;
        cnt ++;
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

    public int getNum(){
        return this.num;
    }

    public String toString()  {
        return "(" + this.x.doubleValue() + ", " + this.y.doubleValue() + ", " + this.z.doubleValue() + ")";
    }

    public static <T extends Point> Point convertPoint(T point){
        // 공간 - 평면 좌표 변환 메소드
        if(point.getClass().getSimpleName().equals("Point")){
            Point_2D tempPoint = new Point_2D(point.getX(), point.getY());
            return tempPoint;
        } else {
            Point tempPoint = new Point(point.getX(), point.getY(),0);
            return tempPoint;
        }

    }

    public static Point convertPoint(Point point, String xyz){
        // 공간 - 평면 좌표 변환 메소드 - 특정 축 제거
        if(xyz.equals("x")){
            Point tempPoint = new Point(0, point.getY(), point.getZ());
            return tempPoint;
        } else if (xyz.equals("y")) {
            Point tempPoint = new Point(point.getX(), 0,point.getZ());
            return tempPoint;
        } else if (xyz.equals("z")) {
            Point tempPoint = new Point(point.getX(), point.getY(),0);
            return tempPoint;
        } else {
            return point;
        }

    }

}
