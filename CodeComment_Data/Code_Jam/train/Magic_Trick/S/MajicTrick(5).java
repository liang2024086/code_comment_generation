package methodEmbedding.Magic_Trick.S.LYD275;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author biman
 */
public class MajicTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File input_file = new File("/home/biman/A-small-attempt0.in");
        File output_file = new File("/home/biman/output.txt");
        try {
            Scanner scanner = new Scanner(input_file, "UTF-8");
            PrintWriter out = new PrintWriter(output_file);

            int test_case = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < test_case; i++) {
                int R1;
                int R2;
                int grid1[][] = new int[4][4];
                int grid2[][] = new int[4][4];
                int count = 0;
                int number = 0;
                R1 = Integer.parseInt(scanner.nextLine());
                for (int j = 0; j < 4; j++) {
                    String line = scanner.nextLine();
                    String row[] = line.split(" ");
                    grid1[j][0] = Integer.parseInt(row[0]);
                    grid1[j][1] = Integer.parseInt(row[1]);
                    grid1[j][2] = Integer.parseInt(row[2]);
                    grid1[j][3] = Integer.parseInt(row[3]);
                }
                R2 = Integer.parseInt(scanner.nextLine());
                for (int j = 0; j < 4; j++) {
                    String line = scanner.nextLine();
                    String row[] = line.split(" ");
                    grid2[j][0] = Integer.parseInt(row[0]);
                    grid2[j][1] = Integer.parseInt(row[1]);
                    grid2[j][2] = Integer.parseInt(row[2]);
                    grid2[j][3] = Integer.parseInt(row[3]);
                }

                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 4; k++) {
                        if (grid1[R1 - 1][j] == grid2[R2 - 1][k]) {
                            count++;
                            number = grid1[R1 - 1][j];
                        }
                    }
                }

                switch (count) {
                    case 0:
                        out.println("Case #" + (i + 1) + ": Volunteer cheated!");
                        System.out.println("Case #" + (i + 1) + ": Volunteer cheated!");
                        break;
                    case 1:
                        out.println("Case #" + (i + 1) + ": " + number);
                        System.out.println("Case #" + (i + 1) + ": " + number);
                        break;
                    default:
                        out.println("Case #" + (i + 1) + ": Bad magician!");
                        System.out.println("Case #" + (i + 1) + ": Bad magician!");

                }
            }
            out.close();
            scanner.close();
        } catch (Exception e) {
            System.out.println("Could not open File");
        }

    }
}
