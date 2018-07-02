package methodEmbedding.Counting_Sheep.S.LYD736;

import java.util.*;

public class SolutionA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int t = 1; t <= T; t++) {
            int n = s.nextInt();
            System.out.print(String.format("Case #%d: ", t));
            boolean[] f = new boolean[10];
            int cur = 0;
            int count = 0;
            for (int i = 0; i < 10000 && count < 10; i++) {
                cur += n;
                int m = cur;
                while (m != 0) {
                    int b = m % 10;
                    m /= 10;
                    if (!f[b]) {
                        count++;
                        f[b] = true;
                    }
                }
            }
            if (count < 10) {
                System.out.println("INSOMNIA");
            } else {
                System.out.println(cur);
            }
        }
        s.close();
    }
}
