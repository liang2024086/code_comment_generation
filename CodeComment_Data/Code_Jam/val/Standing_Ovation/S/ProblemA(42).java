package methodEmbedding.Standing_Ovation.S.LYD1349;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("A-small-attempt0.in"));
		try {
			int t = scanner.nextInt();
			int caseNumber = 1;
			while (caseNumber <= t) {
				int result = 0;
				int max = scanner.nextInt();
				String input = scanner.next();
				int standsTotal = 0;
				for (int i = 0; i <= max; i++) {
					int stands = Integer.parseInt(String.valueOf(input.charAt(i)));
					if (i > standsTotal) {
						result += (i - standsTotal);
						standsTotal += (i - standsTotal);
					}
					standsTotal += stands;
				}
				
				System.out.println("Case #" + caseNumber++ + ": " + result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}
}
