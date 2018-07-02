package methodEmbedding.Standing_Ovation.S.LYD813;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by gfaujdar on 4/11/2015.
 */
public class StandingOvation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\Downloads\\A-small-attempt0.in"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Downloads\\A-small-attempt0.out"));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            String[] vals = input.split(" ");
            int Smax = Integer.parseInt(vals[0]);
            String Si = vals[1];

            int totalAvailable = 0;
            int totalRequired = 0;
            for (int j = 0; j < Si.length(); j++) {
                if (totalAvailable >= j) {
                    totalAvailable += Si.charAt(j) - '0';
                } else {
                    totalRequired += (j - totalAvailable);
                    totalAvailable += ((j - totalAvailable) + (Si.charAt(j) - '0'));
                }
            }

            bw.write(String.format("Case #%d: %d", i + 1, totalRequired));
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
