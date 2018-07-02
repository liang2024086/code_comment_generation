package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1168;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Class: Cookie<br />
 * Date: 2014/04/12 21:20<br />
 * Description:<br />
 *
 * @author Laiping Zhou(sjtudesigner)
 */
public class Cookie {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter out = new PrintWriter(new File("output.txt"));
        int cases = sc.nextInt();
        OUT:for (int times = 1;times <= cases;times++)
        {
            out.printf("Case #%d: ", times);

            double C = sc.nextDouble();
            double F = sc.nextDouble();
            double X = sc.nextDouble();

            double result = X / 2;

            double rate = 2.0;
            double time_past = 0;
            while (true)
            {
                time_past += C / rate;
                rate += F;
                double temp = time_past + X / rate;
                if (temp < result) result = temp;
                else break;
            }
            out.printf("%.7f\n", result);
        }
        out.close();
    }

}
