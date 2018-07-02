package methodEmbedding.Magic_Trick.S.LYD1082;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Magician {

    public static void main(String[] args) {
        try {
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));

            int testCases = Integer.valueOf(br.readLine());
            for (int i = 0; i < testCases; i++) {
                int solution1 = Integer.valueOf(br.readLine());
                int[][] grid1 = new int[4][4];
                for (int j = 0; j < 4; j++) {
                    String[] elements = br.readLine().split(" ");
                    for (int k = 0; k < 4; k++) {
                        grid1[j][k] = Integer.valueOf(elements[k]);
                    }
                }
                int solution2 = Integer.valueOf(br.readLine());
                int[][] grid2 = new int[4][4];
                for (int j = 0; j < 4; j++) {
                    String[] elements = br.readLine().split(" ");
                    for (int k = 0; k < 4; k++) {
                        grid2[j][k] = Integer.valueOf(elements[k]);
                    }
                }
                Set<Integer> set1 = new HashSet<>(4);
                for (int a : grid1[solution1-1]) {
                    set1.add(a);
                }
                Set<Integer> set2 = new HashSet<>(4);
                for (int a : grid2[solution2-1]) {
                    set2.add(a);
                }
                set1.retainAll(set2);
                if (set1.isEmpty()) {
                    System.out.println("Case #" + (i+1) + ": Volunteer cheated!");
                } else if (set1.size() == 1) {
                    System.out.println("Case #" + (i+1) + ": " + set1.iterator().next());
                } else {
                    System.out.println("Case #" + (i+1) + ": Bad magician!");
                }
            }

        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
