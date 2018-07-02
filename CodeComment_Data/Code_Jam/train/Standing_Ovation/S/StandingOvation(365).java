package methodEmbedding.Standing_Ovation.S.LYD907;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Ran on 11/04/2015.
 */
public class StandingOvation {
    public static void main (String[] args) {

        Scanner s = null;
        try {
//            s = new Scanner (new File("A-small-test.in"));
         s = new Scanner (new File ("A-small-attempt0.in"));
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        }

        int t = s.nextInt();
        String dummyLine = s.nextLine();

        // Traverse all test cases.
        for (int test = 1; test <= t; test++) {

            int totalToAdd = 0;

            int sMax = s.nextInt();
            String membersString = s.next();
            int numMembers[] = new int[sMax+1];
            int aggregateTotal[] = new int[sMax+1];

            for (int i = 0; i < sMax+1; i++) {
                numMembers[i] = membersString.charAt(i) - '0';
                aggregateTotal[i] = numMembers[i];
            }

            for (int i = 1; i < sMax+1; i++) {
                if (numMembers[i] > 0 && aggregateTotal[i - 1] < i) {
                    totalToAdd += (i - aggregateTotal[i - 1]);
                    aggregateTotal[i - 1] = i;
                }
                aggregateTotal[i] += aggregateTotal[i - 1];
            }

            System.out.println ("Case #" + test + ": " + totalToAdd);
        }
    }
}
