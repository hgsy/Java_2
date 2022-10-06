package work_1006;
import java.lang.reflect.Array;
import java.util.Arrays;

public class SortTest {
    public static void main(String []args){

        String[] sa = {"K", "o", "r", "e", "a", "n"};

        for (String s : sa)
            System.out.print(s+" ");

//        Arrays.stream(sa).forEach(s -> System.out.print(s + " "));

        System.out.println();

//        (sa) -> {return Arrays.sort(sa)};
//        Arrays.sort(sa);

//        Arrays.stream(sa).forEach(s -> System.out.print(s + " "));
        for(String s : sa)
            System.out.print(sa+" ");


    }
}
