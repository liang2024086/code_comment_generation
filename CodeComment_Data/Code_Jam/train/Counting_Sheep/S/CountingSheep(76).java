package methodEmbedding.Counting_Sheep.S.LYD519;

import java.util.*;
import java.io.*;
import java.math.*;

public class CountingSheep {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();    // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            int n = in.nextInt();
            if (n == 0) {
                System.out.println("Case #" + i + ": " + "INSOMNIA");
            }
            else {
                int res = 1;
                int[] seen = new int[10];
                BigInteger curr = BigInteger.valueOf(n);
                while (true) {
                    String str = curr.toString();
                    for (int j = 0; j < str.length(); j++) {
                        int digit = Integer.valueOf(String.valueOf(str.charAt(j)));
                        seen[digit] = 1;
                    }
                    int k = 0;
                    for (; k < 10; k++) {
                        if (seen[k] == 0) {
                            break;
                        }
                    }
                    if (k == 10) {
                        break;
                    }
                    res +=1;
                    curr = curr.add(BigInteger.valueOf(n));
                }
                System.out.println("Case #" + i + ": " + curr.toString());
            }
        }
    }
}
