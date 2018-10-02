package methodEmbedding.Revenge_of_the_Pancakes.S.LYD627;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * User: ilshat
 * Date: 09.04.16
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            String s = in.next();

            int changes = 0;
            for (int j = 0; j < s.length() - 1; j++)
                if (s.charAt(j) != s.charAt(j + 1))
                    changes++;

            // do not count last change if string ends with '+'
            if (s.charAt(s.length() - 1) == '+')
                changes--;

            int maneuverNumber = changes + 1;

            System.out.println("Case #" + i + ": " + maneuverNumber);
        }
    }
}
