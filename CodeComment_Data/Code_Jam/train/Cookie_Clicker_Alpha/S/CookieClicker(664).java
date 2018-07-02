package methodEmbedding.Cookie_Clicker_Alpha.S.LYD112;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CookieClicker {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        InputStream resourceAsStream = CookieClicker.class.getClassLoader().getResourceAsStream("in.txt");
        Scanner scanner = new Scanner(resourceAsStream);
        Writer out = new FileWriter("c:\\temp\\2014.txt");

        int tcc = scanner.nextInt();
        for (int ci = 0; ci < tcc; ci++) {
            double standardRate = 2;
            double c = scanner.nextDouble();
            double f = scanner.nextDouble();
            double x = scanner.nextDouble();

            double best = x/standardRate;
            double lastTime = 0;
            double cookies = 0;
            double rate = standardRate;
            while (true) {
                double wait = c/rate;
                rate += f;
                lastTime += wait;
                double cand = lastTime + (x/rate);
                if (cand<best) {
                    best = cand;
                    continue;
                }
                break;
            }

            String res = String.format("Case #%d: %.10f\n",ci+1,best);
            out.write(res);

        }
        out.close();
        return;
    }
}
