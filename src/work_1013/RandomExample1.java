package work_1013;

import java.util.Random;

public class RandomExample1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] sNumber = new int[10];
        Random random = new Random();

        for(int i=0;i<10;i++) {
            sNumber[i] = random.nextInt(60)+1;
            System.out.print(sNumber[i]+" ");
        }

    }
}