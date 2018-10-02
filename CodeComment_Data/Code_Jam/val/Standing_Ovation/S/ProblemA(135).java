package methodEmbedding.Standing_Ovation.S.LYD863;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProblemA {
	public static void main(String[] args) {
		String inputFileName = "input/A-small-attempt0.in";
		String outputFileName = "output/output";

		File inputFile = new File(inputFileName);
		File outputFile = new File(outputFileName);

		try {
			FileWriter fw = new FileWriter(outputFile);
			Scanner sc = new Scanner(inputFile);

			int caseNum = sc.nextInt();

			for (int i = 0; i < caseNum; i++) {
				long shynessMax = sc.nextLong();
				String line = sc.next();
				long friends = 0;
				long standingCount = 0;

				for (int j = 0; j <= shynessMax; j++) {
					int c = Integer.valueOf(line.charAt(j) + "");
					if (j >= standingCount) {
						friends += j - standingCount;
						standingCount = j;
					}
					standingCount += c;
				}
				fw.write(String.format("Case #%d: %d\n", i + 1, (long) friends));
			}
			sc.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
