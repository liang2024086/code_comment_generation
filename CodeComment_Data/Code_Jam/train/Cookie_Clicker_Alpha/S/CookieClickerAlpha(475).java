package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1481;

import java.io.StringReader;
import java.util.Scanner;

public class CookieClickerAlpha {

    private static final boolean TEST_MODE = false;

    public static void main(String[] args) {
        Scanner scanner;
        if (TEST_MODE) {
            scanner = new Scanner(new StringReader(TEST_STRING));
        } else {
            scanner = new Scanner(System.in);
        }

        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            final double C = scanner.nextDouble();
            final double F = scanner.nextDouble();
            final double X = scanner.nextDouble();

            double rate = 2.0;
            double cookies = 0.0;
            double time = 0.0;

            while (true) {
                double timeRemaining = (X - cookies) / rate;
                double timeForCookieFarm = C / rate;
                double timeRemainingWithCookieFarm = timeForCookieFarm + ((X - cookies) / (rate + F));
                if (timeRemainingWithCookieFarm < timeRemaining) {
                    rate += F;
                    time += timeForCookieFarm;
                } else {
                    time += timeRemaining;
                    break;
                }
            }

            System.out.println(String.format("Case #%d: %f", t + 1, time));

        }
    }

    private static final String TEST_STRING  = "4\n" +
            "30.0 1.0 2.0\n" +
            "30.0 2.0 100.0\n" +
            "30.50000 3.14159 1999.19990\n" +
            "500.0 4.0 2000.0\n";
}
