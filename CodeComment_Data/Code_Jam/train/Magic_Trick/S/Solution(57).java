package methodEmbedding.Magic_Trick.S.LYD389;

/**
 * Created by sirlate on 4/12/14.
 */
import javax.swing.tree.TreePath;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Solution {

    public static void main(String... args) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }
        try {
            FileWriter fileWriter = new FileWriter("result.txt");
            TreePath treePath = new TreePath("");

            int t = scanner.nextInt();
            scanner.nextLine();

            for (int m =0; m < t; m++) {
                int[][] array = new int[4][4];

                int a = scanner.nextInt();
                scanner.nextLine();
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        array[i][j] = scanner.nextInt();
                    }
                    scanner.nextLine();
                }

                int b = scanner.nextInt();
                int[][] array2 = new int[4][4];
                scanner.nextLine();
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        array2[i][j] = scanner.nextInt();
                    }
                    try {
                    scanner.nextLine();
                     } catch (NoSuchElementException e) {
                        e.printStackTrace();
                    } catch (NoSuchElementException e) {

                    }

                }

                int common = 0;
                int column = 0;
                for (int i = 0; i < 4; i++) {
                    for(int j = 0; j < 4; j++) {
                        if (array[a-1][i] == array2[b-1][j]) {
                            common++;
                            column = i;
                        }
                    }
                }

                if (common == 0 ){
                    fileWriter.write("Case #" + (m + 1) +": Volunteer cheated!\n");
                } else if (common == 1) {
                    fileWriter.write("Case #" + (m + 1) +": " + array[a-1][column] + "\n");
                } else {
                    fileWriter.write("Case #" + (m + 1) +": Bad magician!\n");
                }
            }
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

