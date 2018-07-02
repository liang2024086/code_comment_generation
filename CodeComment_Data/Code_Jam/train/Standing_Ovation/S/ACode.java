package methodEmbedding.Standing_Ovation.S.LYD1066;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ACode {
	public static void main(String args[]) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(new File(
				"c:/codejam/A-small-attempt0.in")));
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File(
				"c:/codejam/a.out")));
		int cases = Integer.valueOf(reader.readLine()).intValue();
		for (int c = 1; c <= cases; c++) {
			int result = 0;
			String parts[] = reader.readLine().split(" ");
			int maxS = Integer.valueOf(parts[0]).intValue();
			char shyArray[] = parts[1].toCharArray();
			int numberStanding = 0;
			for (int i = 0; i <= maxS; i++) {
				if (numberStanding >= i) {
					numberStanding += shyArray[i] - '0';
				} else {
					int diff = (i - numberStanding);
					result += diff;
					numberStanding += diff + shyArray[i] - '0';
				}
			}
			writer.write("Case #" + c + ": " + result + "\n");
		}
		reader.close();
		writer.close();
	}
}
