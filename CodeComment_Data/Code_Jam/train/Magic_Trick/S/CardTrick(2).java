package methodEmbedding.Magic_Trick.S.LYD1006;


import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Vector;

/**
 * I'm such a Java noob.
 * Trying to solve a problem while drunk...such a bad idea.
 *  Author: Rick Sullivan.
 */
public class CardTrick {

    public static void main(String[] args) {
        int numTestCases;
        Scanner scanner = new Scanner(System.in);
        numTestCases = scanner.nextInt();

        for (int n = 0; n < numTestCases; n++) {
            int row1 = scanner.nextInt() - 1;
            int[][] numbers = new int[4][4];

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    numbers[i][j] = scanner.nextInt();
                }
            }

            Vector<Integer> possiblilities= new Vector<Integer>();
            for (int i = 0; i < 4; i++) {
                possiblilities.add(numbers[row1][i]);
            }

            int row2 = scanner.nextInt() - 1;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    numbers[i][j] = scanner.nextInt();
                }
            }

            Vector<Integer> solutions = new Vector<Integer>();
            for (int i = 0; i < possiblilities.size(); i++) {
                for (int j = 0; j < 4; j++) {
                    if (possiblilities.get(i) == numbers[row2][j]) {
                        solutions.add(possiblilities.get(i));
                    }
                }
            }

            System.out.print("Case #" + (n+1) + ": ");
            if (solutions.size() > 1) {
                System.out.print("Bad magician!");
            } else if (solutions.size() <= 0) {
                System.out.print("Volunteer cheated!");
            } else {
                System.out.print(solutions.get(0));
            }
            System.out.print("\n");
        }
    }
}
