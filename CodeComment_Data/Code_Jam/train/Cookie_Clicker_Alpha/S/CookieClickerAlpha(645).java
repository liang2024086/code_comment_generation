package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1283;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author  tasyrkin
 * @since   2014/04/12
 */
public class CookieClickerAlpha {
    public static void main(final String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer t = Integer.parseInt(br.readLine());
        int init = t;
        while (t-- > 0) {
            String[] parts = br.readLine().split("\\s+");
            double C = Double.parseDouble(parts[0]);
            double F = Double.parseDouble(parts[1]);
            double X = Double.parseDouble(parts[2]);

            double time = 0;
            if (C >= X) {
                time = X / 2.0d;
            } else {
                double currF = 2.0d;
                while (X / currF > ((C / currF) + (X / (currF + F)))) {
                    time += C / currF;
                    currF += F;
                }

                time += X / currF;
            }

            System.out.println("Case #" + (init - t) + ": " + time);
        }

    }
}
