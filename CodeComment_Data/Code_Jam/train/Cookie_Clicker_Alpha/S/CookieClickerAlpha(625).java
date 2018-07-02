package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1290;


import java.io.*;
import java.util.Scanner;

public class CookieClickerAlpha {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new BufferedInputStream(new FileInputStream(
            "/home/aurel/repos/cuteants/codejam/src/y2014/q/B-small-attempt0.in"
            //"/home/aurel/repos/cuteants/codejam/src/y2014/q/B-test.in"
        )));
        BufferedWriter out = new BufferedWriter(new FileWriter(
            "/home/aurel/repos/cuteants/codejam/src/y2014/q/B-small.out"
            //"/home/aurel/repos/cuteants/codejam/src/y2014/q/B-test.out"
        ));

        int t = in.nextInt();
        for (int ti = 1; ti <= t; ti++) {
            double c = in.nextDouble();
            double f = in.nextDouble();
            double x = in.nextDouble();

            // a[0] = x / 2;
            // a[1] = c / 2 + x / (2 + f)
            // a[2] = c / 2 + c / (2 + f) + x / (2 + 2f)
            // ...
            // is decreasing until a[m] and the increasing
            // m = [ x / c - 2 / f ]
            double sum = 0, ps = 2, best = Double.MAX_VALUE;
            while (sum + x / ps < best) {
                best = sum + x / ps;
                sum += c / ps;
                ps += f;
            }
            out.write(String.format("Case #%d: %.7f", ti, best));
            out.newLine();
        }

        in.close();
        out.close();
    }

}
