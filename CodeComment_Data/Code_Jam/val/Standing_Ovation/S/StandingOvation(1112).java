package methodEmbedding.Standing_Ovation.S.LYD1598;

import java.io.*;

/**
 * Created by sidonius on 11.04.15.
 */
public class StandingOvation {

    private static final String RESULT_FORMAT = "Case #%d: %d";

    public static void main(String[] args) throws IOException {

        String file = args[0];
        String outputFile = args[1];
        try (BufferedReader in = new BufferedReader(new FileReader(file));
            BufferedWriter out = new BufferedWriter(new FileWriter(outputFile))){
            int nTestCases = Integer.valueOf(in.readLine());
            for (int i = 0; i < nTestCases; i++) {
                String[] line = in.readLine().split(" ");
                int sMax = Integer.valueOf(line[0].trim());
                String audience = line[1].trim();
                int result = 0;
                int count = 0;
                for (int j = 0; j <= sMax; j++) {
                    int nCount = Integer.valueOf(audience.charAt(j) - '0');
                    if (count < j) {
                        int diff = j - count;
                        result += diff;
                        count += diff;
                    }
                    count += nCount;
                }

                out.write(String.format(RESULT_FORMAT, i + 1, result));
                out.newLine();
            }
        }
    }


}
