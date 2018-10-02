package methodEmbedding.Standing_Ovation.S.LYD695;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class ProblemA {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner fileScan = new Scanner(new File("A-small-attempt0.in"));
        PrintWriter writer = new PrintWriter("problem_A_small.txt");

        int numCase = fileScan.nextInt();

        for (int i = 0; i < numCase; ++i) {
            int maxShy = fileScan.nextInt();
            String audience = fileScan.next();
            int audienceInt = Integer.parseInt(new StringBuffer(audience).reverse().toString());
            int numAudience = 0;
            int count = 0;

            for (int j = 0; j <= maxShy; ++j) {
                while (numAudience < j) {
                    count++;
                    numAudience++;
                }
                numAudience += audienceInt % 10;
                audienceInt /= 10;
            }
            writer.println("Case #" + (i+1) + ": " + count);
        }
        writer.close();
        fileScan.close();
    }
}
