package methodEmbedding.Standing_Ovation.S.LYD116;


import java.io.*;
import java.util.Scanner;

public class StandingOvation {

    public static void main(String[] args) throws FileNotFoundException {

        File inputFile = new File("A-small-attempt2.in");

        PrintWriter pw = new PrintWriter("output.txt");
        Scanner inputScanner = new Scanner(inputFile);

        int testCases = inputScanner.nextInt();
        for (int i = 0; i < testCases; i++) {

            int maxShyLevel = inputScanner.nextInt();
            String audience = inputScanner.next();

            int peopleNeeded = 0;
            int totalPeople = 0;
            for (int j = 0; j < audience.length(); j++) {

                if (totalPeople >= j) {
                    totalPeople += Integer.parseInt(audience.charAt(j) + "");
                    continue;
                }

                peopleNeeded += (j - totalPeople);
                totalPeople += (j - totalPeople);
                totalPeople += Integer.parseInt(audience.charAt(j) + "");
            }

            pw.println("Case #" + (i + 1) + ": " + peopleNeeded);
        }

        inputScanner.close();
        pw.close();

    }//end main
} //end of class
