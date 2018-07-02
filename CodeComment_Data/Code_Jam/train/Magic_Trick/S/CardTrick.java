package methodEmbedding.Magic_Trick.S.LYD1556;

import java.util.Arrays;
import java.util.Scanner;

public class CardTrick {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numTests = in.nextInt();
        for (int t = 0; t < numTests; t++) {
            int firstAnswer = in.nextInt();
            int[][] grid = new int[4][4];
            for (int row = 0; row < 4; row++) {
                for (int col = 0; col < 4; col++) {
                    grid[row][col] = in.nextInt();
                }
            }
            int secondAnswer = in.nextInt();
            int[][] secondGrid = new int[4][4];
            for (int row = 0; row < 4; row++) {
                for (int col = 0; col < 4; col++) {
                    secondGrid[row][col] = in.nextInt();
                }
            }

            final int[] firstRow = grid[firstAnswer-1];
            Arrays.sort(firstRow);
            final int[] secondRow = secondGrid[secondAnswer-1];
            Arrays.sort(secondRow);

            int lastMatch = -1;
            int matchCount = 0;
            int j = 0;
            int i = 0;
            while (i < 4 && j < 4) {
                if (firstRow[i] == secondRow[j]) {
                    matchCount++;
                    lastMatch = firstRow[i];
                    i++;
                    j++;
                } else if (firstRow[i] > secondRow[j]) {
                    j++;
                } else if(firstRow[i] < secondRow[j]) {
                    i++;
                }
            }

            String result = null;
            if (matchCount == 1) {
                result = "" + lastMatch;
            } else if (matchCount == 0) {
                result = "Volunteer cheated!";
            } else if (matchCount > 1) {
                result = "Bad magician!";
            }


            System.out.format("Case #%d: %s\n", t + 1, result);
        }
    }
}
