package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1496;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Komp on 12.04.2014.
 */
public class MainCookie {

    public static void main(String[] args) throws IOException {
        final double PER_SEC = 2.0;
        Scanner s = new Scanner(new File("st.txt"));
        s.useLocale(Locale.US);
       // File out = new File("out.txt");
       // FileWriter fw = new FileWriter(out);

        System.setOut(new PrintStream(new File("out.txt")));

        int caseCount = s.nextInt();

        for (int c = 0; c < caseCount; c++) {
            boolean goBuy = true;
            double time = 0.0;
            double income = PER_SEC;
            double farmCost = s.nextDouble();
            double farmProd = s.nextDouble(), goal = s.nextDouble();


            while (goBuy) {
                double end = goal / income;
                double buy = farmCost / income + goal / (income + farmProd);
                if (end > buy) {
                    time += (farmCost / income);
                    income += farmProd;
                } else {
                    goBuy = false;
                    time += end;
                }

            }

            //fw.write("Case #" + (c+1) + ": " + time + "\n");
            System.out.print("Case #" + (c+1) + ": ");
            System.out.format(Locale.US,"%.7f%n", time);
        }

        //fw.flush();
    }

}
