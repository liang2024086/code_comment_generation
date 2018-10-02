package methodEmbedding.Counting_Sheep.S.LYD937;

import java.util.Scanner;

public class CountingSheep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int testcase=1; testcase <= t; testcase++) {

            long n = sc.nextLong();
            int[] A = new int[10];
            int count = 0;

            if(n == 0) {
                System.out.printf("Case #%d: INSOMNIA\n", testcase);
                continue;
            }

            if(n < 0) {
                n *= -1;
            }

            int multiplier = 1;
            int value;
            long tempN;

            while(count != 10) {
                tempN = n * multiplier;
                String str = String.valueOf(tempN);
                int len = str.length();
                for(int i=0; i<len; i++) {
                    value = Integer.parseInt(String.valueOf(str.charAt(i)));
                    if(A[value] == 0) {
                        A[value]++;
                        count++;

                        if(count == 10) break;
                    }
                }

                multiplier++;
            }

            System.out.printf("Case #%d: %d\n", testcase, (multiplier-1) * n);


        }
    }
}
