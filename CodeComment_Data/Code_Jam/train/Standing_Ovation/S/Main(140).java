package methodEmbedding.Standing_Ovation.S.LYD658;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
        System.setOut(out);
        Scanner scanner = new Scanner(System.in);
        int numTestCases = scanner.nextInt();
        for(int i=0; i < numTestCases; i++){
            int maxShyness = scanner.nextInt();
            String audienceShynessString = scanner.next();
            int friendsToInvite = 0;
            int peopleStanding = 0;
            for (int j = 0; j < maxShyness+1; j++){
                int peopleWithShynessJ = Character.getNumericValue(audienceShynessString.charAt(j));
                if(peopleWithShynessJ > 0 && j > (peopleStanding + friendsToInvite)) {
                    friendsToInvite = j - peopleStanding;
                }
                peopleStanding += peopleWithShynessJ;
            }
            System.out.println("Case #"+(i+1)+": "+friendsToInvite);
        }
    }
}
