package methodEmbedding.Standing_Ovation.S.LYD338;

import java.util.Scanner;

/**
 * Created by jianghaiting on 15/4/8.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        for (int c = 1; c <= t; c++) {
            int n = sc.nextInt();
            String s = sc.next();
            int result = 0;
            int sum = 0;
            for (int i = 0; i <= n; i++) {
                if (sum < i) {
                    result += i - sum;
                    sum = i;
                }
                sum += s.charAt(i) - '0';
            }
            System.out.printf("Case #%d: %d\n", c, result);
        }

    }

}
