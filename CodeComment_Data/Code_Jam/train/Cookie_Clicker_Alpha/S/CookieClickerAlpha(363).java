package methodEmbedding.Cookie_Clicker_Alpha.S.LYD330;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

public class CookieClickerAlpha {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("2014/qualB/B-small-attempt0.in.txt"));
        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("2014/qualB/output.txt")));

        int numberOfTests = Integer.parseInt(reader.readLine()); // T

        for (int i = 0; i < numberOfTests; i++) {
            System.out.println(i);
            String[] line = reader.readLine().split(" ");
            double farmPrice = Double.parseDouble(line[0]); // C
            double farmYield = Double.parseDouble(line[1]); // F
            double target = Double.parseDouble(line[2]); // X

            double time = target / 2;
            double newTime = 0.0;
            double timeUntilLastFarm = 0.0;
            int farms = 0;
            while (newTime < time) {
            	if (newTime != 0.0) {
            		time = newTime;
            	}
            	timeUntilLastFarm = timeUntilLastFarm + farmPrice / (2 + farmYield * farms);
            	farms++;
            	newTime = timeUntilLastFarm + target / (2 + farmYield * farms);
            }

            writer.println("Case #" + (i + 1) + ": " + String.format(Locale.US, "%.7f", time));
        }

        writer.flush();
        writer.close();
        reader.close();
	}

}
