package methodEmbedding.Counting_Sheep.S.LYD1201;

/**
 * Created by sean on 4/9/16.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class CountingSheep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(args[0]));
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            if (n == 0) {
                System.out.println("Case #" + (i + 1) + ": " + "INSOMNIA");
            } else {
                Set<String> digits = new HashSet<String>();
                long k = 0;
                while (digits.size() < 10) {
                    k++;
                    long mult = k * n;
                    for (String s : String.valueOf(mult).split("")) {
                        digits.add(s);
                    }
                }
                System.out.println("Case #" + (i + 1) + ": " + k*n);
            }
        }
    }
}
