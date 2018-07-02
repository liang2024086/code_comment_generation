package methodEmbedding.Revenge_of_the_Pancakes.S.LYD372;


import java.util.*;
import java.io.*;
public class B {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out = new PrintStream(new File("outputB.txt"));
        Scanner in = new Scanner(new File("B-small-attempt0.in"));
        int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            String pancakes = in.next();
            char prev = pancakes.charAt(0);
            int change = 0;
            for (int j = 1; j < pancakes.length(); j++) {
                if (prev != pancakes.charAt(j)) {
                    change++;
                }
                prev = pancakes.charAt(j);
            }
            if (pancakes.charAt(pancakes.length() - 1) == '-')
                change++;
            out.println("Case #" + i + ": " + change);
        }
    }
}
