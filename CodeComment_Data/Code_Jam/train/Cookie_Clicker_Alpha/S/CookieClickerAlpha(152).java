package methodEmbedding.Cookie_Clicker_Alpha.S.LYD301;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CookieClickerAlpha {
    public static void main(String[] arg) throws IOException {
        FileReader file = new FileReader("B-small-attempt0.in");
        FileWriter output = new FileWriter("output.out");
        Scanner in = new Scanner(file);
        int T, cas;
        double C, F, X, left, np, ans, last;
        T = in.nextInt();
        for (cas = 1; cas <= T; cas++) {
            C = in.nextDouble();
            F = in.nextDouble();
            X = in.nextDouble();
            np = 2.0;
            ans = 0.0;
            left = X;
            last = X / np;

            while (true) {
                double pp = np + F;
                double tmp = ans + C / np + X / pp;
                if (tmp < last) {
                    ans += C / np;
                    np = pp;
                    last = tmp;
                } else {
                    ans = last;
                    break;
                }
            }

            output.append("Case #" + cas + ": "
                    + String.format("%.7f", ans) + "\n");
        }
        file.close();
        output.close();
    }
}
