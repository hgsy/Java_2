package Generic;

public class GenericTest {
    public static void main(String[] args){

//        Generic_A<String> a1 = new Generic_A<String>("String_Test");
//        Generic_A<Integer> a2 = new Generic_A<Integer>(1);
//
//        System.out.println(a1.getInput());
//        System.out.println(a2.getInput());
//
//        System.out.println("===================");
//        a1.setInput("modify");
//        a2.setInput(2);
//
//        System.out.println(a1.getInput());
//        System.out.println(a2.getInput());

        Generic_B b1 = new Generic_B();

//        int[] a = {1,2,3,4,5};
        Integer[] a = {1,2,3,4,5};

        int last = b1.getLast(a);

    }
}

class Generic_A  <T>{
    private T input;
    Generic_A(T input){
        this.input = input;
    }

    public void setInput(T input){
        this.input = input;
    }

    public T getInput(){
        return this.input;
    }

}

class Generic_B{
    public <T> T getLast(T[] a){
        return a[a.length - 1];
    }
}

