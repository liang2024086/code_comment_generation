package methodEmbedding.Cookie_Clicker_Alpha.S.LYD73;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ENGLISH);
        int TOTAL_CASES = in.nextInt();
        for (int zz = 1; zz <= TOTAL_CASES; zz++) {
            double C = in.nextDouble(); // number of cookies to by a new farm
            double F = in.nextDouble(); // extra cookies per second from a farm
            double X = in.nextDouble(); // goal

            double cookiesPerSec = 2;
            double timeWithFarm = C / cookiesPerSec + X / (cookiesPerSec + F);
            double timeWithoutFarm = X / cookiesPerSec;

            int farmsAmount = 0;

            while (timeWithFarm < timeWithoutFarm) {
                farmsAmount++;

                cookiesPerSec += F;
                timeWithFarm = C / cookiesPerSec + X / (cookiesPerSec + F);
                timeWithoutFarm = X / cookiesPerSec;
            }

            double totalTime = 0;
            for (int i = 0; i < farmsAmount; i++) {
                totalTime = totalTime + C / (2 + i * F);
            }
            totalTime += X / (2 + farmsAmount * F);
            System.out.format(Locale.ENGLISH, "Case #%d: %.7f\n", zz, totalTime);
        }
    }
}
