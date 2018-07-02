package methodEmbedding.Magic_Trick.S.LYD891;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class problem_a {

	public static final String inputFilename = "A-small.in";
	public static final String outputFilename = "src/A-small.out";

	public static void main(String[] args) throws IOException {

		String filename = "A-small.in";
		Scanner scanner = new Scanner(problem_a.class.getResourceAsStream(filename));
		PrintWriter pw = new PrintWriter(new FileWriter(outputFilename));

		int no_of_cases = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < no_of_cases; i++) {
			int answer = scanner.nextInt();
			scanner.nextLine();

			int[] line1 = new int[4];

			for (int j = 1; j <= 4; j++) {
				if (j == answer) {
					for (int k = 0; k < 4; k++) {
						line1[k] = scanner.nextInt();
					}
				}

				scanner.nextLine();
			}

			Arrays.sort(line1);

			String result = null;

			answer = scanner.nextInt();
			scanner.nextLine();

			for (int j = 1; j <= 4; j++) {
				if (j == answer) {
					for (int k = 0; k < 4; k++) {
						int num = scanner.nextInt();

						if (Arrays.binarySearch(line1, num) >= 0) {
							if (result == null) {
								result = String.valueOf(num);
							} else {
								result = "Bad magician!";
								break;
							}
						}
					}
				}

				scanner.nextLine();
			}

			if (result == null)
				result = "Volunteer cheated!";

			result = "Case #" + (i + 1) + ": " + result;

			System.out.println(result);
			pw.println(result);
		}

		scanner.close();
		pw.flush();
		pw.close();
	}

}
