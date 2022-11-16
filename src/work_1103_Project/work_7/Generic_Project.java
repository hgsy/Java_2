package work_1103_Project.work_7;

public class Generic_Project {
    // 일반 클래스 1
    public static void main(String[] args){

        Point p1 = new Point(3,3.2,3.4);
        Point p2 = new Point(1,1.2,1.4);

        System.out.println("두 점 사이의 거리 : 약 " + Math.floor(Clac.getDistance(p1, p2) * 1000)/1000);
        System.out.println(
                "두 점을 지나는 직선의 각도 : 약 " + Math.floor(Clac.getAngle(p1, p2) * 1000)/1000 + "도"
                //1000을 곱하고 이후에 나눈 것은 소수점 셋째 짜리까지 수를 표현하고
                // 이외에는 버리기 위해서이다.
        );
    }

//    public static void printInfoAll(){
//
//    }

}

