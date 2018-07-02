package methodEmbedding.Counting_Sheep.S.LYD629;

import java.util.*;
import java.io.*;
public class ProblemA {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.

        for (int i = 1; i <= t; ++i) {
            int n = in.nextInt();
            if (n == 0) {
                System.out.println("Case #" + i + ": INSOMNIA");
                continue;
            }
            int[] found = new int[0];

            int a = 1;
            String inputNumber = "";
            while (found.length < 10) {
                inputNumber = String.valueOf(a * n);
                for (int k = 0; k < inputNumber.length(); k++) {
                    int inputDigit = inputNumber.charAt(k) - 48;
                    if (found.length == 0) {
                        found = new int[]{inputDigit};
                        continue;
                    }
                    if (Arrays.binarySearch(found, inputDigit) < 0) { // the digit is not in the array yet
                        int[] tmp = new int[found.length + 1];
                        for (int z = 0; z < found.length; z++) {
                            tmp[z] = found[z];
                        }
                        tmp[found.length] = inputDigit;
                        found = tmp;
                        Arrays.sort(found);
                    }
                }
                a++;
            }
            System.out.println("Case #" + i + ": " + inputNumber);
        }
    }
}
