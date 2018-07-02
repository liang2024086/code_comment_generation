package methodEmbedding.Cookie_Clicker_Alpha.S.LYD312;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CookieClickerAlpha {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
        Scanner sc = new Scanner(new File("B-small-attempt0.in"));
        //Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            double rate = 2.0f;
            double C = sc.nextDouble();
            double F = sc.nextDouble();
            double X = sc.nextDouble();
            double time, timeBuying, minTime = 0.0f;
            do{
                time = X/rate;
                timeBuying = (C / rate) + (X/(rate+F));
                if(Double.compare(time, timeBuying) < 0){
                    minTime += time;
                } else{
                    minTime += C/rate;
                    rate += F;
                }
            }while(Double.compare(time, timeBuying) >= 0);
            DecimalFormat df = new DecimalFormat(".0000000", DecimalFormatSymbols.getInstance(Locale.US));
            bw.write("Case #" + (int)(i+1) + ": ");
            bw.write(df.format(minTime));
            bw.newLine();
        }
        bw.close();
    }
}

