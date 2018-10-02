package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1564;

/*
B. Cookie Clicker Alpha
 */

import static jam.y2014.q.a.out;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author shiryap
 */
public class b {

    static Scanner in;
    static PrintStream out;
    static final String filepath = System.getProperty("user.dir") + "//src//jam//y2014//q//B-small-attempt0.in";
    //static final String filepath = System.getProperty("user.dir") + "//src//jam//y2014//q//B-sample-practice.in";

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println(filepath);
        in = new Scanner(new File(filepath));
        out = new PrintStream(new File(filepath + ".out"));

        int T = Integer.parseInt(in.nextLine()); // The first line of the input gives the number of test cases, T. T test cases follow. 
        for (int t = 1; t <= T; t++) {

            double C = in.nextDouble();
            double F = in.nextDouble();
            double X = in.nextDouble();

            double x = 2; // initial speed
            double time = 0;

            while (true) {
                // x - speed of making cookies per second
                // X / x = t - time required to make cookies at step i
                // solve iteratively for X / x < X / (x + F) + C / x
                // where x >= 2

                double t1 = X / x;
                double t2 = X / (x + F) + C / x;
                if (t1 < t2) // don't buy next factory
                {
                    time += t1;
                    break;
                } else { // buy a factory
                    time += C / x;
                    x += F;
                }

            }

            out.println("Case #" + t + ": " + time);
            System.out.println("Case #" + t + ": " + time);
        }
    }
}
