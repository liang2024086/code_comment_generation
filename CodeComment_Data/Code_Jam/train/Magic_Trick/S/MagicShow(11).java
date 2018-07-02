package methodEmbedding.Magic_Trick.S.LYD2153;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class MagicShow {

	public static void main(String[] args) {

		String input = "A-small-attempt2.in";
		StringTokenizer token;
		int cases;
		int firstAnswer, secondAnswer;
		int[] firstRow;
		int[] secondRow;

		try {
			FileReader input_file = new FileReader(input);
			BufferedReader reader = new BufferedReader(input_file);

			String output = "A-small-attempt2.out";
			PrintWriter pw = new PrintWriter(output);

			cases = Integer.parseInt(reader.readLine());
			int caseNumber = 0;

			while (caseNumber < cases) {
				caseNumber++;

				firstAnswer = Integer.parseInt(reader.readLine());

				String line = null;
				int lineCount = 0;
				while (lineCount < firstAnswer) {
					line = reader.readLine();
					lineCount++;

				}

				token = new StringTokenizer(line);
				firstRow = new int[4];

				while (token.hasMoreElements()) {
					for (int i = 0; i < 4; ++i) {
						firstRow[i] = Integer.parseInt(token.nextToken());
					}
				}

				while (lineCount < 4) {
					line = reader.readLine();
					lineCount++;

				}

				secondAnswer = Integer.parseInt(reader.readLine());

				lineCount = 0;
				while (lineCount < secondAnswer) {
					line = reader.readLine();
					lineCount++;

				}

				token = new StringTokenizer(line);
				secondRow = new int[4];

				while (token.hasMoreElements()) {
					for (int i = 0; i < 4; ++i) {
						secondRow[i] = Integer.parseInt(token.nextToken());
					}
				}

				while (lineCount < 4) {
					line = reader.readLine();
					lineCount++;

				}

				int answer = 0;
				int answer_count = 0;
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						if (firstRow[i] == secondRow[j]) {
							answer = firstRow[i];
							answer_count++;
						}
					}
				}

				if (answer_count == 1) {
					pw.println("Case #" + caseNumber + ": " + answer);
				} else if (answer_count == 0) {
					pw.println("Case #" + caseNumber + ": " + "Volunteer cheated!");
				} else {
					pw.println("Case #" + caseNumber + ": " + "Bad magician!");
				}
			}

			reader.close();
			pw.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
