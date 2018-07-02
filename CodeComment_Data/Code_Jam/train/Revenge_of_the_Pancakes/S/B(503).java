package methodEmbedding.Revenge_of_the_Pancakes.S.LYD274;

import java.util.*;
import static java.lang.Math.*;

public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int t = 1; t <= T; t++) {
            String S = in.next();
            S += "+";
            int ans = 0;
            for (int i = 0; i + 1 < S.length(); i++)
                if (S.charAt(i) != S.charAt(i+1))
                    ans++;
            System.out.format("Case #%d: %d\n", t, ans);
        }
    }
}
