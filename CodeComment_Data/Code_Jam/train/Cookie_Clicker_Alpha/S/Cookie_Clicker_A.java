package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1294;

import java.util.Scanner;

public class Cookie_Clicker_A {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        int T = Integer.parseInt(scan.nextLine());

        for (int t = 1; t <= T; t++) {

            String argz[] = scan.nextLine().split(" ");

            double C = Double.parseDouble(argz[0]);
            double F = Double.parseDouble(argz[1]);
            double X = Double.parseDouble(argz[2]);

            double curr;
            double prev = Double.MAX_VALUE;

            curr = X / 2.0;
            int farms = 0;
            double farmcost = 0;
            while (prev - curr > 0.000000001) {
                prev = curr;
                curr = farmcost + (C / (2.0 + farms * F)) + (X / (2.0 + (farms+1) * F));
                farmcost += (C / (2.0 + farms * F));
                farms++;
            }

            System.out.println("Case #" + t + ": " + prev);
        }

    }


}
