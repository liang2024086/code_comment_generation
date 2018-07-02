package methodEmbedding.Revenge_of_the_Pancakes.S.LYD6;

import java.io.*;
import java.util.*;
/**
 * Created by Linda on 12/3/15.
 */
public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        s.nextLine();

        for (int i = 0; i < t; i++) {
            int count = 0;
            String line = s.nextLine();
            for (int j = 0; j < line.length() - 1 ; j++) {
                if (line.charAt(j + 1) != line.charAt(j)) count++;
            }
            if (line.charAt(line.length() - 1) == '-') count++;

            System.out.printf("Case #%d: %d\n", i + 1, count);
        }
    }
}
