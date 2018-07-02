package methodEmbedding.Standing_Ovation.S.LYD1778;

import java.util.Scanner;

/**
 * Created by poly on 4/11/15.
 */
public class StandingOvation {

    public static void main(String argv[]) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int smax = scanner.nextInt();
            int[] numAudience = new int[smax + 1];
            String s = scanner.next();
            for (int i = 0; i < smax + 1; i++) {
                numAudience[i] = s.charAt(i) - '0';
            }
            int ans = 0;
            int standUp = 0;
            for (int i = 0; i < smax + 1; i++) {
                if (numAudience[i] > 0 && i > standUp) {
                    int diff = i - standUp;
                    ans += diff;
                    standUp += diff;
                }
                standUp += numAudience[i];
            }
            System.out.println("Case #" + (t + 1) + ": " + ans);
        }
    }

}
