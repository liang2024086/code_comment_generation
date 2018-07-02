package methodEmbedding.Counting_Sheep.S.LYD250;

import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 0; i < t; i++) {
            int n = s.nextInt();
            if (n == 0) {
                System.out.format("Case #%d: INSOMNIA%n", i + 1);
            } else {
                Set<Integer> set = new HashSet<>();
                int nn = n;
                while(set.size() < 10) {
                    int nnn = nn;
                    while(nnn > 0) {
                        set.add(nnn % 10);
                        nnn /= 10;
                    }
                    nn += n;
                }
                System.out.format("Case #%d: %d%n", i + 1, nn - n);
            }
        }
    }
}
