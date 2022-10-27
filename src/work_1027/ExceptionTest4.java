package work_1027;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class ExceptionTest4 {

    public static void main(String[] args) {
        String s = "of the people, by the people, for the people";
        String token;

        StringTokenizer st = new StringTokenizer(s,",");

        while (st.hasMoreTokens()) {
            token = st.nextToken();
            System.out.println(token);
        }

    }
}
