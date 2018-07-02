package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1430;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

/**
 *
 * @author @AddaxT
 */
public class CookieClickerAlpha {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("B-small-attempt2.in"));
        int testCases = Integer.parseInt(br.readLine());
        double relativeEpsilon = 0.00000001;
        for (int i = 1; i <= testCases; i++) {
            String[] components = br.readLine().split(" ");
            double c = Double.parseDouble(components[0]);
            double f = Double.parseDouble(components[1]);
            double x = Double.parseDouble(components[2]);
            double seconds2Farm = 0;
            double totalTime = x;
            //System.out.println(String.format(Locale.ENGLISH, "Case #%d: C %.7f, F %.7f, X %.7f", i, c, f, x));
            if (x <= c - relativeEpsilon) {
                System.out.println(String.format(Locale.ENGLISH, "Case #%d: %.7f", i, x / 2));
                continue;
            }
            for (int j = 0; true; j++) {
                double rate = (2 + (j * f));
                double seconds2Win = x / rate;
                double tmpSeconds2Win = seconds2Farm + seconds2Win;
                //System.out.println(tmpSeconds2Win + " " + totalTime + " " + (totalTime - tmpSeconds2Win));
                if (totalTime - tmpSeconds2Win < relativeEpsilon) {
                    break;
                } else {
                    totalTime = tmpSeconds2Win;
                }
                //System.out.println(seconds2Farm + " " + seconds2Win + " " + tmpSeconds2Win);
                seconds2Farm += (c * (1 / rate));
            }
            System.out.println(String.format(Locale.ENGLISH, "Case #%d: %.7f", i, totalTime));
        }
    }
}
