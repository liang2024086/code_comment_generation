package methodEmbedding.Counting_Sheep.S.LYD576;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountingSheep {

    public static void main(String... args) throws Exception {

        try(PrintWriter out = new PrintWriter(new FileWriter("out.txt"))) {

            try (Scanner in = new Scanner(new FileReader("in.txt"))) {

                int t = in.nextInt();
                for (int c = 1; c <= t; c++) {

                    out.print("Case #" + c + ": ");

                    long n0 = in.nextInt();
                    long n = n0;

                    if (n == 0) {
                        out.println("INSOMNIA");
                        continue;
                    }

                    Set<Integer> digits = new HashSet<>();

                    do {
                        for (long d = n; d > 0; d = d / 10) {
                            digits.add((int) d % 10);
                        }

                        n = n + n0;
                    } while (digits.size() < 10);
                    out.println(n - n0);
                }
            }
        }
    }
}
