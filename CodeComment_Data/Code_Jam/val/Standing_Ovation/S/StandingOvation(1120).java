package methodEmbedding.Standing_Ovation.S.LYD1297;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class StandingOvation {

    public static void main(String[] args) throws FileNotFoundException {
        //Redirect file input to System.in
        FileInputStream fileInputStream = new FileInputStream(new File("/Users/kiransireesh/Work/google-code-jam/practice-tests/src/main/resources/standing-ovation/standing-small.in"));
        System.setIn(fileInputStream);

        Scanner scanner = new Scanner(System.in);

        final int numCases = parseInt(scanner.nextLine());
        int i = 1;
        while(i <= numCases) {
            System.out.printf("Case #%d: ", i++);
            String showDetails = scanner.nextLine();
            String[] show = showDetails.split(" ");
            String[] shyArray = show[1].split("");
            int[] shyIntArray = new int[shyArray.length-1];

            for (int j = 1; j < shyArray.length; j++) {
                shyIntArray[j-1] = Integer.parseInt(shyArray[j]);
            }

            int standingAudienceCount = 0;
            int requiredFriendsCount = 0;
            for (int curShyIndex = 0; curShyIndex < shyIntArray.length; curShyIndex++) {

                if(shyIntArray[curShyIndex] > 0 && standingAudienceCount < curShyIndex) {
                    int friendsNeededInThisStep = curShyIndex - standingAudienceCount;
                    requiredFriendsCount += friendsNeededInThisStep;
                    standingAudienceCount += friendsNeededInThisStep;
                }
                standingAudienceCount += shyIntArray[curShyIndex];
            }
            System.out.println(requiredFriendsCount);
        }
    }


}
