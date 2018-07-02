package methodEmbedding.Cookie_Clicker_Alpha.S.LYD323;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        double c, f, x;

        for (int t = 0; t < T; t++) {
            c = in.nextDouble();
            f = in.nextDouble();
            x = in.nextDouble();

            double sec = 0.0;
            double cap = 2.0;

            while (true) {
                double s1 = x / cap;
                double s2 = (c / cap) + (x / (cap + f));

                if (Double.compare(s1, s2) == -1) {
                    sec += s1;
                    break;
                } else {
                    sec += (c / cap);
                    cap += f;
                }
            }
            System.out.println(sec);
        }
    }
}
