package methodEmbedding.Magic_Trick.S.LYD749;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by pasindup on 4/12/14.
 */
public class A {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int T = c.nextInt();
        for (int t = 1; t < T + 1; t++) {
            String ans = "";
            TreeSet<Integer> pos = new TreeSet<Integer>();
            int row = c.nextInt();
            for (int j = 0; j < 5; j++) {
                if (j == row) {
                    for (int i = 0; i < 4; i++) {
                        pos.add(c.nextInt());
                    }
                }
                c.nextLine();
            }

            row = c.nextInt();
            int isDup = 0;
            for (int j = 0; j < 5; j++) {
                if (j == row) {
                    for (int i = 0; i < 4; i++) {
                        int y = c.nextInt();
                        if (pos.contains(y)) {
                            if (isDup == 1) {
                                ans = "Bad magician!";
                                isDup = 2;
                                break;
                            }
                            isDup = 1;
                            ans = y + "";
                        }
                    }
                }
                c.nextLine();
            }
            if (isDup == 0) {
                ans = "Volunteer cheated!";
            }
            System.out.println("Case #" + t + ": " + ans);
        }
    }
}
