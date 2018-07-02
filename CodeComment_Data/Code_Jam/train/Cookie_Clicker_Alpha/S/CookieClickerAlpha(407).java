package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1449;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

public class CookieClickerAlpha {
    public static void main(String... args) throws IOException {
        Scanner in = new Scanner(new File("B-small-attempt0.in"));
//        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter("CookieClickerAlpha.out");

        int loopvarloop = in.nextInt();
        for (int loopvar = 0; loopvar < loopvarloop; loopvar++) {
            double cps = 2;
            double farmCost = in.nextDouble();
            double farmProduction = in.nextDouble();
            double goal = in.nextDouble();
            double bestTime = goal / cps;
            double time = 0;
            boolean cont;
            do {
                time += farmCost / cps;
                cps += farmProduction;
                double timeCheck = goal / cps + time;
                if (timeCheck < bestTime) {
                    bestTime = timeCheck;
                    cont = true;
                } else {
                    cont = false;
                }
            } while (cont);

            out.printf("Case #%d: %f%n", loopvar + 1, bestTime);

        }
        out.close();
        in.close();
    }
}
