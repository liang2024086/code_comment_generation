package methodEmbedding.Standing_Ovation.S.LYD1340;

import java.io.*;
import java.util.*;

public class A {
    public static void main(String[] args) throws Exception {
        // file handlers
        // first param is input file name
        // second param is output file name
        Scanner input = new Scanner(new File(args[0]));
        PrintStream output = new PrintStream(new FileOutputStream(args[1]));

        input.useDelimiter("\n|\r\n");

        int numCases = input.nextInt();
        int caseCount = 0;
        input.nextLine(); // clear

        while (input.hasNext()) {
            caseCount++;
            String testCase = input.nextLine();
            String[] testCaseArray = testCase.split(" ");

            int sMax = Integer.parseInt(testCaseArray[0]);
            int[] s = new int[sMax+1];

            for (int i = 0; i < s.length; i++) {
                s[i] = testCaseArray[1].charAt(i) - '0';
            }

            int standing = 0;
            int additional = 0;
            for (int i = 0; i < s.length; i++) {
                // System.out.println("Standing = " + standing);
                // System.out.println("Additional = " + additional);
                // System.out.println("i " + i + " s " + s[i]);

                if (standing >= i || s[i] == 0) {
                    standing += s[i];
                } else {
                    // System.out.println("Uh oh!");
                    additional += (i - standing);
                    standing += (i - standing) + s[i];
                }
                // System.out.println();
            }

            output.println("Case #" + caseCount + ": " + additional);
        }
    }
}
