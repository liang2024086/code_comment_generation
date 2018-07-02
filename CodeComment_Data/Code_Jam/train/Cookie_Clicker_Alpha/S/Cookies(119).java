package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1377;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Cookies {

    public static void main(String[] args) throws IOException {
        Scanner myscanner = new Scanner(new File("B-small-attempt1.in"));
        int cases = myscanner.nextInt();
        myscanner.nextLine();
        for (int i = 1; i <= cases; ++i) {
            double c = myscanner.nextDouble();
            double f = myscanner.nextDouble();
            double x = myscanner.nextDouble();
            myscanner.nextLine();
            double t = 0;
            double p = 2.0;
            while (x > c) {
                t += c / p;
                if (c * p / f > x - c) {
                    x -= c;
                }
                else {
                    p += f;
                }
            }
            t += x / p;
            System.out.println("Case #" + i + ": " + t);
        }
    }
}
