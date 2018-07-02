package methodEmbedding.Revenge_of_the_Pancakes.S.LYD873;

import java.util.Scanner;

public class RevengePancakeProblem {
    static Scanner sc = new Scanner(System.in);
    public static void main(String a[]) {
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            char[] pancakes = sc.next().toCharArray();
            char s = pancakes[0];
            int swaps = 0;
            for (int i = 1; i < pancakes.length; i++) {
                if (pancakes[i]!=s) {
                    s = pancakes[i];
                    swaps++;
                }
            }
            if (s=='-') swaps++;
            System.out.println("Case #"+t+": "+swaps);
        }
    }
}
