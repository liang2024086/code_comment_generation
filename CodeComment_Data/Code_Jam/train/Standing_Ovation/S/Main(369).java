package methodEmbedding.Standing_Ovation.S.LYD1069;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main {

	public static void main(String args[]) {

		String line = "";
		int testCases = 0;
		String[] inputs = null;
		int pos = 0;
		int friendCount = 0;

		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File(
					"A-small-attempt2.in")));

			boolean first = true;
			while ((line = reader.readLine()) != null) {
				if (first) {
					testCases = Integer.parseInt(line);
					first = false;
					inputs = new String[testCases];
					continue;
				} else {
					inputs[pos] = line;
					pos++;

				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(new File("output.txt")));
		
		for (int i = 0; i < testCases; i++) {
			char[] charArray = inputs[i].toCharArray();
			
			if (charArray[0] == '0') {
				System.out.println();
				writer.write("Case #" + (i + 1) + ": " + "0");
				writer.newLine();
			} else {

				int standing = 0;

				for (int j = 2; j < (charArray.length); j++) {
					int val = charArray[j] - 48;
					int shyness = (j - 2);
					if (standing > shyness) {
						standing += val;

						continue;
					} else {
						int diff = shyness - standing;

						friendCount += (diff);
						standing += (diff + val);
					}

				}
				System.out.println();
				writer.write("Case #" + (i + 1) + ": " + friendCount);
				writer.newLine();
			}
			friendCount = 0;
		}
		
		writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
