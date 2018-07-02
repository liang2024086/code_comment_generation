package methodEmbedding.Cookie_Clicker_Alpha.S.LYD182;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class CookieClickerAlpha {
    public static void main(String[] args) {
        try (InputStream is = MagicTrick.class.getResourceAsStream("/CookiesClickerAlpha.txt");
             Scanner in = new Scanner(is);
             FileWriter fw = new FileWriter("C:\\Users\\Valdemar\\Documents\\CookiesClickerAlpha.txt");
             BufferedWriter bw = new BufferedWriter(fw)) {
            int numCases = in.nextInt();
            for (int i = 1; i <= numCases; i++) {
                double c = in.nextDouble();
                double f = in.nextDouble();
                double x = in.nextDouble();

                double lastResult = Double.MAX_VALUE;
                for (int n = 0; ; n++) {
                    double result = 0;
                    for (int k = 0; k < n; k++) {
                        result += c / (2 + f * k);
                    }
                    result += x / (2 + f * n);
                    if (result >= lastResult) {
                        break;
                    }
                    lastResult = result;
                }
                bw.write(String.format("Case #%d: %.7f\n", i, lastResult));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
