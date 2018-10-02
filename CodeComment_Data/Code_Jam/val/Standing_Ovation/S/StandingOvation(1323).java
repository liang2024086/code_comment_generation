package methodEmbedding.Standing_Ovation.S.LYD37;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.Math;

public class StandingOvation {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(new File("A-small-attempt0.in"));
        int cases = console.nextInt();
        for (int i = 1; i <= cases; i++) {
            int maxShyness = console.nextInt();
            int numberOfPeople = console.nextInt();
            int shynessLevel = 0;
            int currentTotal = 0;
            int numberOfNeededFriends = 0;
            for (int j = maxShyness; j >= 0; j--) {
                int numberOfPeopleAtShynessLevel = (int) (numberOfPeople / Math.pow(10, j));
                if (currentTotal <= shynessLevel&&numberOfNeededFriends<shynessLevel - currentTotal) {
                    numberOfNeededFriends = (shynessLevel - currentTotal);
                }
                currentTotal = currentTotal + numberOfPeopleAtShynessLevel;
                numberOfPeople = (int) (numberOfPeople % Math.pow(10, j));
                shynessLevel++;
            }
            System.out.println("Case #" + i + ": " + numberOfNeededFriends);
        }
    }

}
