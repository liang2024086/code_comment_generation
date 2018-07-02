package methodEmbedding.Cookie_Clicker_Alpha.S.LYD70;

import java.util.Scanner;

public class Q1B {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int t = 1; t <= T; t++) {

            double C = in.nextDouble();
            double F = in.nextDouble();
            double X = in.nextDouble();

            double S = 2.0d;
            double total = 0;
            // could be faster ?
            while((X - C) / S > X / (S + F)) {
                total += (C / S);
                S += F;
            }

            System.out.format("Case #%d: %.7f\n", t, total + (X / S));
        }
    }


}
