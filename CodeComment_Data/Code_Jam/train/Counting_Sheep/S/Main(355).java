package methodEmbedding.Counting_Sheep.S.LYD1333;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String... args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            int n = in.nextInt();
            int lastN = 0;
            if (n != 0) {
                List<Integer> l = IntStream.range(0, 10).boxed().collect(Collectors.toList());
                for (int j = 1; l.size() > 0; j++) {
                    lastN = n * j;
                    int modulo = lastN;
                    do {
                        int lastDigit = modulo % 10;
                        modulo = (modulo - lastDigit) / 10;
                        l.removeIf(e -> e == lastDigit);
                    } while (modulo > 0);
                }
            }
            System.out.println("Case #" + i + ": " + (lastN == 0 ? "INSOMNIA" : lastN));
        }
    }
}
