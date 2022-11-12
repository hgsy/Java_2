package work_1103_Project.work_7;
import java.lang.Math;

public class Clac {
    //일반 클래스 2

    public static double getdifX(Point a, Point b){
        return (a.getX() - b.getX());
    }

    public static double getdifY(Point a, Point b){
        return (a.getY() - b.getY());
    }

    public static double getAngle(Point a, Point b){
        return Math.atan2(getdifX(a,b),getdifY(a,b));
    }

    public static double getDistance(Point a, Point b){
        return Math.sqrt(Math.pow(getdifX(a,b), 2) + Math.pow(getdifY(a,b), 2));
    }

    public static int getQuadrant(Point A){
        int temp = -1;
        if(A.getX()>0){
            if(A.getY()>0){
                temp = 1;
            } else if (A.getY()<0) {
                temp = 4;
            }
        } else if (A.getX() < 0) {
            if(A.getY()>0){
                temp = 2;
            } else if (A.getY()<0) {
                temp = 3;
            }
        }
        return temp;
    }



}
