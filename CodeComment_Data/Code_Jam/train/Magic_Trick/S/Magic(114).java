package methodEmbedding.Magic_Trick.S.LYD1325;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

/**
 *
 * @author GIHAN
 */
public class Magic {

    public static void main(String[] args) {
        try {
            BufferedReader input = new BufferedReader(new FileReader("E:/codejam/A-small-attempt0.in"));
            FileWriter output = new FileWriter("E:/codejam/A-small-attempt0.out");
            int cases = Integer.parseInt(input.readLine());
            int[] arr = new int[cases];

            for (int i = 0; i < cases; i++) {
                String[] s = input.readLine().split(" ");
                int fRow = Integer.parseInt(s[0]);
                String[] rowValues1 = new String[4];
                System.out.println("first row" + fRow);
                for (int j = 1; j <= 4; j++) {
                    if (j == fRow) {
                        rowValues1 = input.readLine().split(" ");
                    } else {
                        input.readLine();
                    }
                }

                String[] s2 = input.readLine().split(" ");
                int SRow = Integer.parseInt(s2[0]);
                System.out.println("second row " + SRow);
                String[] rowValues2 = new String[4];

                for (int j = 1; j <= 4; j++) {
                    if (j == SRow) {
                        rowValues2 = input.readLine().split(" ");
                    } else {
                        input.readLine();
                    }
                }

                for (int j = 0; j < 4; j++) {
                    System.out.print(rowValues1[j] + " ");
                }
                System.out.println("");
                for (int j = 0; j < 4; j++) {
                    System.out.print(rowValues2[j] + " ");
                }
                System.out.println("//////////////");

                int matchCount = 0;
                String card = "";
                for (int j = 0; j < 4; j++) {
                    if (rowValues1[j].equals(rowValues2[0])) {
                        matchCount++;
                        card = rowValues1[j];
                    } else if (rowValues1[j].equals(rowValues2[1])) {
                        matchCount++;
                        card = rowValues1[j];
                    } else if (rowValues1[j].equals(rowValues2[2])) {
                        matchCount++;
                        card = rowValues1[j];
                    } else if (rowValues1[j].equals(rowValues2[3])) {
                        matchCount++;
                        card = rowValues1[j];
                    }
                }
                System.out.println("Match count " + matchCount);

                if (matchCount == 1) {
                   // System.out.println(card);
                    output.write("Case #" + (i + 1) + ": " + card + "\n");
                } else if (matchCount >= 2) {
                   // System.out.println("Bad magician!");
                    output.write("Case #" + (i + 1) + ": Bad magician!\n");
                } else if (matchCount == 0) {
                    output.write("Case #" + (i + 1) + ": Volunteer cheated!\n");
                   // System.out.println("Volunteer cheated!");
                }
            }
            input.close();
            output.flush();
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
