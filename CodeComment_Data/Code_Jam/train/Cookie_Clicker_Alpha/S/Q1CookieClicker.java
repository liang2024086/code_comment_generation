package methodEmbedding.Cookie_Clicker_Alpha.S.LYD386;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tjedzierowski
 */
public class Q1CookieClicker {
    public static void main(String[] args) {
        MessageFormat mf = new MessageFormat("Case #{0}: {1,number,#.#######}", Locale.US);
        try {
            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
            int numOfCases = Integer.parseInt(stdin.readLine());
            for (int currentCase = 1; currentCase <= numOfCases; currentCase++) {
                String line = stdin.readLine();
                String[] lineSplit = line.split(" ");
                int z = 0;
                double c = Double.parseDouble(lineSplit[0]);
                double f = Double.parseDouble(lineSplit[1]);
                double x = Double.parseDouble(lineSplit[2]);
                double timeSpend = 0;
                while (true) {
                    if (x / (2 + f * (z + 1)) > (x - c) / (2 + f * z)) {
                        timeSpend += (x / (2 + f * z));
                        break;
                    }
                    timeSpend += c / (2 + f * z);
                    z++;
                }
                
                System.out.println(mf.format(new Object[] {currentCase, timeSpend}));
            }
        } catch (IOException ex) {
            System.err.println("Ooops: "+ex.getMessage());
        }
    }

}
