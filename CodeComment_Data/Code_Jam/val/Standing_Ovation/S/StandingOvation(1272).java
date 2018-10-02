package methodEmbedding.Standing_Ovation.S.LYD1586;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Vihari on 4/11/15.
 */
public class StandingOvation {
    public static void main(String[] args) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File("/Users/Vihari/IdeaProjects/CorpusAnalysis/src/input.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int numCases = scanner.nextInt();
        scanner.nextLine();
        for (int count = 1; count <= numCases; count++) {
            String line = scanner.nextLine();
            int max = Integer.parseInt(line.substring(0,1));
            String bitString = line.substring(2);
            int countStanding = 0;
            int addedFriends = 0;
            for (int i = 0; i <= max; i++) {
                if (countStanding >= i) {
                    countStanding += Character.getNumericValue(bitString.charAt(i));
                } else {
                    int studentsNeeded = i-countStanding;
                    addedFriends += studentsNeeded;
                    countStanding = Character.getNumericValue(bitString.charAt(i)) + studentsNeeded + countStanding;
                }
            }
            System.out.println("Case #" + count + ": " + addedFriends);


        }
    }
}
