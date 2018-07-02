package methodEmbedding.Standing_Ovation.S.LYD1186;

import java.io.BufferedReader;
import java.io.FileReader;

public class StandingOvation {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("src/A-small-attempt1.in"));

        int numOfTestCases = Integer.parseInt(br.readLine());

        for (int i = 0; i < numOfTestCases; i++) {
            String[] testCase = br.readLine().split(" ");
            int sMax = Integer.parseInt(testCase[0]);
            String audience = testCase[1];
            int minFriends = 0;

            int count = Character.getNumericValue(audience.charAt(0));
            for (int j = 1; j <= sMax; j++) {
                int current = Character.getNumericValue(audience.charAt(j));

                if (current != 0 && j > count) {
                    int difference = j - count;
                    minFriends += difference;
                    count += difference + current;
                } else if (current != 0) {
                    count += current;
                }
            }

            System.out.println("Case #" + (i + 1) + ": " + minFriends);
        }
    }
}
