package methodEmbedding.Counting_Sheep.S.LYD115;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Task1 {

	public static void main(String[] args) throws Exception {

		String fileName = "A-small-attempt0";
		BufferedReader br = new BufferedReader(new FileReader("input/" + fileName + ".in"));
		FileWriter fileWriter = new FileWriter("output/" + fileName + ".out");

		String newLine = br.readLine();
		int count_T = Integer.parseInt(newLine);
		for (int i = 0; i < count_T; i++) {
			newLine = br.readLine();
			long pickedNumberN = Integer.parseInt(newLine);
			boolean[] presence = new boolean[10];

			long result = 0;
			boolean completed = true;
			for (int j = 1; j <= 100; j++) {
				result = pickedNumberN * j;
				String resultString = Long.toString(result);
				for (int k = 0; k < resultString.length(); k++) {
					char digit = resultString.charAt(k);
					presence[Integer.parseInt(Character.toString(digit))] = true;
				}

				// if all items true - exit
				completed = true;
				for (boolean aPresence : presence) {
					if (!aPresence) {
						completed = false;
						break;
					}
				}
				if (completed) {
					break;
				}
			}
			String line = "Case #" + (i + 1) + ": ";
			if (completed) {
				line += Long.toString(result);
			} else {
				line += "INSOMNIA";
			}
			fileWriter.write(line + "\n");
			fileWriter.flush();
		}
		br.close();
		fileWriter.close();
	}
}
