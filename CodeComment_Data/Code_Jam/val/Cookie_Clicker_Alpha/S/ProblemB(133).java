package methodEmbedding.Cookie_Clicker_Alpha.S.LYD893;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.StringTokenizer;

/**
 * Date: 12.04.14 at 20:04
 *
 * @author Nickolay Polyarniy aka PolarNick
 */
public class ProblemB {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("inputB.txt"));
        PrintWriter out = new PrintWriter("outputB.txt");
        DecimalFormat format = new DecimalFormat("#.#######", new DecimalFormatSymbols(Locale.ENGLISH));
        int t = Integer.parseInt(in.readLine());
        for (int i = 1; i <= t; i++) {
            StringTokenizer tok = new StringTokenizer(in.readLine());
            double farmCost = Double.parseDouble(tok.nextToken());
            double farmGain = Double.parseDouble(tok.nextToken());
            double target = Double.parseDouble(tok.nextToken());

            double curTime = 0;
            double curCookies = 0;
            double curGain = 2;

            while (true) {
                double nothingToDoEstimate = (target - curCookies) / curGain;
                double timeForNextFarm = (farmCost - curCookies) / curGain;
                double gainAfterNextFarm = curGain + farmGain;
                double nothingToDoAfterNextFarm = target / gainAfterNextFarm;
                if (nothingToDoEstimate < timeForNextFarm + nothingToDoAfterNextFarm) {
                    curTime += nothingToDoEstimate;
                    break;
                } else {
                    curTime += timeForNextFarm;
                    curCookies = 0;
                    curGain = gainAfterNextFarm;
                }
            }

            out.println("Case #" + i + ": " + format.format(curTime));
        }
        in.close();
        out.close();
    }

}
