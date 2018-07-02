package methodEmbedding.Standing_Ovation.S.LYD817;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        int t, n, count, m, i, j = 1;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        String smax;
        while (j <= t) {
            n = sc.nextInt();
            smax = sc.next();

            count = (smax.charAt(0) - 48);
            m = 0;
            for (i = 1; i <= n; i++) {
                if (count >= i)
                    count = count + (smax.charAt(i) - 48);
             else {
                    m = m + (i - count);
                    count = count + (i - count) + (smax.charAt(i) - 48);
                }
            }
            System.out.println("Case #" + j + ": " + m);
            j++;
        }
    }
}
