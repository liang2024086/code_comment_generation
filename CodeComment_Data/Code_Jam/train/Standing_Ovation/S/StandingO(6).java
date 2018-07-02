package methodEmbedding.Standing_Ovation.S.LYD62;

import java.io.*;

public class StandingO {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter output = new BufferedWriter(new FileWriter("output.txt"));

        int numLines = Integer.valueOf(input.readLine());
        for(int i = 1; i <= numLines; i++) {
            String testCase = input.readLine();
            int shynessLevel = Integer.parseInt(testCase.split(" ")[0]);
            String values = testCase.split(" ")[1];

            int numToAdd = 0;
            int numPeopleStanding = 0;

            for (int currShyness = 0; currShyness <= shynessLevel; currShyness++) {
                int numAtCurrentShyness = Integer.parseInt("" + values.charAt(currShyness));

                if (numAtCurrentShyness > 0 && numPeopleStanding < currShyness) {
                    int adding = currShyness - numPeopleStanding;
                    numToAdd += adding;
                    numPeopleStanding += adding;
                }
                numPeopleStanding += numAtCurrentShyness;
            }

            output.write("Case #" + i + ": " + numToAdd + "\n");
        }
        output.close();
        input.close();
    }
}
