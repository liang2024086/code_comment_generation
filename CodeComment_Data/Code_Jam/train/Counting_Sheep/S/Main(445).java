package methodEmbedding.Counting_Sheep.S.LYD1536;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            int n = in.nextInt();

            if (n == 0) {
                System.out.println("Case #" + i + ": INSOMNIA");
            } else {

                BitSet seen = new BitSet();

                int j = 0;
                String multiple = null;
                while (seen.cardinality() != 10) {
                    j += 1;
                    multiple = Integer.toString(j * n);

                    for (Character ch : multiple.toCharArray()) {
                        seen.set(Integer.parseInt(ch.toString()));
                    }
                }

                System.out.println("Case #" + i + ": " + multiple);
            }
        }
    }
}
