package methodEmbedding.Standing_Ovation.S.LYD125;



import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            File file = new File("A-small-attempt2.in");
            Scanner inputScanner = new Scanner(file);

            PrintWriter writer = new PrintWriter("output_attempt_2.txt", "UTF-8");

            int testCases = inputScanner.nextInt();
            inputScanner.nextLine();

            for (int i = 0; i < testCases; i++) {
                String testCase = inputScanner.nextLine();
                String[] test = testCase.split(" ");

                int sMax = Integer.valueOf(test[0]);
                String audience = test[1];
                int audienceCount = 0;
                int invites = 0;
                for (int j = 0; j < sMax + 1; j++) {
                    if ((invites + audienceCount) < j) {
                        invites++;
                    }
                    audienceCount += audience.charAt(j) - '0';
                }
                if ((invites + audienceCount) < sMax) {
                    invites += (sMax - (invites+audienceCount));
                }
                writer.write("Case #" + (i+1) + ": " + invites + "\n");
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
