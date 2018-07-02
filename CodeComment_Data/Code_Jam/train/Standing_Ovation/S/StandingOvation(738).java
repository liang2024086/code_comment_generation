package methodEmbedding.Standing_Ovation.S.LYD2108;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StandingOvation {



    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("/home/mbroshi/Downloads/A-small-attempt1.in"));
        int numCases = sc.nextInt();
        StringBuffer output = new StringBuffer();
        for (int i = 1; i <= numCases; i++) {
            int sMax = sc.nextInt();
            String audienceString = sc.next();
            int[] audience = new int[sMax + 1];
            for (int j = 0; j < audienceString.length(); j++) {
                audience[j] = Integer.parseInt(String.valueOf(audienceString.charAt(j)));
            }
            int numAdded = 0;
            int numStanding = 0;
            for (int j = 0; j <= sMax; j++) {
                if (numStanding >= j) {
                    numStanding += audience[j];
                } else if (audience[j] > 0) {
                    numAdded += j - numStanding;
                    numStanding += numAdded + audience[j];
                }
            }
            output.append(String.format("Case #%d: %d\n", i, numAdded));
        }
        System.out.println(output);
        FileWriter fw = new FileWriter(new File("/home/mbroshi/Desktop/A-small-attempt1.out"));
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(output.toString());
        bw.close();
    }
}
