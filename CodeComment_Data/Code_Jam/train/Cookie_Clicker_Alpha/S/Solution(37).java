package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1387;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by ran on 13/04/2014.
 */
public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("in.txt"));
        PrintWriter out = new PrintWriter(new File("out.txt"));
        int N = in.nextInt();

        for (int n = 1; n <= N; n++) {
            double c = in.nextDouble();
            double f = in.nextDouble();
            double x = in.nextDouble();
            double speed = 2.0, t = 0;

            while (x > 0) {
                if ((c / speed + x / (speed + x) < (x / speed)) && (c / speed + x / (speed + f)) < x / speed) {
                    t += c / speed;
                    speed += f;
                } else {
                    t += x / speed;
                    x = 0;
                }
            }

            out.println("Case #" + n + ": " + t);
        }

        out.close();
    }
}
