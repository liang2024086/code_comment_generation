package methodEmbedding.Standing_Ovation.S.LYD1746;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));

        int numTestCases = in.nextInt();
        for (int testNo = 1; testNo <= numTestCases; ++testNo) {
            int maxShyness = in.nextInt();
            String people = in.next();
            int friends = 0;
            int totalSoFar = 0;
            for (int shynessLevel = 0; shynessLevel < maxShyness + 1; ++shynessLevel) {
                int peopleOfThisLevel = Integer.parseInt(Character.toString(people.charAt(shynessLevel)));
                if (shynessLevel > totalSoFar && peopleOfThisLevel > 0) {
                    int invitedFriends = shynessLevel - totalSoFar;
                    friends += invitedFriends;
                    totalSoFar += invitedFriends;
                }
                totalSoFar += peopleOfThisLevel;
            }

            writer.write("Case #" + testNo + ": " + friends);
            if (testNo != numTestCases) {
                writer.newLine();
            }
        }

        writer.close();
    }
}
