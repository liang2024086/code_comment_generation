package methodEmbedding.Revenge_of_the_Pancakes.S.LYD390;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Solver {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("revenge-pancakes/src/B-small-attempt0.in"));
        System.setOut(new PrintStream("revenge-pancakes/src/B-small-attempt0.out"));
        Scanner input = new Scanner(System.in);
        int numCases = input.nextInt();

        PancakeFlipper pancakeFlipper = new PancakeFlipper();

        for (int n = 0; n < numCases; ++n) {
            String stack = input.next();

            int result = pancakeFlipper.flipPancakes(stack);

            System.out.printf("Case #%d: %d\n", n + 1, result);
        }
    }
}
