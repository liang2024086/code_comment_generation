package methodEmbedding.Standing_Ovation.S.LYD582;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StandingOvation {
	public static void main(String[] args) throws NumberFormatException,
			IOException {

		String fileName = "input.txt";

		java.io.BufferedReader r = new java.io.BufferedReader(new FileReader(
				new File("standingovation_inputs/" + fileName)));

		BufferedWriter writer = new BufferedWriter(new FileWriter(
				"standingovation_inputs/output_" + fileName));

		int testcases = Integer.parseInt(r.readLine());
		int i = 1;
		while (i <= testcases) {
			String[] test = r.readLine().split(" ");
			int shyness = Integer.parseInt(test[0]);
			int totalTillNow = 0;
			int totalRequired = 0;
			int shyLevel = 0;
			while (shyLevel <= shyness) {
				int numPeople = Integer.parseInt(test[1].charAt(shyLevel) + "");
				if (numPeople > 0 && shyLevel > totalTillNow) {
					totalRequired = totalRequired + (shyLevel - totalTillNow);
					numPeople = totalRequired + numPeople;
				}
				totalTillNow = numPeople + totalTillNow;
				if (totalTillNow > shyness) {
					break;
				}
				shyLevel++;
			}
			if (i == testcases) {
				writer.write("Case #" + i + ": " + totalRequired);
			} else {
				writer.write("Case #" + i + ": " + totalRequired + "\n");
			}

			i++;
		}
		r.close();
		writer.close();
	}
}
