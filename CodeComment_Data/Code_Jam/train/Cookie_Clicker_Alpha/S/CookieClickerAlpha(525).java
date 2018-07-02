package methodEmbedding.Cookie_Clicker_Alpha.S.LYD749;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CookieClickerAlpha {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        BufferedReader bufferedReader = null;
        PrintWriter printWriter = null;

        int cases = 0;

        try {
            fileInputStream = new FileInputStream("input/CookieClickerAlpha.in");
            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

            printWriter = new PrintWriter("output/CookieClickerAlpha.out");

            cases = Integer.parseInt(bufferedReader.readLine());

            for (int i = 1; i <= cases; i++) {
                Double C = 0.0;
                Double F = 0.0;
                Double X = 0.0;

                String options = bufferedReader.readLine();
                String[] arrOptions = options.split(" ");
                C = Double.parseDouble(arrOptions[0]);
                F = Double.parseDouble(arrOptions[1]);
                X = Double.parseDouble(arrOptions[2]);

                Double time = 0.0;
                Double cookieRate = 2.0;

                do {
                    if ((X / cookieRate) < (C / cookieRate) + (X / (cookieRate + F))) {
                        time += (Double) X / cookieRate;
                        break;
                    } else {
                        time += (Double) C / cookieRate;
                        cookieRate += F;
                    }
                } while (true);
                printWriter.println("Case #" + i + ": " + time);
            }
            bufferedReader.close();
            printWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
