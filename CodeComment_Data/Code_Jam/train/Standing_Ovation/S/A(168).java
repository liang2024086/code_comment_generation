package methodEmbedding.Standing_Ovation.S.LYD1252;


import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int testCase = 1; testCase <= T; ++testCase) {
            int n = sc.nextInt();
            String word = sc.next();
            int clapping = 0;
            int extra = 0;
            for (int i = 0; i <= n; ++i) {
                int digit = Character.digit(word.charAt(i), 10);
                if (digit == 0)
                    continue;
                if (clapping < i) {
                    extra += i - clapping;
                    clapping = i;
                }
                clapping += digit;
            }
            System.out.printf("Case #%d: %d\n", testCase, extra);
        }
    }
}
