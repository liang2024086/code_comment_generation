package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1281;

import java.util.Scanner;

public class CCAlpha {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cases = in.nextInt();

        for (int i = 1; i <= cases; i++) {
            double time = 0.0;
            double price = in.nextDouble();
            double cookies = 0;
            double rateCur = 2.0;
            double rateMult = in.nextDouble();
            double goal = in.nextDouble();

            while (cookies < goal) {
                double doNothing = 0.0;
                double buy = 0.0;

                time += (price / rateCur);
                doNothing = ((goal - price) / rateCur) + time;
                buy = goal / (rateCur + rateMult) + time;

                if (doNothing > buy) {
                    cookies = 0.0;
                    rateCur += rateMult;
                } else {
                    time += ((goal - price) / rateCur);
                    break;
                }
            }

            System.out.print("Case #" + i + ": ");
            System.out.printf("%.7f\n", time);
        }

        in.close();
    }

}
