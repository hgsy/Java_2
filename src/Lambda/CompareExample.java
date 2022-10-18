package Lambda;

import java.util.Arrays;

public class CompareExample{
    public static void main(String[] args)
    {
        //Initialized two integer array
        int[] array1 ={6, 7, 8, 11, 18, 8, 2, 5};
        int[] array2 ={3, 5, 9, 13, 28, 6, 8, 9};
        //compare both integer array using compare method and finally print result
        System.out.println("Result is "+ Arrays.compare(array1,array2));

    }
}