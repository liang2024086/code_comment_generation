package methodEmbedding.Standing_Ovation.S.LYD2093;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 1; i <= t; i++) {
            int smax = scanner.nextInt();
            String s = scanner.next();
            int a = 0;
            int ps = 0;
            for (int j = 0; j < s.length(); j++) {
                int nsj = s.charAt(j) - '0';
                ps += nsj;
                int r = j + 1 - ps;
                if (r > 0) {
                    a += r;
                    ps += r;
                }
            }
            System.out.printf("Case #%d: %d\n", i, a);
        }
    }
}
