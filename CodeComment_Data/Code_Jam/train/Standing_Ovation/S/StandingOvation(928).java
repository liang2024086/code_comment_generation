package methodEmbedding.Standing_Ovation.S.LYD1116;

import java.util.Scanner;

/**
 * Created by pratyush.verma on 12/04/15.
 */
public class StandingOvation {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        for (int i = 0; i < t; i++) {
            long people = 0;
            int maxShy = cin.nextInt();
            String shy = cin.next();
            long peopleStanding = 0;
            for (int j = 0; j < shy.length(); j++) {
                if (peopleStanding < j) {
                    people += (j - peopleStanding);
                    peopleStanding += (j - peopleStanding);
                }
                peopleStanding += shy.charAt(j) - '0';
            }
            System.out.println("Case #" + (i+1) + ": " + people);
        }
    }
}
