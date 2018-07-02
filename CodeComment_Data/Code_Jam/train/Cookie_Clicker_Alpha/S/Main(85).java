package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1444;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Codejam 2014
 * User: maurya
 * Date: 12/4/14
 * Time: 1:30 PM
 */
public class Main {
    public static void main(String args[]) throws Exception {
        InputStream is = System.in;
        if (args != null && args.length > 0 && args[0] != null) {
            is = new FileInputStream(new File(args[0]));
        }
        Scanner in = new Scanner(is);
        int _tests = in.nextInt();
        for (int _t = 1; _t <= _tests; _t++) {
            System.out.print("Case #" + _t + ": ");
            double C = in.nextDouble(); double F = in.nextDouble(); double X = in.nextDouble();
            double boost = 2.;
            double time = X/boost;
            double extraTime = 0;
            while (true) {
                extraTime += C/boost;
                boost += F;
                double newTime = extraTime + X/boost;
                if (newTime < time) {
                    time = newTime;
                } else {
                    break;
                }
            }
            System.out.printf("%.10f\n",time);
        }
    }
}

