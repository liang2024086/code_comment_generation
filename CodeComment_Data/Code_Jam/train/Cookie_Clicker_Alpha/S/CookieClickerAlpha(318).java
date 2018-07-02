package methodEmbedding.Cookie_Clicker_Alpha.S.LYD281;

import java.util.Scanner;

public class CookieClickerAlpha {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int cs = 1; cs <= T; cs++) {

            double C = scanner.nextDouble();
            double F = scanner.nextDouble();
            double X = scanner.nextDouble();

            int k = (int) Math.ceil((X * F - 2 * C - C * F) / (C * F));
            if (k < 0) {
                k = 0;
            }

            double res = 0;
            for (int i = 0; i < k; i++) {
                res += (C / (2 + i * F));
            }
            res += (X / (2 + k * F));

            System.out.printf("Case #%d: %.7f\n", cs, res);

        }

        scanner.close();

    }
}
