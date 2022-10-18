import java.util.Scanner;
class NestStudent {
    //1) 필드 선언
    // 학생 이름(private, String)
    // 수강과목(private, Suject)
    private String name;
    private Subject sub;

    public NestStudent(String name, int cnt) {
        this.name = name;
        sub = new Subject(cnt);
        //학생 이름 초기화
        //Subject 객체 생성, 생성자 매개변수로 cnt 전달
    }
    void stdPrint() { // 객체 내용 출력
        // 학생 이름 출력
        // Subject 객체의 subjectprint() 를 호출하여 수강과목 출력
        System.out.println("======================\n"+name+" 학생의 수강과목");
        sub.subjectprint();

    }

    //인스턴스 멤버 클래스
    class Subject {
        String[] sub = new String[1];
        // 수강 과목을 저장할 배열 선언

        public Subject(int num) {
            Scanner input = new Scanner(System.in);
            //매개변수로 받은 값만큼 배열을 생성하고 수강과목을 입력 받아 저장
            sub = new String[num];
            System.out.println(name+"==>");
            for(int i=0;i<num;i++){
                System.out.printf("수강 과목(%d) : ",i+1);
//                sub[i] = input.nextLine();
                sub[i] = "1";
            }
        }

        public Subject() {
        }
        public void subjectprint() {
            //배열에 저장된 수강과목 출력
            for(int i=0;i<sub.length;i++){
                System.out.println(sub[i]);
            }
        }


    }
}


public class NestStudentTest {
    public static void main(String[] args) {
        NestStudent obj[] = { new NestStudent("홍길동", 2), new NestStudent("임꺽정", 3),
                new NestStudent("심청이", 1) };


                for (NestStudent ns : obj)
                    ns.stdPrint();
//        obj[0].stdPrint();
    }

}