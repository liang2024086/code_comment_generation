package methodEmbedding.Standing_Ovation.S.LYD139;


import java.util.Scanner;

/**
 * Created by jestinepaul on 11/4/15.
 */
public class StandingOvation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfCases = scanner.nextInt();

        for (int i = 0; i < noOfCases; i++) {
            int sMax = scanner.nextInt();
            String shynessLevelCount = scanner.next();

            int numOfFriends = 0;
            int numOfStanding = 0;

            for (int j = 0; j <= sMax; j++) {

                int shynessCount = Character.getNumericValue(shynessLevelCount.charAt(j));

                if (shynessCount != 0 && numOfStanding < j) {
                    numOfFriends = numOfFriends + (j - numOfStanding);
                    numOfStanding = numOfStanding + (j - numOfStanding);
                }
                numOfStanding = numOfStanding + shynessCount;
            }

            System.out.println("Case #" + (i + 1) + ": " + numOfFriends);
        }
    }
}
