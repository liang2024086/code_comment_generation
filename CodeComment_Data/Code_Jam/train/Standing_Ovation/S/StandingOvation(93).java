package methodEmbedding.Standing_Ovation.S.LYD2079;

import java.io.*;
import java.util.Scanner;

/**
 * Created by ankurgupta on 4/11/15.
 */
public class StandingOvation {

    public static void main(String[] argv) throws IOException {
        Scanner in = new Scanner(new FileReader("/Users/ankurgupta/Desktop/codeJam/A-small-attempt2.in"));
        Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("/Users/ankurgupta/Desktop/codeJam/A-small-attempt2.out"), "utf-8"));
        int T = in.nextInt();
        int cases = 0;
        while (T-- > 0) {
            int SMax = in.nextInt();
            String str = in.next();
            int cnt = 0;
            int ans = 0;
            cnt += (str.charAt(0) - '0');
            for (int i = 1; i <= SMax; i++) {
                int add = Math.max(0, i - cnt);
                ans += add;
                cnt += (str.charAt(i) - '0') + add;
            }
            writer.write("Case #" + ++cases + ": " + ans + "\n");
        }
        writer.close();
    }
    
}
