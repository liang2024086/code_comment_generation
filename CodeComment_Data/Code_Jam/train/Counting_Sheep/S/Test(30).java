package methodEmbedding.Counting_Sheep.S.LYD989;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        for (int index = 1; index <= testCases; index++) {
            long testCase = input.nextLong();
            if(testCase == 0) {
                System.out.println("Case #" + index + ": " + "INSOMNIA");
                continue;
            }
            long lastNumber = 0;
            long flags = 0;
            do {
                lastNumber += testCase;
                long digits = lastNumber;
                while(digits != 0) {
                    long digit = digits % 10;
                    digits /= 10;
                    int powerOf2 = (int) Math.pow(2, digit);
                    flags |= powerOf2;
                }
            } while (flags != 1023);
            System.out.println("Case #" + index + ": " + lastNumber);
        }
    }
}
