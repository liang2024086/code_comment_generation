package methodEmbedding.Cookie_Clicker_Alpha.S.LYD605;

import java.util.Scanner;

public class TB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int _i = 0; _i < T; _i++) {
            double C = in.nextDouble();
            double F = in.nextDouble();
            double X = in.nextDouble();

            double t = 0;
            double s = 2.0;
            double res = X / s;
            for (;;) {
                t += C / s;
                s += F;
                double r = t + X / s;
                if (r < res) {
                    res = r;
                } else break;
            }
            System.out.printf("Case #%d: %.8f\n", _i+1, res);
        }
    }
}
