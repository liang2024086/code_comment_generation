package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1196;

/**
 * Created by lehaos on 1/13/16.
 */

import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; ++i) {
            String s = in.next();
            char temp = s.charAt(0);
            int counter = 0;
            for (int j = 1; j < s.length(); ++j) {
                if (s.charAt(j) != temp) {
                    counter++;
                    temp = s.charAt(j);
                }
            }
            if (temp == '-') counter++;
            System.out.println("Case #" + (i+1) + ": " + counter);
        }
    }
}

