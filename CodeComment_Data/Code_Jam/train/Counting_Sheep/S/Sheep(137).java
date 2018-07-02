package methodEmbedding.Counting_Sheep.S.LYD1404;

import java.util.*;
import java.io.*;

public class Sheep {
    public static void main(String[] args) {
        Scanner in = new Scanner(
                new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); // Scanner has functions to read ints, longs,
                              // strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            int n = in.nextInt();
            if (n == 0) {
                System.out.println("Case #" + i + ": INSOMNIA");
            } else {
                boolean[] seenDigits = new boolean[10];
                int count = 0;
                int current = n;
                do {
                    String str = "" + current;
                    for (char c : str.toCharArray()) {
                        int digit = Integer.parseInt("" + c);
                        if (!seenDigits[digit]) {
                            count++;
                            seenDigits[digit] = true;
                        }
                    }
                    current += n;
                } while (count < 10);
                System.out.println("Case #" + i + ": " + (current - n));
            }

        }
    }
}
