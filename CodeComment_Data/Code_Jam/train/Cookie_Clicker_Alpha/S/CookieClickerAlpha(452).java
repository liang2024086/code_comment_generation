package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1107;

import java.util.Scanner;

/**
 * Created by ocozalp on 4/12/14.
 */
public class CookieClickerAlpha {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 1; i<=t; i++) {
            double c = sc.nextDouble();
            double f = sc.nextDouble();
            double x = sc.nextDouble();

            double factoryTime = 0.0;
            double answer = x / 2.0;

            for(int n = 1; n<=100000; n++) {
                factoryTime += c / (2.0 + (n-1)*f);
                double result = factoryTime + x / (2.0 + n*f);

                if(result < answer) answer = result;
            }

            System.out.println(String.format("Case #%d: %f", i, answer));
        }
        sc.close();
    }
}
