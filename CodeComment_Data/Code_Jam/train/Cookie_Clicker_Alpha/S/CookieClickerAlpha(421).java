package methodEmbedding.Cookie_Clicker_Alpha.S.LYD842;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CookieClickerAlpha {

	public static void main(String[] args) throws IOException {
		File inputFile = new File(args[0]);
		File outputFile = new File(args[1]);
		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
		
		int numOfQuestion = Integer.valueOf(reader.readLine());
		
		for (int i = 0; i < numOfQuestion; i++) {
			String line = reader.readLine();
			String[] lineArray = line.split(" ");
			double C = Double.valueOf(lineArray[0]);
			double F = Double.valueOf(lineArray[1]);
			double X = Double.valueOf(lineArray[2]);
			
			double minTime = Double.MAX_VALUE;
			double currentTime = Double.MAX_VALUE;
			int factoryNum = 0;
			do {
				minTime = currentTime;
				currentTime = 0;
				if (factoryNum == 0) {
					currentTime = X / 2;
				} else {
					int k;
					for (k = 0; k < factoryNum; k++) {
						currentTime += C / (2 + k * F);
					}
					currentTime += X / (2 + k * F);
				}
				
				factoryNum++;
			} while (currentTime < minTime);

			String output = "Case #" + String.valueOf(i + 1) + ": " + String.valueOf(minTime);
			System.out.println(output);
			writer.write(output);
			writer.newLine();
			writer.flush();
		}
		
		reader.close();
		writer.close();
	}

}
