package methodEmbedding.Counting_Sheep.S.LYD1311;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by fmiri on 9/04/2016.
 *
 * @author Ima Miri <fmiri@ebay.com>
 */
public class CountingSheep {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
        int testCases;

        try {
            testCases = Integer.valueOf(br.readLine());

            for (int i = 0; i < testCases; i++) {
                String st = br.readLine();
                int num = Integer.valueOf(st);
                int j = 1;

                Set<Integer> set = new HashSet<Integer>();
                while (j <= 100 && set.size() < 10) {
                    int x = num * j;
                    char[] chars = String.valueOf(x).toCharArray();
                    for (int k = 0; k < chars.length; k++) {
                        set.add(Character.getNumericValue(chars[k]));
                    }
                    if (set.size() == 10) {
                        System.out.println("Case #" + (i + 1) + ": " + x);
                        break;
                    } else if (j == 100) {
                        System.out.println("Case #" + (i + 1) + ": INSOMNIA");
                        break;
                    }
                    j++;
                }
            }
        } finally {
            br.close();
        }
    }
}
