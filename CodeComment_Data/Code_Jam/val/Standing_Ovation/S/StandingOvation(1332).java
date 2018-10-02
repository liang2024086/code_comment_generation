package methodEmbedding.Standing_Ovation.S.LYD435;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;


public class StandingOvation {

	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("A-small-attempt0.in.txt"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"));
			String line = null;
			line = reader.readLine();
			int caseCount = Integer.parseInt(line);
			for (int caseNum = 0; caseNum < caseCount; caseNum++) {
				String outputString = "Case #" + (caseNum + 1) + ": ";
				line = reader.readLine();
				String[] splitStrings = line.split(" ");
				int n = Integer.parseInt(splitStrings[0]) + 1;
				int[] shy = new int[n];
				for (int i = 0; i < n; i++) {
					shy[i] = splitStrings[1].charAt(i) - '0';
				}
				int count = 0;
				int ans = 0;
				for (int i = 0; i < n; i++) {
					if (count < i) {
						ans += i - count;
						count = i;
					}
					count += shy[i];
				}
				outputString += ans;
				outputString += "\n";
				writer.write(outputString);
				System.out.println(outputString);
			}
			reader.close();
			writer.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
