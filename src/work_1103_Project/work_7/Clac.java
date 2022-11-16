package work_1103_Project.work_7;
import java.lang.Math;

public class Clac {
    //일반 클래스 2


    public static  double getdifX(Point a, Point b){
        return (a.getX() - b.getX());
    }
    //  두 점의 x 좌푯값 차이 반환 메소드

    public static double getdifY(Point a, Point b){
        return (a.getY() - b.getY());
    }
    //  두 점의 y 좌푯값 차이 반환 메소드

    public static double getdifZ(Point a, Point b){
        return (a.getZ() - b.getZ());
    }

    public static double getAngle(Point a, Point b){
        return (Math.atan2(getDistance_2D(a, b), getdifZ(a, b))*(180/Math.PI));
    }
    //  두 점을 지나는 직선 또는 두 점을 잇는 선분의 각도 반환 메소드

    public static double getDistance(Point a, Point b){
        //  두 점 사이의 거리 반환 메소드
        return Math.sqrt(Math.pow(getdifX(a,b), 2) + Math.pow(getdifY(a,b), 2) + Math.pow(getdifZ(a,b), 2));
    }

    public static double getDistance_2D(Point a, Point b){
        //  두 점 사이의 거리 반환 but x, y 좌표상의 거리를 반환 z축은 연산에서 고려하지 않음.
        return Math.sqrt(Math.pow(getdifX(a,b), 2) + Math.pow(getdifY(a,b), 2));
    }

//    public static int getQuadrant(Point A){
//        //  사분면 구분 메소드
//        int temp = -1;
//        if(A.getX()>0){
//            if(A.getY()>0){
//                temp = 1;
//            } else if (A.getY()<0) {
//                temp = 4;
//            }
//        } else if (A.getX() < 0) {
//            if(A.getY()>0){
//                temp = 2;
//            } else if (A.getY()<0) {
//                temp = 3;
//            }
//        }
//        return temp;
//    }

}
