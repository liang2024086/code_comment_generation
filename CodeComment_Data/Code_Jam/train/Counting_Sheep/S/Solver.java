package methodEmbedding.Counting_Sheep.S.LYD603;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Solver {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("counting-sheep/src/A-small-attempt0.in"));
        System.setOut(new PrintStream("counting-sheep/src/A-small-attempt0.out"));
        Scanner input = new Scanner(System.in);
        int numCases = input.nextInt();

        SheepCounter sheepCounter = new SheepCounter();

        for (int n = 0; n < numCases; ++n) {
            int N = input.nextInt();

            int result = sheepCounter.countSheep(N);

            if (result == 0) {
                System.out.printf("Case #%d: INSOMNIA\n", n + 1);
            } else {
                System.out.printf("Case #%d: %d\n", n + 1, result);
            }
        }
    }
}
