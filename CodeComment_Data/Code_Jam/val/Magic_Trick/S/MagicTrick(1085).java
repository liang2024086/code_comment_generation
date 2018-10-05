package methodEmbedding.Magic_Trick.S.LYD1410;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MagicTrick {

    
    public static void main(String args[]) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        int numberOfTestCases = scanner.nextInt();
        for (int i = 0; i < numberOfTestCases; ++i) {
            int solution = -1;
            int possibleSolution = 0;
            Set<Integer> rowSet = new HashSet<Integer>();
            int answer = scanner.nextInt();
            for (int j = 1; j <= 4; ++j) {
                for (int k = 1; k <= 4; ++k) {
                    if (j == answer) {
                        rowSet.add(scanner.nextInt());
                    } else {
                        scanner.nextInt();
                    }
                }
            }
            int answer2 = scanner.nextInt();
            for (int j = 1; j <= 4; ++j) {
                for (int k = 1; k <= 4; ++k) {
                    int temp = scanner.nextInt();
                    if (j == answer2 && rowSet.contains(temp)) {
                        possibleSolution++;
                        solution = temp;
                    }
                }
            }
            System.out.print("Case #" + (i+1) + ": ");
            switch (possibleSolution) {
                case 0:
                    System.out.println("Volunteer cheated!");
                    break;
                case 1:
                    System.out.println(solution);
                    break;
                default:
                    System.out.println("Bad magician!");

            }

        }

    }

}
