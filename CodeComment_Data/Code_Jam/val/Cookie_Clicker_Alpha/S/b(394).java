package methodEmbedding.Cookie_Clicker_Alpha.S.LYD987;

import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class b {
    static double V = 2, C, F, X;
    public static void main( String[] arg ) throws IOException {
        int T;
        DecimalFormat df = new DecimalFormat("0.0000000");
        FileReader fr = new FileReader("b-small-attempt1.in");
        BufferedWriter fw = new BufferedWriter(new FileWriter("b-small.out"));
        String s;
        Scanner sc = new Scanner(fr);
        sc.useLocale(Locale.US);
        T = sc.nextInt();
        for (int cas = 1; cas <= T; cas++) {
            double time = 0, farmTime, xTime;
            V = 2;
            C = sc.nextDouble();
            F  = sc.nextDouble();
            X = sc.nextDouble();
            if (X <= C) {
                fw.write("Case #" + cas + ": " + df.format(X / V).replace(',', '.') + "\n");
                continue;
            }
            while (true) {
                xTime = X / V;
                farmTime = C / V + X/ (V + F);//getFarmsTime();
                if (xTime < farmTime) {
                    time += xTime;
                    break;
                }
                time += C / V;
                V += F;
            }
            fw.write("Case #" + cas + ": " + df.format(time).replace(',', '.') + "\n");
        }
        fr.close();
        fw.close();
    }
}
