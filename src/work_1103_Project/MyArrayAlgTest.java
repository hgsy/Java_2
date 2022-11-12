package work_1103_Project;

class MyArrayAlg {

    public static Integer getLast(Integer[] a){
        return a[a.length - 1];
    }

    public static String getLast(String[] a){
        return a[a.length - 1];
    }

}

public class MyArrayAlgTest {
    public static void main(String[] args) {
        String[] language = { "C++", "C#", "JAVA" };
        Integer[] number = { 1, 2, 3, 4, 5};
        String last = MyArrayAlg.getLast(language); // last는 “JAVA”
        Integer lastnum = MyArrayAlg.getLast(number);
        System.out.println(last);
        System.out.println(lastnum);
    }
}
