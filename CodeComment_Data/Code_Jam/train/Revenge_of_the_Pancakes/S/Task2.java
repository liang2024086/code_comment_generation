package methodEmbedding.Revenge_of_the_Pancakes.S.LYD231;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Task2 {

	public static void main(String[] args) throws Exception {

		String fileName = "B-small-attempt0";
		BufferedReader br = new BufferedReader(new FileReader("input/" + fileName + ".in"));
		FileWriter fileWriter = new FileWriter("output/" + fileName + ".out");

		String newLine = br.readLine();
		int count_T = Integer.parseInt(newLine);
		for (int i = 0; i < count_T; i++) {
			newLine = br.readLine();
			newLine += "+";
			int maneuvers = 0;
			char previousChar = newLine.charAt(0);
			for (int j = 1; j < newLine.length(); j++) {
				char currentChar = newLine.charAt(j);
				if (currentChar != previousChar) {
					maneuvers++;
					previousChar = currentChar;
				}
			}

			String line = "Case #" + (i + 1) + ": " + maneuvers;

			fileWriter.write(line + "\n");
			fileWriter.flush();
		}
		br.close();
		fileWriter.close();
	}
}
