package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1074;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author khelman
 */
public class CookieClickerAlpha {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int t = scanner.nextInt();

        for (int i = 1; i <= t; i++) {
            double c = scanner.nextDouble(); //farm price
            double f = scanner.nextDouble(); //farm gain
            double x = scanner.nextDouble(); //target

            double gain = 2.0;

            double min = x / gain;

            double nextTimeToBuy = c / gain;

            while (true) {
                double newMin = nextTimeToBuy + x / (gain + f);

                if (newMin < min) {
                    min = newMin;
                    gain += f;
                    nextTimeToBuy = nextTimeToBuy + (c / gain);
                } else {
                    break;
                }
            }

            System.out.println("Case #" + i + ": " + min);
        }

    }

}
