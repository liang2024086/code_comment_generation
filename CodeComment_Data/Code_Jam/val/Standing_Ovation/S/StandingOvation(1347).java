package methodEmbedding.Standing_Ovation.S.LYD1514;

import java.util.Arrays;
import java.util.Scanner;

public class StandingOvation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numCases = in.nextInt();

        for (int testCase = 1; testCase <= numCases; ++testCase) {
            int n = in.nextInt() + 1;
            char[] shynessChars = in.nextLine().trim().toCharArray();
            int[] shyness = new int[n];
            int[] prefixSums = new int[n];
            int sum = 0;

            for (int i = 0; i < n; ++i) {
                shyness[i] = shynessChars[i] - '0';

                sum += shyness[i];
                prefixSums[i] = sum;
            }

            int numFriendsToInvite = 0;

            for (int i = 1; i < n; ++i) {
                if (shynessChars[i] == 0) {
                    continue;
                }

                int numPeopleStanding = prefixSums[i - 1];

                if (numPeopleStanding < i) {
                    numFriendsToInvite = Math.max(numFriendsToInvite, i - numPeopleStanding);
                }
            }

            System.out.println("Case #" + testCase + ": " + numFriendsToInvite);
        }
    }
}
