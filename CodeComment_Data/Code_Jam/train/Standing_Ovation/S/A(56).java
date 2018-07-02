package methodEmbedding.Standing_Ovation.S.LYD1854;

import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class A {

//    private static final String FNAME = "test";
    private static final String FNAME = "small-0";
//    private static final String FNAME = "large-0";

    public static void main(String[] args) throws IOException {
        String fname = "data/" + A.class.getSimpleName() + "-" + FNAME + ".";
        Scanner sc = new Scanner(Paths.get(fname + "in"));
        PrintWriter w = new PrintWriter(fname + "out");

        int T = sc.nextInt();
        for (int tc = 0; tc < T; tc++) {

            int S = sc.nextInt();
            char[] s = sc.next().toCharArray();

            int res = 0;
            int sum = s[0] - '0';
            for (int i = 1; i <= S; i++) {
                res = Math.max(res, i - sum);
                sum += s[i] - '0';
            }
            w.printf("Case #%d: %d\n", tc + 1, res);
        }

        w.close();
    }
}
