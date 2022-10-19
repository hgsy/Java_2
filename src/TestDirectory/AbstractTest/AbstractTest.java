package TestDirectory.AbstractTest;

public class AbstractTest {
    public static void main(){
        TestClass2 t = new TestClass2();

        t.test1();

    }
}

abstract class TestClass{

    public void test1(){
        System.out.println("11");
    }

    public abstract void test2();

}

class TestClass2 extends TestClass{


    public void test2(){
        System.out.println("22");
    }
}
