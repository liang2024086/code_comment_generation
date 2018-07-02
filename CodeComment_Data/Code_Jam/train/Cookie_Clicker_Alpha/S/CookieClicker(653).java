package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1306;


import java.io.*;
import java.util.*;
import java.math.*;


public class CookieClicker {
    public static void main(String args[]) throws Exception {
        BufferedReader fin = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new FileReader(new File("src/qualifiers2014/"
                + fin.readLine())));
        FileWriter out = new FileWriter(new File("src/qualifiers2014/CookieClicker.out"));

        int T = Integer.parseInt(in.readLine());
        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            double C = Double.parseDouble(st.nextToken());
            double F = Double.parseDouble(st.nextToken());
            double X = Double.parseDouble(st.nextToken());
            double rate = 2.0;
            
            double min = Double.MAX_VALUE;
            double investment = 0.0;
            int i = 0;
            while (true) {
                double temp = min;
                min = Math.min(min, investment + (X / (rate + i*F)));
                if (min == temp) break;
                investment += C / (rate + i*F);
                i++;
            }

            out.write(String.format("Case #%d: ", t));
            out.write(String.format("%.7f", min));
            out.write("\n");
        }

        fin.close();
        in.close();
        out.close();
    }
}
