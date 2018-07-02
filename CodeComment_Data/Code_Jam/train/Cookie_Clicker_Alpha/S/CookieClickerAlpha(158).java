package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1288;

import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class CookieClickerAlpha {

    public static void main(String...arg) throws IOException {
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(new FileInputStream("GoogleJam/input.txt"));

        int N = sc.nextInt();
        FileWriter fw = new FileWriter("GoogleJam/output.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 0; i < N; i++) {

            double time = 0;
            double cookiesPerSecond = 2;

            double farmCost = sc.nextDouble();
            double farmCookies = sc.nextDouble();
            double extraFarmCost = sc.nextDouble();

            boolean end = false;
            while (!end) {
                double timeToBuyExtra = extraFarmCost / cookiesPerSecond;
                double timeToBuyFarmAndByExtraAfter = farmCost / cookiesPerSecond + extraFarmCost / (cookiesPerSecond + farmCookies);
                if (timeToBuyExtra < timeToBuyFarmAndByExtraAfter) {
                    time += timeToBuyExtra;
                    end = true;
                } else {
                    time += farmCost / cookiesPerSecond;
                    cookiesPerSecond += farmCookies;
                }
            }
            NumberFormat formatter = new DecimalFormat("#0.0000000");
            bw.write("Case #" + (i + 1) + ": " + formatter.format(time));
            bw.newLine();
        }

        bw.close();


    }


}
