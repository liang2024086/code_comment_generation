package methodEmbedding.Magic_Trick.S.LYD85;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
class A {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String answer = "";
        int rownum1 = 0;
        int rownum2 = 0;
        int numtests = console.nextInt();
        int[] tests = new int[17];
        int temp = 0;
        for (int i = 1; i <=numtests; i += 1) {
            Arrays.fill(tests, 0);
            answer = "Volunteer cheated!";
            rownum1 = console.nextInt();
            for (int a = 1; a <= 4; a+= 1) {
                for (int b=1; b<=4; b+= 1) {
                    temp = console.nextInt();
                    if (rownum1==a) {
                        tests[temp] += 1;
                    }
                }
            }

            rownum2 = console.nextInt();
            for (int a = 1; a <= 4; a+= 1) {
                for (int b=1; b<=4; b+= 1) {
                    temp = console.nextInt();
                    if (rownum2==a) {
                        tests[temp] += 1;
                    }
                }
            }            

            boolean found = false;

            for (Integer z =1; z < 17; z+=1) {
                if (tests[z] > 1) {
                    if (found) {
                        answer = "Bad magician!";
                    } else {
                        found = true;
                        answer = z.toString();
                    }
                }
            }

            System.out.println("Case #" + i + ": " + answer);
        }
    }
}
