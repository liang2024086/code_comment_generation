package methodEmbedding.Cookie_Clicker_Alpha.S.LYD540;


import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            double C = Double.parseDouble(sc.next());
            double F = Double.parseDouble(sc.next());
            double X = Double.parseDouble(sc.next());

            double txi = X / 2, tci = C / 2, txf = X / (2 + F);

            double t = 0;
            if (tci + txf < txi) {

                double v = 0;
                while (tci + txf < txi) {
                    v++;
                    t = t + tci;
                    txi = X / (2 + F * v);
                    tci = C / (2 + F * v);
                    txf = X / (2 + F * (v + 1));
                }

                t = t + txi;

            } else {
                t = txi;
            }

            System.out.printf(Locale.US,"Case #"+(i+1)+": %.7f\n",t);

        }

    }
}
