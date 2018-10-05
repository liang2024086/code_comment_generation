package methodEmbedding.Standing_Ovation.S.LYD1649;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by xuchen on 4/10/15.
 */
public class StandingOvation {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(new File("src/A-small-attempt1.in"));
            PrintWriter writer = new PrintWriter(new File("src/StandingOvationResult.txt"));

            int caseCnt = scanner.nextInt();

            for (int i = 0; i < caseCnt; i++){

                int Smax = scanner.nextInt();

                String next = scanner.next();

                int currentStanding = 0;
                int peopleNeeded = 0;

                for (int j = 0; j <= Smax; j++){

                    if (currentStanding < j){
                        peopleNeeded += j - currentStanding;
                        currentStanding = j;
                    }

                    currentStanding += next.charAt(j) - 48;
                }

                writer.println("Case #" + (i+1) + ": " + peopleNeeded);

            }

            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
