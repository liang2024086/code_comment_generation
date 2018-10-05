package methodEmbedding.Cookie_Clicker_Alpha.S.LYD946;

import java.util.Scanner;

public class cookie_clicker_double {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            double farmCost = sc.nextDouble();
            double farmValue = sc.nextDouble();
            double goal = sc.nextDouble();
            double repayTime = farmCost / farmValue;
            double rate = 2.0;
            double goalTime = goal / rate;
            double time = 0;
            boolean weirdo = false;
            while (repayTime < goalTime) {
                weirdo = true;
                time += farmCost / rate;
                rate += farmValue;
                goalTime = goal / rate;
            }
            //
            if (weirdo) {
                rate -= farmValue;
                goalTime = goal / rate;
                time -= farmCost / rate;
            }
            //
            time += goal / rate;
            System.out.printf("Case #%d: %.7f\n", (i + 1), time);
        }
    }
}
