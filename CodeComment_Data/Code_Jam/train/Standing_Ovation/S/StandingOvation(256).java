package methodEmbedding.Standing_Ovation.S.LYD1332;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import javax.imageio.IIOException;

/**
 *
 * @author d3m0li5h3r
 */
public class StandingOvation {

    private static int noOfTestCases;
    private static int sMax;
    private static int n;
    private static int count;

    private static BufferedReader br;
    private static PrintWriter out;

    private static String file = "A-small-attempt1";

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        try {
            br = new BufferedReader(new FileReader(file + ".in"));
            out = new PrintWriter(file + ".out");

            noOfTestCases = Integer.parseInt(br.readLine());

            for (int i = 0; i < noOfTestCases; i++) {
                count = 0;
                n = 0;
                sb.append("Case #").append(i + 1).append(": ");
                String[] testCase = br.readLine().split(" ");
                sMax = Integer.parseInt(testCase[0]);
                for (int j = 0; j < sMax; j++) {
                    count += Character.getNumericValue(testCase[1].charAt(j));
                    if (count + n < j + 1) {
                        n = j + 1 - count;
                    }
                }
                sb.append(n).append("\n");
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            out.print(sb.toString());
            out.close();
        }
    }

}
