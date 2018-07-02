package methodEmbedding.Magic_Trick.S.LYD1583;

import java.util.*;

public class GCJ2014QA {
    static Set<Integer> set1 = new HashSet<>();
    static Set<Integer> set2 = new HashSet<>();
    static Set<Integer> set = new HashSet<>();

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] card = new int[4][4];
        for (int k = 1; k <= t; k++) {
            int row = sc.nextInt() - 1;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    card[i][j] = sc.nextInt();
                }
            }
            set1.clear();
            for (int j = 0; j < 4; j++) {
                set1.add(card[row][j]);
            }
            row = sc.nextInt() - 1;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    card[i][j] = sc.nextInt();
                }
            }
            set2.clear();
            for (int j = 0; j < 4; j++) {
                set2.add(card[row][j]);
            }
            set.clear();
            for (int i : set1) {
                if (set2.contains(i)) {
                    set.add(i);
                }
            }
            if (set.size() > 1) {
                System.out.println("Case #" + k + ": " + "Bad magician!");
                continue;
            }
            if (set.size() == 0) {
                System.out.println("Case #" + k + ": " + "Volunteer cheated!");
                continue;
            }
            int result = 0;
            for (int i : set) {
                result = i;
            }
            System.out.println("Case #" + k + ": " + result);
        }
    }
}
