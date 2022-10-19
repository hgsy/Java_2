package TestDirectory.InterfaceTest;

public class InterfaceTestClass {
    public static void main(String []args){
        IntTestTop t = new IntTestTop(){
            @Override
            public void fourth() {
                System.out.println("4");
            }

            @Override
            public void third() {
                System.out.println("3");
            }
        };

        t.fourth();
        t.third();

    }
}

class TestClass implements IntTest{
    @Override
    public void first() {
        System.out.println("1");
    }

    @Override
    public void second() {
        System.out.println("2");
    }

}



interface IntTest{
    public static void StringTest(){
        System.out.println("1111");
    }

    default void defaultTest(){
        System.out.println("default");
    }
    public void first();
    public void second();
}

interface IntTestTop{
    public void third();
    public void fourth();
}