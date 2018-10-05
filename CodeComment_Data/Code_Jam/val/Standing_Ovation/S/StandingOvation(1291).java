package methodEmbedding.Standing_Ovation.S.LYD1425;

import java.util.Scanner;

/**
 * Created by William on 2015-04-10.
 */
public class StandingOvation {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = Integer.parseInt(in.nextLine());
        for (int tt = 0; tt < cases; tt ++) {
            int max = Integer.parseInt(in.next()) + 1;
            String levels = in.nextLine().trim();
            int current = levels.charAt(0) - '0';
            int need = 0;
            for (int i = 1; i < max; i ++) {
                int level = levels.charAt(i) - '0';
                if (current < i) {
                    need += (i - current);
                    current = i;
                }
                current += level;
            }
            System.out.printf("Case #%d: %d\n", tt + 1, need);
        }

    }
}
