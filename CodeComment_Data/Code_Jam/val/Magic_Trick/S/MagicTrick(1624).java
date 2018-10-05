package methodEmbedding.Magic_Trick.S.LYD2125;

import java.util.Scanner;

/**
 * FileName: MagicTrick.java
 * @Description:
 * 
 * @author Xunhu(Tiger) Sun
 *         email: sunx2013@my.fit.edu
 * @date Apr 11, 2014 8:47:59 PM
 */
public class MagicTrick {
    public static void main (final String[] args) {
        final Scanner s = new Scanner(System.in);
        final int tc = s.nextInt();
        s.nextLine();
        for (int tci = 1; tci <= tc; tci++) {
            final int[] fr = new int[4];
            final int[] sr = new int[4];
            final int fl = s.nextInt()-1;
            s.nextLine();
            for (int r = 0; r < 4; r++) {
                for (int c = 0; c < 4; c++) {
                    final int temp = s.nextInt();
                    if (fl == r) {
                        fr[c] = temp;
                    }
                }
                s.nextLine();
            }
            final int sl = s.nextInt()-1;
            for (int r = 0; r < 4; r++) {
                for (int c = 0; c < 4; c++) {
                    final int temp = s.nextInt();
                    if (sl == r) {
                        sr[c] = temp;
                    }
                }
                s.nextLine();
            }
            int count = 0;
            int ans = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (fr[i] == sr[j]) {
                        count++;
                        ans = fr[i];
                        break;
                    }
                }
            }
            final String answer;
            if (count == 0) {
                answer = "Volunteer cheated!";
            } else if (count == 1) {
                answer = String.valueOf(ans);
            } else {
                answer = "Bad magician!";
            }
            System.out.printf("Case #%d: %s%n", tci, answer);
        }
        s.close();
    }
}
