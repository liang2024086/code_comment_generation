package methodEmbedding.Counting_Sheep.S.LYD12;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by pallavi on 9/4/16.
 */
public class CountingSheep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new BufferedReader(new FileReader("in.txt")));
        PrintWriter writer = new PrintWriter("out.txt");
        int t = scanner.nextInt();
        for (int i = 1; i <= t; i++) {
            Set<Integer> set = new HashSet<>();
            long n = scanner.nextInt();
            if (n == 0) {
                writer.println("Case #" + i + ": INSOMNIA");
                continue;
            }
            long nn = 0;
            do {
                nn += n;
                long nc = nn;
                while (nc > 0) {
                    set.add((int) (nc % 10));
                    nc /= 10;
                }
            } while (set.size() != 10);
            writer.println("Case #" + i + ": " + nn);
        }
        writer.close();
        scanner.close();
    }
}
