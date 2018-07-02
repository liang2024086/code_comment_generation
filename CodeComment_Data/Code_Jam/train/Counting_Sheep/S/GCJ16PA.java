package methodEmbedding.Counting_Sheep.S.LYD423;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
import java.util.*;
import java.io.*;

public class GCJ16PA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner code from Google stdin/out Tutorial
        int caseNumber = 1;
        int cases;
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        cases = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        for (caseNumber = 1; caseNumber <= cases; ++caseNumber) {
            int currentProduct = 0;
            int iteration = 0;
            boolean[] seen = new boolean[10];
            boolean hasSeenAll = false;
            int n = in.nextInt();
            if (n != 0) {
                do {

                    iteration++;
                    currentProduct = n * iteration;
                    String tmpAsString = String.valueOf(currentProduct);
                    for (int i = 0; i < tmpAsString.length(); i++) {
                        int intAtPosition = Integer.parseInt(String.valueOf(tmpAsString.charAt(i)));
                        seen[intAtPosition] = true;
                    }
                    hasSeenAll = seen[0] && seen[1] && seen[2] && seen[3] && seen[4] && seen[5] && seen[6] && seen[7] && seen[8] && seen[9];
                } while (!hasSeenAll);

                System.out.println("Case #" + caseNumber + ": " + currentProduct);
            } else {
                System.out.println("Case #" + caseNumber + ": INSOMNIA");
            }
        }
    }

}
