package methodEmbedding.Cookie_Clicker_Alpha.S.LYD18;

import java.util.*;
import java.io.*;

public class CookieClickerAlpha {
    public static void main(String[] args) throws Exception {
        if (args.length != 2)
            throw new IllegalArgumentException("Require input and output filenames");
        Scanner sc = new Scanner(new FileReader(args[0]));
        PrintWriter pw = new PrintWriter(new FileWriter(args[1]));
        int caseCnt = sc.nextInt();
        for (int caseNum = 0; caseNum < caseCnt; caseNum++) {
            pw.print("Case #" + (caseNum + 1) + ": ");
            double C = sc.nextDouble();
            double F = sc.nextDouble();
            double X = sc.nextDouble();
            int N;
            double calcN = X/C - 2.0/F - 1.0;
            if (calcN < 0) N = 0;
            else N = (int) Math.ceil(calcN);
            double time = 0.0;
            int n = 0;
            while (n < N) {
                time += 1.0*C/(F*n + 2);
                n++;
            }
            time += 1.0*X/(F*N + 2);
            pw.format("%.7f%n", time);
        }
        pw.flush();
        pw.close();
        sc.close();
    }
}
