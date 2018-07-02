package methodEmbedding.Cookie_Clicker_Alpha.S.LYD868;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.StringTokenizer;

/**
 * @author Priscilla
 */
public class CookieClicker {

    public static void main(String[] args) {
        /**
         * C = price per farm
         * F = cookies per second per farm
         * X = nr of cookies to finish
         *
         * 1 ??? C ??? 10000
         * 1 ??? F ??? 100
         * 1 ??? X ??? 100000
         *
         * CpS = 2 + F * farms
         * RoI = C/F
         * X/(2+F*farms) < C/F
         *
         * t = ?
         */

        try {
            FileReader input = new FileReader("input.txt");
            BufferedReader in = new BufferedReader(input);

            FileWriter output = new FileWriter("output.txt");
            BufferedWriter out = new BufferedWriter(output);
            String line;

            line = in.readLine();
            int nrOfCases = Integer.parseInt(line);

            for (int caseNr = 1; caseNr <= nrOfCases; caseNr++) {
                line = in.readLine();
                StringTokenizer lineTokens = new StringTokenizer(line, " ");
                BigDecimal c = new BigDecimal(lineTokens.nextToken());
                BigDecimal f = new BigDecimal(lineTokens.nextToken());
                BigDecimal x = new BigDecimal(lineTokens.nextToken());
                BigDecimal cps = new BigDecimal(2);
                BigDecimal farms = x.divide(c, 9, RoundingMode.HALF_UP).
                        subtract(cps.divide(f, 9, RoundingMode.HALF_UP)).
                        setScale(0, RoundingMode.DOWN);
                
                BigDecimal time = new BigDecimal(0);
                int farmNr = farms.intValue();
                for (int i = 0; i<farmNr; i++){
                    time = time.add(c.divide(cps, 9, RoundingMode.HALF_UP));
                    cps = cps.add(f);
                }
                time = time.add(x.divide(cps, 7, RoundingMode.HALF_UP));
                
                out.write("Case #" + caseNr + ": " + time);
                out.newLine();
            }
            out.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
