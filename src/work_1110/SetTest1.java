package work_1110;

import java.util.*;

public class SetTest1 {
    public static void main(String[] args){
        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new HashSet<String>();
        Set<String> s3 = new HashSet<String>();
        s1.add("A");
        s1.add("B");
        s1.add("C");
        s2.add("A");
        s2.add("D");
        s3.add("C");
        s3.add("G");

        System.out.println(
                "s1 : " + s1 +"\ns2 : " + s2 + "\ns3 : " + s3
        );

        Set<String> union = new HashSet<String>(s1);
        union.addAll(s2);
        System.out.println("union after addAll : " + union);
        System.out.println("s1이 union의 부분 집합인가? : " + union.contains(s1));
        union.retainAll(s1);
        System.out.println("union after retainAll : " + union);
        union.remove(s3);
        System.out.println("union after remove : " + union);
    }
}
