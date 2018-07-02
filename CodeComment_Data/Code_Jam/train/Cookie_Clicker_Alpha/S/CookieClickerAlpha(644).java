package methodEmbedding.Cookie_Clicker_Alpha.S.LYD958;

import java.util.Scanner;

/**
 * FileName: CookieClickerAlpha.java
 * @Description: Google code jam Problem B. Cookie Clicker Alpha
 * 
 * @author Xunhu(Tiger) Sun
 *         email: sunx2013@my.fit.edu
 * @date Apr 11, 2014 10:34:38 PM
 */
public class CookieClickerAlpha {
    public static void main (final String[] args) {
        final Scanner s = new Scanner(System.in);
        final int tc = s.nextInt();
        s.nextLine();
        for (int tci = 1; tci <= tc; tci++) {
            final double c = s.nextDouble();
            final double f = s.nextDouble();
            final double x = s.nextDouble();

            double s1 = 2; // last speed.
            double p1 = 0; // last past time.

            while (true) {
                final double s2 = s1 + f;
                final double p2 = c / s1 + p1;

                final double interCo = s1 * s2 * (p2 - p1) / (s2 - s1);
                if (Double.compare(interCo, x) >= 0) {
                    final double t = x / s1 + p1;
                    System.out.printf("Case #%d: %.7f%n", tci, t);
                    break;
                } else {
                    s1 = s2;
                    p1 = p2;
                }
            }
        }
        s.close();
    }
}
