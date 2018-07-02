package methodEmbedding.Magic_Trick.S.LYD561;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by alkudryashov on 12/04/14.
 */
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int tests = cin.nextInt();
        for (int tc = 0; tc < tests; tc++) {
            int r1 = cin.nextInt() - 1;
            Set<Integer> set = new HashSet<Integer>();
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    int c = cin.nextInt();
                    if (i == r1) {
                        set.add(c);
                    }
                }
            }
            int r2 = cin.nextInt() - 1;
            Set<Integer> set2 = new HashSet<Integer>();
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    int c = cin.nextInt();
                    if (i == r2) {
                        set2.add(c);
                    }
                }
            }
            set.retainAll(set2);
            System.out.print("Case #" + (tc + 1) + ": ");
            if (set.size() == 0) {
                System.out.println("Volunteer cheated!");
            }
            if (set.size() == 1) {
                System.out.println(set.iterator().next());
            }
            if (set.size() > 1) {
                System.out.println("Bad magician!");
            }
        }
    }
}
