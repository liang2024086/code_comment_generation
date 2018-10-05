package methodEmbedding.Magic_Trick.S.LYD486;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class MagicTrick {

	public static void main(String[] args) throws IOException {

		int T = 0;
		int rowNumber = 0;
		int secondRowNumber = 0;
		String response = "";

		InputStream fis;
		BufferedReader br;

		fis = new FileInputStream("A-small-attempt0.in");
		br = new BufferedReader(new InputStreamReader(fis,
				Charset.forName("UTF-8")));

		T = Integer.parseInt(br.readLine());
		if (T >= 1 && T <= 100) {

			for (int i = 1; i <= T; i++) {

				rowNumber = Integer.parseInt(br.readLine());
				String firstLine = "";
				int counter = 0;
				while (counter < 4) {
					if (counter < rowNumber) {
						firstLine = br.readLine();
					} else {
						br.readLine();
					}
					counter++;
				}

				secondRowNumber = Integer.parseInt(br.readLine());
				String secondLine = "";
				counter = 0;
				while (counter < 4) {
					if (counter < secondRowNumber) {
						secondLine = br.readLine();
					} else {
						br.readLine();
					}
					counter++;
				}

				int lastSavedIndex = -1;
				int numbersOfLetters = 0;

				String line1[] = firstLine.split(" ");
				String line2[] = secondLine.split(" ");

				for (int j = 0; j < line1.length; j++) {
					for (int k = 0; k < line2.length; k++) {
						if (line1[j].equalsIgnoreCase(line2[k])) {
							lastSavedIndex = k;
							numbersOfLetters++;
						}
					}
				}

				if (numbersOfLetters > 1) {
					response = "Bad magician!";
				} else if (lastSavedIndex == -1) {
					response = "Volunteer cheated!";
				} else {
					response = line2[lastSavedIndex] + "";
				}

				System.out.println("Case #" + i + ": " + response);
			}

		} else {
			System.out.print("WRONG INPUT");
		}

		br.close();
		br = null;
		fis = null;

	}

}
