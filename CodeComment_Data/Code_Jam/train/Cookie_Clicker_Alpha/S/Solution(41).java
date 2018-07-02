package methodEmbedding.Cookie_Clicker_Alpha.S.LYD467;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class Solution {
	public static void main(String[] args) throws IOException {
		String inputFile = "/Users/ankushgupta/Downloads/input";
		String outputFile = "/Users/ankushgupta/Desktop/output";
		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
		int numberOfTestCases = Integer.parseInt(reader.readLine());
		for (int i = 1; i <= numberOfTestCases; i++) {
			String[] input = reader.readLine().split(" ");
			Double c = Double.parseDouble(input[0]);
			Double f = Double.parseDouble(input[1]);
			Double x = Double.parseDouble(input[2]);
			Double currentRate = 2.0;
			Double totalTime = 0.0;
			Double farmTime = c / currentRate + x / (currentRate + f);
			Double xTime = x /currentRate;
			while (farmTime < xTime) {
				totalTime = totalTime + (c / currentRate);
				currentRate = currentRate + f;
				farmTime = c / currentRate + x / (currentRate + f);
				xTime = x /currentRate;
			}
			totalTime = totalTime + x / currentRate;
			String time = new DecimalFormat("0.0000000").format(totalTime);
			writer.write("Case #" + i + ": " +  time + "\n");
		}
		reader.close();
		writer.close();
	}
}
