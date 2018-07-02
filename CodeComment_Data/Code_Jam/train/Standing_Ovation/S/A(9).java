package methodEmbedding.Standing_Ovation.S.LYD1316;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int Smax = scanner.nextInt();
            int f = 0, all = 0;
            String str = scanner.next();
            for (int i = 0; i < Smax + 1; i++) {
                int s = Integer.parseInt("" + str.charAt(i));
                if (all < i) {
                    f += i - all;
                    all = i;
                }
                all += s;
            }
            System.out.println(String.format("Case #%d: %d", t+1, f));
        }
    }
}
