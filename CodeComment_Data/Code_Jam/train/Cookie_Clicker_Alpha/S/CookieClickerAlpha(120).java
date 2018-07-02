package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1465;

import java.util.Scanner;

/**
 * Created by Chrysovalantis on 12/04/2014.
 */
public class CookieClickerAlpha {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int cases = in.nextInt();

        for(int i=0;i<cases;i++) {
            System.out.printf("Case #%d: ",i+1);

            double C = in.nextDouble();
            double F = in.nextDouble();
            double X = in.nextDouble();

            double initF=2.0, prev, cur = X / initF;
            int farms = 0;
            do {
                prev = cur;
                farms++;

                double timeForFarms = 0;
                for(int k=0;k<farms;k++) {
                    timeForFarms += C / (initF+k*F);
                }

                cur = timeForFarms + X / (initF+farms*F);
            } while(cur < prev);

            System.out.println(prev);
        }
    }
}
