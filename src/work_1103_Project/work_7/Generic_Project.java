package work_1103_Project.work_7;

public class Generic_Project {
    // 일반 클래스 1 + 제네릭 메소드
    public static void main(String[] args){

        Point p1 = new Point(3,3.2,3.4);
        Point p2 = new Point(1,1.2,1.4);
        Point_2D p3 = new Point_2D(1,2);
        Point convertP1 = Point.convertPoint(p1);
        Point convertP2 = Point.convertPoint(p2, "x");

        printInfoAll(p1, p2);
        printInfoAll(p1, p3);
        printInfoAll(p2, p3);
        printInfoAll(p3);
        printInfoAll(convertP1);
        printInfoAll(convertP2);
    }

    public static <T extends Point> void printInfoAll(T p1){
        System.out.println("==================================");
        System.out.println("Coordinate : ( x:" + p1.getX() + ", y:" + p1.getY() + ", z:" + p1.getZ() + " )");
        System.out.println("==================================");
    }

    public static <T extends Point> void printInfoAll(T p1, T p2){
        System.out.println("==================================");
        System.out.println("Coordinate 1    : ( x:" + p1.getX() + ", y:" + p1.getY() + ", z:" + p1.getZ() + " )");
        System.out.println("Coordinate 2    : ( x:" + p2.getX() + ", y:" + p2.getY() + ", z:" + p2.getZ() + " )");
        System.out.println("Angle           : " + Clac.getAngle(p1, p2));
        System.out.println("Distance        : " + Clac.getDistance(p1, p2));
        System.out.println("==================================");
    }

}