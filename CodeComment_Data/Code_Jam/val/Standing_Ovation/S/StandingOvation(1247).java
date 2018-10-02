package methodEmbedding.Standing_Ovation.S.LYD2095;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StandingOvation {
	public static void main(String ... args) throws IOException {
		final String inputFile = "A-small-attempt0.in.txt";
		final String outputFile = "output.txt";

		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

		int T = Integer.parseInt(reader.readLine());

		for(int i = 0 ; i < T ; i++) {
			// Reading Input
			String [] line = reader.readLine().split("\\s+");
			int Smax = Integer.parseInt(line[0]);

			int [] SArray = new int[Smax + 1];
			for(int j = 0 ; j <= Smax ; j++) {
				SArray[j] = Integer.parseInt(line[1].charAt(j) + "");
			}

			// Processing Input
			int tu = 0;		// Total Stand UP
			int tr = 0;		// # More required

			for(int j = 0 ; j <= Smax ; j++) {
				if(tu >= j) {
					tu = tu + SArray[j];
				} else {
					if(SArray[j] != 0) {
						tr += (j - tu);
						tu += (tr + SArray[j]);
					}
				}
			}

			// Output
			writer.write("Case #" + (i + 1) + ": " + tr);
			if(i != (T-1)) {
				writer.write("\n");
			}
		}

		reader.close();
		writer.close();
	}
}
