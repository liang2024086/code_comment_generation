package methodEmbedding.Cookie_Clicker_Alpha.S.LYD74;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Prakhar
 */
public class CookieClickerAlpha {

    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            String arr[] = br.readLine().split(" ");
            double c = Double.parseDouble(arr[0]);
            double f = Double.parseDouble(arr[1]);
            double x = Double.parseDouble(arr[2]);
            double r = 2.0;
            double t_old = (double) x / r;
            double t_new = 0.0;
            while (true) {
                double time = (double) c / r;
                t_new += time;
                r += f;
                time = (double) x / r;
                t_new += time;
                if (t_new < t_old) {
                    t_old = t_new;
                    t_new -= time;
                } else {
                    break;
                }
            }
            System.out.println("Case #" + i + ": " + String.format("%.7f", t_old));
        }
    }
}
