package methodEmbedding.Counting_Sheep.S.LYD1208;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by study on 4/9/16.
 */
public class CountingSheep {
    public static void main(String[] args) throws Exception {
        Scanner scanner;
        PrintWriter writer;

        if (new File(CountingSheep.class.getSimpleName() + "_small.txt").exists()) {
            //scanner = new Scanner(new File(CountingSheep.class.getSimpleName() + "_sample.txt"));
            scanner = new Scanner(new File(CountingSheep.class.getSimpleName() + "_small.txt"));
            //scanner = new Scanner(new File(CountingSheep.class.getSimpleName() + "_large.txt"));
            writer = new PrintWriter(new File(CountingSheep.class.getSimpleName() + "_out.txt"));
        } else {
            scanner = new Scanner(System.in);
            writer = new PrintWriter(System.out);
        }

        int T = scanner.nextInt();

        for (int i = 1; i <= T; i++) {
            int N = scanner.nextInt();

            String last = "INSOMNIA";
            String val = "INSOMNIA";
            int j ;
            Set<Character> digits = new HashSet<>(10);

            if (N == 0) {
                last = "INSOMNIA";
            } else {
                found:
                for (j = 1; j < 100; j++) {
                    val = String.valueOf(j * N);
                    last = val;

                    for (int k = 0; k < val.length(); k++) {
                        digits.add(val.charAt(k));
                        if (digits.size() == 10) {
                            break found;
                        }
                    }

                    last = "INSOMNIA";
                }
                //System.out.println(j + " " +val);
                //System.out.println(digits);
            }

            writer.println(String.format("Case #%d: %s", i, last));
        }
        writer.flush();
    }

}
