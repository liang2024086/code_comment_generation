package methodEmbedding.Magic_Trick.S.LYD600;

import java.io.*;
import java.util.*;

public class A {
    public static void main(String[] args) throws Exception {
        // file handlers
        // first param is input file name
        // second param is output file name
        Scanner input = new Scanner(new File(args[0]));
        PrintStream output = new PrintStream(new FileOutputStream(args[1]));

        input.useDelimiter("\n|\r\n| ");

        int numCases = input.nextInt();
        int caseCount = 0;

        while (input.hasNext()) {
            caseCount++;

            int q1 = input.nextInt();

            int[][] m1 = new int[][] {
                { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() },
                { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() },
                { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() },
                { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() }
            };

            int q2 = input.nextInt();

            int[][] m2 = new int[][] {
                { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() },
                { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() },
                { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() },
                { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() }
            };

            ArrayList<Integer> matches = new ArrayList<>();
            for (int i1 : m1[q1 - 1]) {
                for (int i2 : m2[q2 - 1]) {
                    System.out.println("Comparing " + i1 + " " + i2);
                    if (i1 == i2) {
                        matches.add(i1);
                    }
                }
            }

            if (matches.size() == 0) {
                output.println("Case #" + caseCount + ": Volunteer cheated!");
            } else if (matches.size() > 1) {
                output.println("Case #" + caseCount + ": Bad magician!");
            } else {
                output.println("Case #" + caseCount + ": " + matches.get(0));
            }
        }
    }
}
