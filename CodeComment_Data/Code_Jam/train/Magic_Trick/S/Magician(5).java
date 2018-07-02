package methodEmbedding.Magic_Trick.S.LYD1825;

import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.lang.String;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Magician {
    public static void main(String[] args) throws IOException {

        int testCase = 0;
        Scanner sc = new Scanner(new FileReader("A-small-attempt2.in"));

        File fin = new File("output.in");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fin.getAbsoluteFile()));
        testCase = sc.nextInt();

        for (int count = 1; count <= testCase; count++) {
            int flag = 0;
            int matchFound = 0;
            String stmatchFound;
            int[][] mat1 = new int[4][4];

            int choice1 = sc.nextInt();
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    mat1[i][j] = sc.nextInt();
                }
            }
            int choice2 = sc.nextInt();
            int[][] mat2 = new int[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    mat2[i][j] = sc.nextInt();
                }
            }
            for (int j = 0; j < 4; j++) {
                int tmp = mat1[choice1 - 1][j];
                for (int i = 0; i < 4; i++) {
                    if (mat2[choice2 - 1][i] == tmp) {
                        flag += 1;
                        matchFound = tmp;
                    }
                }

            }
            if (flag == 0) {

                bufferedWriter.write("case #" + count + ": " + "Volunteer cheated!\n", 0, ("case #" + count + ": " + "Volunteer cheated!\n").length());
            }
            if (flag > 1) {

                bufferedWriter.write("case #" + count + ": " + "Bad magician!\n");
            }
            if (flag == 1) {
                stmatchFound = "case #" + count + ": " + String.valueOf(matchFound).trim() + "\n";

                bufferedWriter.write(stmatchFound);
            }


        }
        bufferedWriter.close();
    }

}
