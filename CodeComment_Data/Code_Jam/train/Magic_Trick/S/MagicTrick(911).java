package methodEmbedding.Magic_Trick.S.LYD847;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: chengpan
 * Date: 4/11/14
 * Time: 6:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class MagicTrick {

    static int[][] m1 = new int[4][4];
    static int[][] m2 = new int[4][4];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int row1 = sc.nextInt();
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    m1[j][k] = sc.nextInt();
                }
            }

            int row2 = sc.nextInt();
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    m2[j][k] = sc.nextInt();
                }
            }

            Set<Integer> s1 = new HashSet();
            Set<Integer> s2 = new HashSet();

            for (int j = 0; j < 4; j++) {
                s1.add(m1[row1-1][j]);
            }
            for (int j = 0; j < 4; j++) {
                s2.add(m2[row2-1][j]);
            }

            int count = 0;
            int elem = 0;
            for (Integer elem1 : s1) {
                if (s2.contains(elem1)) {
                    count ++;
                    elem = elem1;
                }
            }

            String s;
            if (count == 1) {
                s = elem+"";
            } else if (count == 0) {
                s = "Volunteer cheated!";
            } else {
                s = "Bad magician!";
            }

            System.out.println("Case #" + (i + 1) + ": " + s);
        }
    }
}
