package methodEmbedding.Cookie_Clicker_Alpha.S.LYD678;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Cookies {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        for(int t = 0; t < T; t++) {
            double c = scanner.nextDouble(), f = scanner.nextDouble(), x = scanner.nextDouble();
            double rate = 2, price = c, time = 0;
            while(true) {
                double timeWithFarm = x/(rate + f) + price/rate;
                double timeNoFarm = x/rate;

                if(timeWithFarm < timeNoFarm) {
                    time += price/rate;
                    rate += f;
                } else {
                    time += x/rate;
                    break;
                }
            }
            DecimalFormat format = new DecimalFormat("##0.0000000");
            System.out.println("Case #" + (t+1) + ": " + format.format(time));
        }
    }
}
