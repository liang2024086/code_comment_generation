package methodEmbedding.Standing_Ovation.S.LYD1857;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Luis Carlos Sanchez
 */
public class StandingOvation {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("a.out");
            int T = Integer.parseInt(br.readLine());
            for (int i = 1; i <= T; i++) {
                if (i != 1) {
                    pw.println();
                }
                String[] lineComps = br.readLine().split(" ");
                int Smax = Integer.parseInt(lineComps[0]);
                char[] shynessCount = lineComps[1].toCharArray();
                int standsCount = 0;
                int friendsRequired = 0;
                for (int j = 0; j < shynessCount.length; j++) {
                    int currentShynessCount = shynessCount[j] - 48;
                    if (currentShynessCount != 0 && standsCount < j) {
                        int currentRequired = (j - standsCount);
                        friendsRequired += currentRequired;
                        standsCount += currentRequired;
                    }
                    standsCount += currentShynessCount;
                }
                pw.print(String.format("Case #%d: %d", i, friendsRequired));
            }
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }
}
