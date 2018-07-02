package methodEmbedding.Counting_Sheep.S.LYD402;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SheepCount {

    public static void main(final String[] args) {
        final Scanner in = new Scanner(
                new BufferedReader(new InputStreamReader(System.in)));
        final int t = in.nextInt();
        for (int i = 1; i <= t; ++i) {
            long time = System.nanoTime();
            int n = in.nextInt();
            int sum = n;
            if (n == 0) {
                System.out.println("Case #" + i + ": INSOMNIA");
                continue;
            }
            final Set<Character> digits = new HashSet<Character>(10);
            for (;;) {
                for (final char d : String.valueOf(sum).toCharArray()) {
                    digits.add(d);
                }
                if (digits.size() == 10) {
                    System.out.println("Case #" + i + ": " + sum);
                    System.err.println(
                            "Time: " + (System.nanoTime() - time) / 1000000000 + "s");
                    break;
                }
                sum += n;
            }
        }
    }

}
