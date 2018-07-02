package methodEmbedding.Revenge_of_the_Pancakes.S.LYD600;

import java.util.Scanner;

/**
 * Created by Harsha on 4/9/2016.
 */
public class RevPan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int runs = Integer.parseInt(sc.nextLine());
        for (int run = 1; run <= runs; run++) {
            char[] l = sc.nextLine().toCharArray();
            char prev = l[0];
            int inversions = 0;
            for (char c: l) {
                if (c != prev) {
                    inversions++;
                    prev = c;
                }
            }
            boolean even = inversions % 2 ==0;
            if ((even && l[0] == '+') || (!even && l[0] == '-'))
                System.out.println("Case #" + run + ": " + inversions);
            else
                System.out.println("Case #" + run + ": " + (inversions + 1));
        }
        System.exit(0);
    }
}
