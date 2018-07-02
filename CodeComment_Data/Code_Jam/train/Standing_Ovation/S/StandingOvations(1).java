package methodEmbedding.Standing_Ovation.S.LYD635;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;

/**
 * Created by carola on 11/04/15.
 */
public class StandingOvations {

    public static void main (String [] args) throws FileNotFoundException, IOException{

        System.out.println("Starting...");

        Scanner s = new Scanner(new FileReader("A-small-attempt0.in"));
        // StringBuilder input = new StringBuilder();

        StringBuilder output = new StringBuilder();

        int numberOfTestcases = s.nextInt();

        System.out.println("Looping through " + numberOfTestcases + " Testcases");

        // repeat for every testcase
        for (int i = 0; i < numberOfTestcases; i++) {
            int maximumShyness = s.nextInt();

            int [] audience = new int [maximumShyness+1];

            int numberOfInvitedFriends = 0;

            String guests = s.next();

            for (int j = 0; j < audience.length; j++) {
                audience[j] = Character.getNumericValue(guests.charAt(j));
            }

            if (maximumShyness == 0) {
                output.append("Case #" + (i+1) + ": " + numberOfInvitedFriends + "\n");
            } else {
                int numberOfStandingPeople = audience[0];
                for (int j = 1; j < audience.length; j++) {
                    if (audience[j] == 0) {
                        continue;
                    }
                    else if (j <= numberOfStandingPeople) {
                        numberOfStandingPeople += audience[j];
                    }
                    else {
                        numberOfInvitedFriends += (j - numberOfStandingPeople);
                        numberOfStandingPeople += (audience[j] + numberOfInvitedFriends);
                    }
                }
                output.append("Case #" + (i+1) + ": " + numberOfInvitedFriends + "\n");
            }
            System.out.println("Done");
        }
        System.out.println("Writing file...");

        File file = new File("outA1.txt");
        Writer writer = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
        writer.write(output.toString());
        writer.close();
    }
}
