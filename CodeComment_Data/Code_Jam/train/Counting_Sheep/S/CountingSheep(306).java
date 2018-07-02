package methodEmbedding.Counting_Sheep.S.LYD984;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountingSheep {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(new File("/WorkingFolder/Code/Java/A.in"));

        PrintWriter pw = new PrintWriter(new File("/WorkingFolder/Code/Java/A.out"));

        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {

            long N = scanner.nextInt();
            if (N == 0) {
                System.out.println(String.format("Case #%d: INSOMNIA", (t + 1)));
                pw.println(String.format("Case #%d: INSOMNIA", (t + 1)));
                continue;
            }

            int multiple = 1;

            Set<Integer> setOfDigits = new HashSet<>();
            while (true) {
                long namedNumber = multiple * N;
                String digits = Long.toString(namedNumber);
                for (int i = 0; i < digits.length(); i++) {
                    setOfDigits.add(digits.charAt(i) - '0');
                }

                if (setOfDigits.size() == 10) {
                    System.out.println(String.format("Case #%d: %s", (t + 1), Long.toString(namedNumber)));
                    pw.println(String.format("Case #%d: %s", (t + 1), Long.toString(namedNumber)));
                    break;
                }

                multiple++;
            }
        }

        scanner.close();
        pw.close();
    }

}
