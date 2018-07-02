package methodEmbedding.Standing_Ovation.S.LYD108;


import java.util.Scanner;

/**
 * Created by Pavel Konnikov, MPK LLC.
 */
public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; ++i) {
            int total = 0;
            int friends = 0;

            int Smax = scanner.nextInt();
            String levels = scanner.next();

            for (int j = 0; j < Smax + 1; j++) {
                int level = Character.digit(levels.charAt(j), 10);
                if (total < j) {
                    friends += j - total;
                    total += j - total;
                }
                total += level;
            }
            System.out.println("Case #" + (i+1) + ": " + friends);
        }
    }
}
