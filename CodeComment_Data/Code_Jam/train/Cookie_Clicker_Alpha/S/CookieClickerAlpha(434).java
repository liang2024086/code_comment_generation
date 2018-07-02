package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1035;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author And
 */
public class CookieClickerAlpha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        scanner.nextLine();
        scanner.useLocale(Locale.US);
        for (int i = 0; i < cases; i++) {
            out.write("Case #" + (i + 1) + ": ");
            double C, F, X;
            C = scanner.nextFloat();
            F = scanner.nextFloat();
            X = scanner.nextFloat();
            double buy, conti;
            double rate = 2.0f;
            double seconds = 0.0f;
            boolean ya = false;
            while (!ya) {
                buy = (C / rate) + (X / (rate + F));
                conti = X / rate;
                if (Double.compare(buy, conti) <= 0) {
                    seconds += C/rate;
                    rate += F;
                } else {
                    ya = true;
                    seconds += conti;
                }
            }
            Locale fmtLocale = Locale.US;
            NumberFormat formatter = NumberFormat.getInstance(fmtLocale);
            formatter.setMinimumFractionDigits(7);

            out.write("" + formatter.format(seconds));
            out.newLine();
        }
        out.close();
    }
}
