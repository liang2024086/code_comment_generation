package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1296;


import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: gouravr
 * Date: 4/12/14
 * Time: 8:05 PM
 */
public class CookieClicker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        double C, F, X;

        T = sc.nextInt();

        int testCase = 0;
        while (T != testCase) {
            ++testCase;

            C = sc.nextDouble();
            F = sc.nextDouble();
            X = sc.nextDouble();

            double time = X / 2;

            int j = 0;
            double farmBuyTime = 0;
            while (farmBuyTime < time) {
                farmBuyTime += C / (2 + F * j);
                time = Math.min(farmBuyTime + X / (2 + F * j + F), time);
                ++j;
            }
            System.out.println(String.format("Case #%d: %.7f", testCase, time));
        }

    }
}
