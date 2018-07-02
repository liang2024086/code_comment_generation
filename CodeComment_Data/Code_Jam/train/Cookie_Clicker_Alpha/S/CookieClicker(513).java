package methodEmbedding.Cookie_Clicker_Alpha.S.LYD177;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CookieClicker {
    public static void main(String[] args) {
	BufferedReader reader = null;
	BufferedWriter writer = null;
        try {
            if (args.length == 2) {
                reader = new BufferedReader(new FileReader(args[0]));
                writer = new BufferedWriter(new FileWriter(args[1]));

                int numTestCases = Integer.valueOf(reader.readLine());
                int count = 1;

                // Loops through each test case
		while (count <= numTestCases) {
                    double cumFarmTime = 0;
                    double cookiesPerSec = 2;

                    // Read case parameters
                    String[] split = reader.readLine().split(" ");
                    double farmCost = Double.valueOf(split[0]);
                    double cookieGain = Double.valueOf(split[1]);
                    double winCost = Double.valueOf(split[2]);
                    // Initialise best time
                    double bestTime = winCost/cookiesPerSec;
                    double totalTime = 0;
                    double farmTime = 0;

                    while (true) {
                        // Time to buy the farm
                        farmTime = farmCost/cookiesPerSec;
                        // Cookies per second increment
                        cookiesPerSec += cookieGain;
                        // Total time taken to win after this step
                        totalTime = cumFarmTime + farmTime + winCost/cookiesPerSec;
                        if (totalTime > bestTime) {
                            break;
                        }
                        // Buy the farm
                        bestTime = totalTime;
                        cumFarmTime += farmTime;
                    }
                    writer.write("Case #" + count + ": " + bestTime + "\n");
                    writer.flush();
                    count++;
                }
            } else {
                System.err.println("USAGE: java CookieClicker input.txt output.txt");
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException ioe) {
                System.err.println("IOException while trying to close reader or writer");
            }
        }
    }
}
