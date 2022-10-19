package Lambda;
interface Math{
    //함수형 인터페이스
    //추상 메소드가 하나만 선언되어있음
    public int Clac(int first, int second);
}

interface Test{
    public void test1(int a);
}

public class Lambda_Test {
    public static void main(String[] args){
        //형성 가능?
        //추상 메소드는 함수형 인터페이스를 통해서만
        Test t = (a) -> System.out.println(a);
        Math p = (first, second) -> first + second;
        t.test1(1);
        System.out.println(p.Clac(4,2));

        Math m = (first, second) -> first - second;
        System.out.println(m.Clac(4,2));
    }
}
