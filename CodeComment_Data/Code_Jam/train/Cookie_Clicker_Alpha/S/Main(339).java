package methodEmbedding.Cookie_Clicker_Alpha.S.LYD546;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int x = 1; x < t + 1; x++) {
            double C, F, X;
            C = in.nextDouble();
            F = in.nextDouble();
            X = in.nextDouble();
            double timeElapsed = 0;
            double bestTime = Double.POSITIVE_INFINITY;
            double cps = 2;
            int inc = 0;
            while (bestTime >= timeElapsed) {
                bestTime = Math.min(timeElapsed + X / cps, bestTime);
                inc++;
                timeElapsed += C / cps;
                cps = 2 + F * inc;
            }
            System.out.printf("Case #%d: %f\n", x, bestTime);
        }
    }
}
