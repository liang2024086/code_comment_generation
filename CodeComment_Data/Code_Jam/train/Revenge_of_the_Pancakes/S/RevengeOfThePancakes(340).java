package methodEmbedding.Revenge_of_the_Pancakes.S.LYD240;

import java.util.Scanner;

/**
 * @link https://code.google.com/codejam/contest/6254486/dashboard#s=p1
 * @author saul.martinez
 */
class RevengeOfThePancakes {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // number of tests

        for (int i = 1; i <= t; i ++) {
            String pancakes = in.next();
            char currentSide = pancakes.charAt(0);
            int moves = 0;

            for (int j = 1; j < pancakes.length(); j ++) {
                if (currentSide != pancakes.charAt(j)) {
                    moves ++;
                    currentSide = pancakes.charAt(j);
                }
            }

            if ('-' == currentSide) {
                moves ++;
            }

            System.out.printf("Case #%d: %d\n", i, moves);
        }
    }
}
