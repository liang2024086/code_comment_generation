package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1173;


import java.util.Scanner;

public class CookieClickerAlpha {

    public static void main(String[] args) {

        double C, F, X;
        double[] result;

        int T;
        Scanner input = new Scanner(System.in);
        T = input.nextInt();
        result = new double[T];
        for (int i = 1; i <= T; i++) {

            double withbuying = 0.0, withoutbuying = 0.0, totaltime = 0.0, cookiespersec = 2;

            C = input.nextDouble();
            F = input.nextDouble();
            X = input.nextDouble();

            withoutbuying = X / cookiespersec;
            withbuying = C / cookiespersec + X / (cookiespersec + F);

            while (withbuying < withoutbuying) {
                totaltime += C / cookiespersec;
                cookiespersec += F;
                withoutbuying = X / cookiespersec;
                withbuying = C / cookiespersec + X / (cookiespersec + F);

            }

            totaltime += X / cookiespersec;
            result[i - 1] = totaltime;

        }
        
        for( int i = 1 ; i<= T ;i++) {
            
            System.out.printf("Case #%d: %.7f\n",i,result[i-1]);
        }

    }

}
