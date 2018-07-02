package methodEmbedding.Cookie_Clicker_Alpha.S.LYD299;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Jacob on 14-4-12.
 */
public class CookieClickerAlpha {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new FileInputStream(new File("e:/2.txt")));
        int T = scanner.nextInt();
        double initC = 2.0;
        for (int index = 1; index <= T; index++) {
            double C = scanner.nextDouble();
            double F = scanner.nextDouble();
            double X = scanner.nextDouble();

            double time = 0;
            double buyNewTime = (C / initC + X / (initC + F)), notBuyNewTime = X / initC;
            double currentC = initC;
            while (notBuyNewTime > buyNewTime) {
                //should buy one, after buy one
                time += C / currentC;
                currentC += F;
                notBuyNewTime = X / (currentC);
                buyNewTime = C / currentC + X / (currentC + F);
            }
            time+=notBuyNewTime;

            System.out.println("Case #" + index + ": "+time);

        }
    }
}
