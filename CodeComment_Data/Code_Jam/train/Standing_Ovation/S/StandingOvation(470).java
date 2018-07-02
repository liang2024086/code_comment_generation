package methodEmbedding.Standing_Ovation.S.LYD935;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class StandingOvation {
    public static void main(String[] args) {
        File inputFile = new File("A-small-attempt0.in");

        try {
            Scanner scanner = new Scanner(inputFile);
            int numTestCases = scanner.nextInt();
            for (int caseNum = 1; caseNum <= numTestCases; caseNum++) {
                int sMax = scanner.nextInt();
                String shyness = scanner.next();

                int numStanding = Character.getNumericValue(shyness.charAt(0));
                int friendsAdded = 0;

                for (int level = 1; level <= sMax; level++) {
                    if (level > numStanding) {
                        int extraNeeded = level - numStanding;
                        friendsAdded += extraNeeded;
                        numStanding += extraNeeded;
                    }

                    numStanding += Character.getNumericValue(shyness.charAt(level));
                }

                System.out.println("Case #" + caseNum + ": " + friendsAdded);
            }
        } catch (IOException x) {
            System.err.println(x);
        }
    }
}
