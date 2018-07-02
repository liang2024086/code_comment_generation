package methodEmbedding.Cookie_Clicker_Alpha.S.LYD362;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class CookieClickerAlpha {
    private static String TEST_INPUT_FILENAME = "CookieClickerAlpha/test_input.txt";
    private static String SMALL_INPUT_FILENAME = "CookieClickerAlpha/B-small-attempt0.in";
    private static double COOKIES_PER_SECOND = 2.0f;

    public static void main(final String[] args) {
        final String inputFileName = SMALL_INPUT_FILENAME;
        final String outputFileName = inputFileName + ".out";
        try (BufferedReader inputReader = new BufferedReader(new FileReader(inputFileName)); BufferedWriter outputWriter = new BufferedWriter(new FileWriter(outputFileName))) {
            int totalTestCases = Integer.parseInt(inputReader.readLine());
            for (int testCase = 1; testCase < totalTestCases + 1; testCase++) {
                String[] inputs = inputReader.readLine().split(" ");
                double farmCookiesCost = Double.parseDouble(inputs[0]);
                double farmCookiesPerSecond = Double.parseDouble(inputs[1]);
                final double endcookieAmount = Double.parseDouble(inputs[2]);
                double cookieRate = COOKIES_PER_SECOND;

                double currentProductionTime = endcookieAmount / cookieRate;
                double farmTimeOffset = farmCookiesCost / cookieRate;
                cookieRate += farmCookiesPerSecond;
                double nextProductionTime = endcookieAmount / cookieRate + farmTimeOffset;
                while (currentProductionTime > nextProductionTime) {
                    currentProductionTime = nextProductionTime;
                    double nextFarmTime = farmCookiesCost / cookieRate;
                    cookieRate += farmCookiesPerSecond;
                    farmTimeOffset += nextFarmTime;
                    nextProductionTime = endcookieAmount / cookieRate + farmTimeOffset;
                }
                // Time it would take with 'currentProduction'. Is this more than 'lastProduction'? If so, stop.
                // Compute how long take to get to next production level
                // Update rate and set 'currentProduction'

                StringBuilder outputStringBuilder = new StringBuilder("Case #").append(testCase).append(": ").append(currentProductionTime);
                // TODO: Append output results here
                outputWriter.write(outputStringBuilder.toString());
                outputWriter.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
