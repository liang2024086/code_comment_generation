package methodEmbedding.Revenge_of_the_Pancakes.S.LYD894;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        in.nextLine();
        for (int i = 1; i <= t; ++i) {

            String pancakeStack = in.nextLine();

            BitSet stack = new BitSet();

            for (int a = 0; a < pancakeStack.length(); a++) {
                if (pancakeStack.charAt(a) == '\u002B') {
                    stack.set(a);
                }
            }

            int flipCount = 0;

            int flipIndex = 0;

            while (stack.cardinality() < pancakeStack.length()) {
                if (!stack.get(flipIndex)) {
                    while (!stack.get(flipIndex) && flipIndex < pancakeStack.length()) {
                        flipIndex += 1;
                    }
                    flipIndex -= 1;

                    for (int a = 0; a <= flipIndex; a++) {
                        stack.set(a);
                    }
                } else {
                    while (stack.get(flipIndex)) {
                        flipIndex += 1;
                    }

                    stack.clear(0, flipIndex);
                }

                flipIndex = 0;
                flipCount += 1;
            }

            System.out.println("Case #" + i + ": " + flipCount);
        }
    }
}
