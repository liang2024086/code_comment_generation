package methodEmbedding.Standing_Ovation.S.LYD1229;

import java.util.*;

public class StandingOvation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int maxS = sc.nextInt();
            String s = sc.next();
            int current = s.charAt(0) - '0';
            int additional = 0;
            for (int j = 1; j <= maxS; j++) {
                int num = s.charAt(j) - '0';
                if (j > current) {
                    additional += j - current;
                    current += num + j - current;
                } else {
                    current += num;
                }
            }
            System.out.printf("Case #%d: %d\n", i + 1, additional);
        }
    }
}
