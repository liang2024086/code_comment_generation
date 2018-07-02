package methodEmbedding.Cookie_Clicker_Alpha.S.LYD944;


import java.util.Scanner;

public class CookieClickerAlpha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        double rate, time, minTime, C, F, X;
        for (int i = 0; i < T; i++) {
            minTime = Double.MAX_VALUE;
            C = sc.nextDouble();
            F = sc.nextDouble();
            X = sc.nextDouble();
            sc.nextLine();
            int j = 0;
            for (;;++j) {
                rate = j * F + 2;
                time = X / rate;
                for (int k = j - 1; k >= 0; k--) {
                    rate = k * F + 2;
                    time += C / rate;
                }
                if (minTime > time) {
                    minTime = time;
                } else {
                    break;
                }
            }
            System.out.println("Case # " + (i+1) + ": " + minTime);
        }
    }
}
