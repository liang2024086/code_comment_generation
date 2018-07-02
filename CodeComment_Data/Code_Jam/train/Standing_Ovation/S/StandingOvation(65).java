package methodEmbedding.Standing_Ovation.S.LYD2124;

/**
 * Created by tripathy on 4/10/15.
 */
import java.io.*;
import java.util.*;

public class StandingOvation {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));

        int T = Integer.parseInt(in.readLine());
        for (int t = 1; t <= T; t++) {
            StringTokenizer tokenizer = new StringTokenizer(in.readLine());
            int len = Integer.parseInt(tokenizer.nextToken());
            String shyness = tokenizer.nextToken();

            int sum = 0;
            int ans = 0;
            for (int i = 0; i <= len; i++) {
                if (sum >= i) {
                    sum += shyness.charAt(i) - 48;
                } else {
                    ans += i - sum;
                    sum = i;
                    sum += shyness.charAt(i) - 48;
                }
            }

            out.println("Case #" + t + ": " + ans);
        }

        out.close();
    }
}
