package methodEmbedding.Standing_Ovation.S.LYD1363;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Anna on 4/11/15.
 */
public class A {

    public static void main(String[] args) {
        try {
            Scanner theIn = new Scanner(new File("A-small-attempt1.in"));
            int testCasesNumber = theIn.nextInt();

            for (int testCase=1; testCase<=testCasesNumber; testCase++) {
                int maxRequired = theIn.nextInt();
                String numbers = theIn.next();

                int numberOfFriends = 0;
                int numberOfStaying = 0;

                for (int requiredNumber=0; requiredNumber<=maxRequired; requiredNumber++) {
                    int peopleWithCurrentRequired = numbers.charAt(requiredNumber) - 48;
                    if ((numberOfStaying + numberOfFriends) < requiredNumber && peopleWithCurrentRequired != 0) {
                        numberOfFriends = (requiredNumber - numberOfStaying);
//                        peopleWithCurrentRequired = (requiredNumber - numberOfStaying);
                    }
                    numberOfStaying += peopleWithCurrentRequired;
                }

                System.out.println("Case #" + testCase + ": " + numberOfFriends);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
