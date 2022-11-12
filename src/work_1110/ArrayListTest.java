package work_1110;
import java.util.*;

public class ArrayListTest {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();

        list.add("MILK");
        list.add("BREAD");
        list.add("BUTTER");
        list.add(1, "APPLE");
        list.set(2, "GRAPE");
        list.remove(3);

        for(int i=0;i<list.size();i++){
            String temp = list.get(i);
            System.out.println(temp);
            System.out.println(list.indexOf(temp));
        }

        for(String s : list){
            System.out.println(s);
            System.out.println(list.lastIndexOf(s));
        }

    }
}
