package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1064;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: chengpan
 * Date: 4/11/14
 * Time: 11:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class Cookie {


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("input.txt"));
        FileWriter fstream = new FileWriter("output.txt");
        BufferedWriter out = new BufferedWriter(fstream);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            double result;

            double C = sc.nextDouble();
            double F = sc.nextDouble();
            double X = sc.nextDouble();

            if ( (F * X - (2+F) * C) < 0.0) {
                result = X / 2;
            } else {
                int n = (int) Math.floor(X/C - (2 + F)/F);
                double sum = 0.0;
                for (int j = 0; j <= n; j++) {
                    sum += C / (2 + F * j);
                }
                sum += X / (2 + F * (n + 1));

                result = sum;
            }

//            System.out.println("Case #" + (i + 1) + ": " + String.format("%.7f", result));
            out.write("Case #" + (i + 1) + ": " + String.format("%.7f\n", result));
        }

        out.close();

    }
}
