package methodEmbedding.Magic_Trick.S.LYD48;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class MagicTrick {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner inputScanner = new Scanner(new File("c:\\A-small-attempt0.in"));
        System.setOut(new PrintStream(new File("c:\\A-small-attempt0.out")));

        int caseNumb = inputScanner.nextInt();
        int rowNumber;
        int iterator = 1;
        int[][] inputMatrix = new int[4][4];
        int[] firstUsersRow;
        int[] secondUsersRow;
        String output = "";
        while (iterator <= caseNumb) {
            output += "Case #" + iterator + ": ";
            rowNumber = inputScanner.nextInt();
            for (int i = 0; i < 4; i++)
                for (int j = 0; j < 4; j++)
                    inputMatrix[i][j] = inputScanner.nextInt();
            firstUsersRow = inputMatrix[rowNumber - 1].clone();
            rowNumber = inputScanner.nextInt();
            for (int i = 0; i < 4; i++)
                for (int j = 0; j < 4; j++)
                    inputMatrix[i][j] = inputScanner.nextInt();
            secondUsersRow = inputMatrix[rowNumber - 1];
            int suggestion = 0;
            int result = 0;

            for (int i = 0; i < 4; i++)
                for (int j = 0; j < 4; j++)
                    if (firstUsersRow[i] == secondUsersRow[j]) {
                        suggestion++;
                        result = firstUsersRow[i];
                    }
            if (suggestion == 1)
                output += result + "\n";
            else if (suggestion == 0)
                output += "Volunteer cheated!\n";
            else
                output += "Bad magician!\n";
            iterator++;
        }
        System.out.print(output);

    }

}
