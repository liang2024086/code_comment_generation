package methodEmbedding.Revenge_of_the_Pancakes.S.LYD467;

import java.io.*;
import java.util.*;

public class B {
    public static void main(String[]args) throws IOException {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(x.readLine());
        for (int cases = 1; cases <= t; cases++) {
            String line = x.readLine();
            int flips = 0;
            for (int i = line.length() - 1; i >= 0; i--) {
                if ((line.charAt(i) == '-' && flips % 2 == 0) || (line.charAt(i)=='+' && flips % 2 == 1)) {
                    flips++;
                }
            }
            System.out.println("Case #"+cases+": "+flips);
        }
    }
}
