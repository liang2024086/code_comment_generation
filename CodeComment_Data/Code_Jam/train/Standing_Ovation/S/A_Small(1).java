package methodEmbedding.Standing_Ovation.S.LYD1662;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class A_Small {
	public static void main(String[] args) {

		try {
			Scanner scanner = new Scanner(new File("src/input.txt"));
			PrintWriter printWriter = new PrintWriter(new File("src/output.txt"));

			int T = scanner.nextInt();
			int testCase = 0;
			while (testCase++ < T) {
				int sMax = scanner.nextInt() + 1;
				String shyness = scanner.next();

				int cnt = 0, currentStanding = 0;
				for (int i = 0; i < shyness.length(); i++) {
					int x = Integer.parseInt(shyness.charAt(i) + "");

					if (x == 0)
						continue;

					if (i <= currentStanding) {
						currentStanding += x;
					} else {
						cnt += (i - currentStanding);
						currentStanding += (i - currentStanding);
						currentStanding += x;
					}
				}

				System.out.printf("Case #%d: %d\n", testCase, cnt);
				printWriter.printf("Case #%d: %d\n", testCase, cnt);
			}
			printWriter.flush();
			printWriter.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
