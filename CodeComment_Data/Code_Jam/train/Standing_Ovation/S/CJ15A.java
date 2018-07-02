package methodEmbedding.Standing_Ovation.S.LYD2210;

import java.util.*;
public class CJ15A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int u=1; u<=k; u++) {
            int m = sc.nextInt();
            String v = sc.next();
            int ppl = 0;
            int result = 0;
            for (int i=0; i<=m; i++) {
                int curr = v.charAt(i)-'0';
                result = Math.max(result, i-ppl);
                ppl += curr;
            }
            System.out.println("Case #" + u + ": " + result);
        }
    }
}
