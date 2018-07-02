package methodEmbedding.Standing_Ovation.S.LYD134;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by mafulafunk on 13.03.15.
 */
public class StandingOvations {
    private static int cases;

    public static void main(String[] args) throws IOException {
        File in = new File("/Users/mafulafunk/Downloads/A-small-attempt2.in");
//        File in = new File("/Users/mafulafunk/Downloads/StandingOv.in");
        PrintWriter out = new PrintWriter("output.txt");
        BufferedReader br = new BufferedReader(new FileReader(in));
        int T = Integer.valueOf(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] vals = br.readLine().split(" ");
            int S_MAX = Integer.valueOf(vals[0]);
            String audience = vals[1];

            if (S_MAX + 1 != audience.length()) {
                throw new RuntimeException("invalid input case: " + (i + 1) +
                        "  S_MAX:" + S_MAX + "audience.length()" + audience.length());
            }

            int friends = 0;
            int standing = 0;
            for (int j = 0; j <= S_MAX; j++) {
                int missing = 0;
                int valAt = Integer.parseInt(String.valueOf(audience.charAt(j)));
                if (standing < j && valAt > 0) {
                    missing = j - standing;
                    friends = friends + missing;
                    standing = standing + missing;
                }
                standing = standing + valAt;
            }
            out.println("Case #" + (i + 1) + ": " + friends);
        }
        out.flush();
        out.close();
    }
}
