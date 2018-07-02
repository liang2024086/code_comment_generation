package methodEmbedding.Standing_Ovation.S.LYD972;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class StandingOvation {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		FileReader fileReader = new FileReader(
				//"C:/Users/Lakjeewa/Desktop/1.in");
		 "C:/Users/Lakjeewa/Desktop/A-small-attempt1.in");

		BufferedReader br = new BufferedReader(fileReader);

		String line = br.readLine();

		int cases = Integer.parseInt(line);

		for (int i = 0; i < cases; i++) {

			String[] parts = br.readLine().split(" ");

			int sMax = Integer.parseInt(parts[0]);

			int sum = 0;

			int need = 0;

			for (int j = 0; j < parts[1].length(); j++) {

				char c = parts[1].charAt(j);
				int digit = Integer.parseInt(String.valueOf(c));
				sum = sum + digit;

				if (sum < j + 1) {
					int r = j + 1 - sum;
					sum = sum + r;
					need = need + r;
				}

			}

			System.out.println("Case #" + (i + 1) + ": " + need);

		}

		br.close();

	}
}
