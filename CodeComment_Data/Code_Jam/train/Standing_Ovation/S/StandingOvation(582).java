package methodEmbedding.Standing_Ovation.S.LYD1038;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by anhsu on 4/10/15.
 */
public class StandingOvation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("resources/googleCodeJam2015/A-small-attempt0.in"));
        PrintWriter writer = new PrintWriter("resources/googleCodeJam2015/A-small-attempt0.out", "UTF-8");

        int numofTestCases = Integer.valueOf(br.readLine());
        for (int i = 0; i < numofTestCases; i++) {
            String testCase = br.readLine();
            String[] testCaseArray = testCase.split("\\s+");
            int maxShynessLevel = Integer.parseInt(testCaseArray[0]);
            String shynessLevels = testCaseArray[1];
            int numberOfPeopleStanding = 0;
            int numberOfPeopleNeeded = 0;
            for (int shynessLevel = 0; shynessLevel < shynessLevels.length(); shynessLevel++) {
                if (shynessLevel > numberOfPeopleStanding) {
                    numberOfPeopleNeeded += shynessLevel - numberOfPeopleStanding;
                    numberOfPeopleStanding += shynessLevel - numberOfPeopleStanding;
                }
                numberOfPeopleStanding += Character.getNumericValue(shynessLevels.charAt(shynessLevel));
                if (numberOfPeopleStanding >= maxShynessLevel) {
                    break;
                }
            }

            int testCaseNumber = i + 1;
            writer.println("Case #" + testCaseNumber + ": " + numberOfPeopleNeeded);
        }
        writer.close();
        br.close();
    }
}
