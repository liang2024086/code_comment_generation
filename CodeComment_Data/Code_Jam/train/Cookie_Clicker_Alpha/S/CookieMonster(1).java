package methodEmbedding.Cookie_Clicker_Alpha.S.LYD165;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 */
public class CookieMonster {
    private static final String TEST_FILE_NAME = "/Users/apovh/projects/GooglePractice/src/jam2014/B-small";

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(TEST_FILE_NAME + ".in.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter(TEST_FILE_NAME + ".out"));

        Integer casesNum = Integer.valueOf(reader.readLine());
        System.out.println("index = " + casesNum);
        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= casesNum; i++) {
            String[] row = reader.readLine().split(" ");
            double farmCost = Double.valueOf(row[0]); // C
            double farmCookieBoost = Double.valueOf(row[1]); // F
            double cookieGoal = Double.valueOf(row[2]); // X

            double cookieBoost = 2.0d;
            double time = 0d;

            while (cookieGoal / cookieBoost > farmCost / cookieBoost + cookieGoal / (cookieBoost + farmCookieBoost)) {
                time += farmCost / cookieBoost;
                cookieBoost += farmCookieBoost;
            }

            time += cookieGoal / cookieBoost;

            String caseResult = "Case #" + i + ": " + String.format("%.7f", time);
            System.out.println(caseResult);
            writer.write(caseResult);
            writer.newLine();
        }

        System.out.println("Total time: " + (System.currentTimeMillis() - startTime));

        reader.close();
        writer.close();
    }
}
