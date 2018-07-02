package methodEmbedding.Counting_Sheep.S.LYD346;


import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private static final String inputPath = "/home/qurbonzoda/Programming/ideaProjects/Other/functions.in";
    private static final String outputPath = "/home/qurbonzoda/Programming/ideaProjects/Other/functions.out";
    public static void main (String[] args) throws IOException {
        Scanner scanner = new Scanner(new FileInputStream(inputPath));
        PrintWriter printer = new PrintWriter(new FileOutputStream(outputPath));
        long[] v = new long[1000010];
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            printer.format("Case #%d: ", i + 1);
            long n = scanner.nextLong();
            if (n == 0) {
                printer.println("INSOMNIA");
                continue;
            }
            if (v[(int)n] != 0) {
                printer.println(v[(int)n]);
                continue;
            }
            boolean[] u = new boolean[10];
            int cnt = 0;
            int k = 0;
            do {
                ++k;
                String s = String.valueOf(n * k);
                for (int j = 0; j < s.length(); j++) {
                    char c = s.charAt(j);
                    if (!u[c - '0']) {
                        cnt++;
                        u[c - '0'] = true;
                    }
                }
            } while (cnt < 10 && k < Integer.MAX_VALUE);
            v[(int)n] = (k == Integer.MAX_VALUE ? -1 : n * k);
            if (k == Integer.MAX_VALUE) {
                printer.println("INSOMNIA");
            } else {
                printer.println(n * k);
            }
        }
        printer.flush();
    }
}
