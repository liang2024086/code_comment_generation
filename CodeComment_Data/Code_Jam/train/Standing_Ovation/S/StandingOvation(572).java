package methodEmbedding.Standing_Ovation.S.LYD579;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class StandingOvation {

    public static void main(String[] args) throws IOException {
        // Use BufferedReader rather than RandomAccessFile; it's much faster
        BufferedReader fileIn = new BufferedReader(new FileReader(
                "A-small-attempt0.in"));
        // input file name goes above
        PrintWriter fileOut = new PrintWriter(new BufferedWriter(
                new FileWriter("attempt0.txt")));

        int caseCount = Integer.parseInt(fileIn.readLine());
        for (int i = 0; i < caseCount; i++) {
            String[] input = fileIn.readLine().split(" ");
            String audienceString = input[1];

            int[] audience = new int[audienceString.length()];
            for (int j = 0; j < audienceString.length(); j++) {
                audience[j] = Character.getNumericValue(audienceString
                        .charAt(j));
            }
            int currentSum = 0;
            int friendCount = 0;

            for (int j = 0; j < audience.length; j++) {
                while (currentSum < j) {
                    currentSum++;
                    friendCount++;
                }
                currentSum += audience[j];
            }
            fileOut.println("Case #" + (i + 1) + ": " + friendCount);
        }

        fileIn.close();
        // Use StringTokenizer vs. readLine/split -- lots faster

        fileOut.close(); // close the output file
        System.exit(0); // don't omit this!
    }
}
