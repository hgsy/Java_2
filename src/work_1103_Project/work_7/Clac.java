package work_1103_Project.work_7;
import java.lang.Math;

public class Clac {
    //일반 클래스 2

    public static double getdifX(Point a, Point b){
        //  두 점의 x 좌푯값 차이 반환 메소드
        return (a.getX() - b.getX());
    }

    public static double getdifY(Point a, Point b){
        //  두 점의 y 좌푯값 차이 반환 메소드
        return (a.getY() - b.getY());
    }

    public static double getdifZ(Point a, Point b){
        //  두 점의 z 좌푯값 차이 반환 메소드
        return (a.getZ() - b.getZ());
    }

    public static double getAngle(Point a, Point b){
        //  두 점을 지나는 직선 또는 두 점을 잇는 선분의 각도 반환 메소드
        return (Math.atan2(getDistance_2D(a, b), getdifZ(a, b))*(180/Math.PI));
    }

    public static double getDistance(Point a, Point b){
        //  두 점 사이의 거리 반환 메소드
        return Math.sqrt(Math.pow(getdifX(a,b), 2) + Math.pow(getdifY(a,b), 2) + Math.pow(getdifZ(a,b), 2));
    }

    public static double getDistance_2D(Point  a, Point b){
        //  두 점 사이의 거리 반환 but x, y 좌표상의 거리를 반환
        //  기본값 z 축 제외
        return Math.sqrt(Math.pow(getdifX(a,b), 2) + Math.pow(getdifY(a,b), 2));
        
    }
    
    public static double getDistance_2D(Point  a, Point b, String xyz){
        //  특정 두 축 위의 좌표상의 거리를 반환
        //  문자열 xyz에 해당하는 축은 연산에서 고려하지 않음.

        if(xyz.equals("x")){
            return Math.sqrt(Math.pow(getdifY(a,b), 2) + Math.pow(getdifZ(a,b), 2));
        } else if (xyz.equals("y")) {
            return Math.sqrt(Math.pow(getdifX(a,b), 2) + Math.pow(getdifZ(a,b), 2));
        } else if (xyz.equals("z")) {
            return Math.sqrt(Math.pow(getdifX(a,b), 2) + Math.pow(getdifY(a,b), 2));
        } else {
            return -1;
        }

    }

}
