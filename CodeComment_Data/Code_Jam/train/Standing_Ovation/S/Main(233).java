package methodEmbedding.Standing_Ovation.S.LYD1646;


import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        try {

            BufferedReader in = new
                    BufferedReader(new FileReader("/Users/kumar_garg/Desktop/A-small-attempt1.in"));
            PrintWriter writer = new
                    PrintWriter(new BufferedWriter(new FileWriter("/Users/kumar_garg/Desktop/output.txt")));

            int numberOfTestCases = Integer.parseInt(in.readLine());

            for (int t = 0; t < numberOfTestCases; t++) {
                String[] testCase = in.readLine().split(" ");
                int maxShynessLevel = Integer.parseInt(testCase[0]);
                String input = testCase[1];
                int output = 0;
                int audienceStanding = 0;

                for (int i = 0; i <= maxShynessLevel ; i++) {
                    int digit = input.charAt(i) - 48;

                    if (digit != 0 && i > audienceStanding) {
                        output += i - audienceStanding;
                        audienceStanding += i - audienceStanding;
                    }

                    audienceStanding += digit;
                }

                String outputStr = "Case #" + (t + 1) + ": " + output;
                writer.write(outputStr, 0, outputStr.length());
                writer.write("\n");

            }
            in.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
