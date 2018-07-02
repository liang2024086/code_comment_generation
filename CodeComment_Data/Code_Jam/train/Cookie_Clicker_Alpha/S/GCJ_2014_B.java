package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1245;


import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: lisen
 * Date: 4/13/14
 * Time: 12:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class GCJ_2014_B {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("/Users/lisen/Downloads/B-small-attempt0.in");
        OutputStream outputStream =  new FileOutputStream("/Users/lisen/Downloads/B-small-attempt0.output");;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        int caseNumber = in.nextInt();
        for (int ii = 1 ; ii <= caseNumber; ++ii){
            double c = in.nextDouble();
            double f = in.nextDouble();
            double x = in.nextDouble();
            double s = 2.0;

            double res = x / 2.0, now = 0.0;
            while (now + 1e-10 <= res){
                res = Math.min(res, now + x / s);
                now += c / s;
                s += f;
            }
            DecimalFormat df   = new DecimalFormat("######0.0000000");
            out.println("Case #" + ii + ": " + df.format(res) );

        }
        out.close();

    }
}
