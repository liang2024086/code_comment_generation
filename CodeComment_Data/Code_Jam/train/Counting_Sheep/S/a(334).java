package methodEmbedding.Counting_Sheep.S.LYD1605;

import java.io.*;
import java.util.*;

public class a {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));        
        int T = Integer.parseInt(in.readLine());
        for (int t = 1; t <= T; t++) {
            int n = Integer.parseInt(in.readLine());
            if (n == 0) {
                System.out.printf("Case #%d: INSOMNIA\n", t);
                continue;
            }
            int rem0 = 0, cnt = 0;
            boolean[] seen = new boolean[10];
            while (n % 10 == 0) {
                rem0++;
                n /= 10;
                seen[0] = true;
                cnt = 1;
            }
            int cur = n;
            while (cnt < 10) {
                int tmp = cur;
                while (tmp > 0) {
                    int d = tmp % 10;
                    if (!seen[d]) {
                        seen[d] = true;
                        cnt++;
                    }
                    tmp /= 10;
                }
                if (cnt < 10) cur += n;
            }
            System.out.printf("Case #%d: %d", t, cur);
            while (rem0-- > 0) System.out.printf("0");
            System.out.println();
        }
    }
}
