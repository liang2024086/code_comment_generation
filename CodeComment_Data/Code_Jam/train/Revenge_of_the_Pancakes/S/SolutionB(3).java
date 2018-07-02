package methodEmbedding.Revenge_of_the_Pancakes.S.LYD229;

import java.util.*;

public class SolutionB {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        s.nextLine();
        for (int t = 1; t <= T; t++) {
            String str = s.nextLine();
            int n = str.length();
            int ans = 0;
            boolean[] f = new boolean[n];
            for (int i = 0; i < n; i++) {
                f[i] = str.charAt(i) == '+';
            }
            for (int i = n - 1; i >= 0; i--) {
                if (!f[i]) {
                    ans++;
                    for (int j = 0; j < i; j++) {
                        f[j] = !f[j];
                    }
                }
            }
            System.out.println(String.format("Case #%d: %d", t, ans));
        }
        s.close();
    }
}
