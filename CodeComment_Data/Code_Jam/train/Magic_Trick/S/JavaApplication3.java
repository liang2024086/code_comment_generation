package methodEmbedding.Magic_Trick.S.LYD1267;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nikola
 */
public class JavaApplication3 {

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Scanner scan = new Scanner(new File("A-small-attempt0.in"));
            PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
//            writer.println("The first line");
//            writer.println("The second line");
            int numberOfCases = Integer.parseInt(scan.nextLine());

            for (int i = 0; i < numberOfCases; i++) {
                int firstRowIndex = Integer.parseInt(scan.nextLine());

                //skip irrelevant lines
                for (int iCount = 0; iCount < firstRowIndex - 1; iCount++) {
                    scan.nextLine();
                }
                ArrayList<Integer> firstRow = new ArrayList(4);
                for (int iCount = 0; iCount < 4; iCount++) {
                    firstRow.add(iCount, scan.nextInt());
                }
                scan.nextLine();
                for (int iCount = 0; iCount < 4 - firstRowIndex; iCount++) {
                    scan.nextLine();
                }

                int secondRowIndex = Integer.parseInt(scan.nextLine());
                //skip irrelevant lines
                for (int iCount = 0; iCount < secondRowIndex - 1; iCount++) {
                    scan.nextLine();
                }
                ArrayList<Integer> secondRow = new ArrayList(4);
                for (int iCount = 0; iCount < 4; iCount++) {
                    secondRow.add(iCount, scan.nextInt());
                }
                scan.nextLine();

                for (int iCount = 0; iCount < 4 - secondRowIndex; iCount++) {
                    scan.nextLine();
                }

                int numberOfEquals = 0;
                int value = -1;
                for (int j = 0; j < 4; j++) {
                    int first = (int) firstRow.get(j);
                    for (int k = 0; k < 4; k++) {
                        if (first == (int) secondRow.get(k)) {
                            numberOfEquals++;
                            value = first;
                        }
                    }
                }
                if (numberOfEquals == 0) {
                    writer.println("Case #" + (i + 1) + ": Volunteer cheated!");
                } else if (numberOfEquals > 1) {
                    writer.println("Case #" + (i + 1) + ": Bad magician!");
                } else {
                    writer.println("Case #" + (i + 1) + ": " + value);
                }

            }
            writer.close();

        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch!");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(JavaApplication3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
