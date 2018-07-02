package methodEmbedding.Cookie_Clicker_Alpha.S.LYD372;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

public class Cookie {
	public static void main(String args[]) throws IOException {
		final String FILENAME = "B-small-attempt0.in";

		int currentCase = 1;



		String[] inputs = new String[3];

		File file = new File("results.txt");

		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}

		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);

		BufferedReader br = new BufferedReader(new FileReader(FILENAME));
		String line;
		line = br.readLine();

		while ((line = br.readLine()) != null) {
			
			inputs = line.split(" ");
			
			double currRate = 2;
			double cost = Double.parseDouble(inputs[0]);
			double rate = Double.parseDouble(inputs[1]);
			double target = Double.parseDouble(inputs[2]);
			double second = 0;

			// calculate time
			boolean done = false;
			while (!done) {
				double result1 = second + target / currRate;
				double result2 = second + cost / currRate + target
						/ (currRate + rate);
				if (result1 < result2) {
					done = true;
					second = result1;
				} else {
					second += cost / currRate;
					currRate += rate;
				}
			}
			bw.write("Case #" + currentCase + ": " + second + "\n");
			currentCase++;
		}
		br.close();
		bw.close();
	}
}
