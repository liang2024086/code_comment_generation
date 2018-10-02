package methodEmbedding.Standing_Ovation.S.LYD1358;

import java.io.File;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Class <code>StandingOvation</code> is used for
 */
public class StandingOvation {
    public static void main(String[] args) throws Exception{
        final Scanner in = new Scanner(new File("A-small-attempt0.in"));

        final PrintWriter out = new PrintWriter(new File("output_a.txt"));
        int numberOfTest = in.nextInt();
        in.nextLine();
        for (int currentTest = 1; currentTest <= numberOfTest; currentTest++) {
            final String line = in.nextLine();
            int smax = Integer.parseInt(line.split(" ")[0]);
            String audience = line.split(" ")[1];
            final Map<Integer, Integer> shyLevelToCount = new LinkedHashMap<Integer, Integer>();
            for (int i = 0; i < audience.length(); i++) {
                shyLevelToCount.put(i, audience.charAt(i) - 48);
            }
            int countToAdd = 0;
            int countOfStanding = 0;
            for (final Map.Entry<Integer, Integer> entry: shyLevelToCount.entrySet()) {
                int currentShyLevel = entry.getKey();
                int currentNumberOfAudience = entry.getValue();
                if (currentShyLevel == 0) {
                    countOfStanding += currentNumberOfAudience;
                } else {
                    if (currentShyLevel > countOfStanding && currentNumberOfAudience > 0) {
                        countToAdd += (currentShyLevel - countOfStanding);
                        countOfStanding += (currentShyLevel - countOfStanding);
                    }
                    countOfStanding += currentNumberOfAudience;
                }
            }
            out.println(String.format("Case #%d: %d", currentTest, countToAdd));
        }
        in.close();
        out.flush();
        out.close();
    }
}
