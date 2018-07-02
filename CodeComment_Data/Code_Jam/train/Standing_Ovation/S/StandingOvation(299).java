package methodEmbedding.Standing_Ovation.S.LYD1663;

import java.util.*;
import java.io.*;

public class StandingOvation {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("A-small-attempt1.in"));
        PrintStream output = new PrintStream(new File("output.txt"));
        int numberOfCases = input.nextInt();
        for(int i=0;i<numberOfCases;i++) {
            int maxShyness = input.nextInt();
            String shyness = input.next();
            int solution = 0;
            int currentPeopleStanding = 0;
            for(int j=0;j<maxShyness+1;j++) {
                if(shyness.charAt(j) != '0') {
                    while(currentPeopleStanding<j) {
                        solution++;
                        currentPeopleStanding++;
                    }
                }
                currentPeopleStanding+=Character.getNumericValue(shyness.charAt(j));
            }
            output.println("Case #" + (i + 1) + ": " + solution);
        }
        input.close();
        output.close();
    }
}
