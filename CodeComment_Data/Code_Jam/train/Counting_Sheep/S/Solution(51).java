package methodEmbedding.Counting_Sheep.S.LYD1019;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Peter Hu on 2016-04-08.
 */
public class Solution {

    public static void main (String ... args) throws FileNotFoundException {
        HashSet<Integer> seen = new HashSet<Integer>();
        Scanner s = new Scanner(new File("src/A-small-attempt0.in"));
        int cases = s.nextInt();
        for (int i = 0; i < cases; i++) {
            int val = s.nextInt();
            int temp = val;
            if (temp == 0) {
                System.out.println("Case #" + (i+1) + ": INSOMNIA");
            }
            else {
                for (int j = 1; j < 1000; j++) {
                    while (temp > 0) {
                        int digit = temp % 10;
                        seen.add(digit);
                        temp = temp / 10;
                    }
                    if (seen.size() == 10) {
                        System.out.println("Case #" + (i+1) + ": " + val*j);
                        seen.clear();
                        break;
                    }
                    temp = val*(j+1);
                }

            }

        }
    }
}
