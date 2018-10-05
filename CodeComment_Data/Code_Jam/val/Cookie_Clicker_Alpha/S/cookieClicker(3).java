package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1202;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class cookieClicker {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(
					"C:/Users/Johannes/workspace/Code Jam/src/B-small-attempt0.in"));
			PrintWriter writer = new PrintWriter(new FileWriter(
					"C:/Users/Johannes/workspace/Code Jam/src/output.out"));
			int numberOfCases;

			numberOfCases = Integer.parseInt(reader.readLine());

			double cRequired, cExtra, cWin, time, timeToWin, timeWithNewFarm, timeToNewFarm; // C,F,X
			int farms;
			String buffer[] = new String[1];

			for (int n = 1; n <= numberOfCases; n++) {
				time = 0;
				farms = 0;
				timeToWin = 0;
				timeWithNewFarm = 0;
				timeToNewFarm = 0;
				buffer[0] = reader.readLine();
				buffer = buffer[0].split("\\ ");
				cRequired = Double.parseDouble(buffer[0]);
				cExtra = Double.parseDouble(buffer[1]);
				cWin = Double.parseDouble(buffer[2]);

				timeToWin = cWin * (1 / (2 + (farms * cExtra)));
				timeToNewFarm = cRequired * (1 / (2 + (farms * cExtra)));
				timeWithNewFarm = cWin * (1 / (2 +((farms+1) * cExtra)));
				
				while (timeToNewFarm + timeWithNewFarm < timeToWin) {			
					farms++;
					time += timeToNewFarm;
					timeToNewFarm = cRequired * (1 / (2 + (farms * cExtra)));
					timeWithNewFarm = cWin * (1 / (2 +((farms+1) * cExtra)));
					timeToWin = cWin * (1 / (2 + (farms * cExtra)));
				}
				time += timeToWin;
					
						
				writer.println("Case #" + n + ": " + time);

			}
			reader.close();
			writer.close();

		} catch (IOException e) {
			System.err.print("io exception");
		}
	}
}
