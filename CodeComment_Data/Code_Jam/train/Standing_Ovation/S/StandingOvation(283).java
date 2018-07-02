package methodEmbedding.Standing_Ovation.S.LYD2117;

import java.util.Scanner;

public class StandingOvation {

	private static String[] results;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numberOfTest = sc.nextInt();

		results = new String[numberOfTest];
		for (int testCase = 0; testCase < numberOfTest; testCase++) {
			int Smax = sc.nextInt(); // the maximum shyness level
			String k = sc.next(); // how many people in the audience have
									// shyness level k
			int totalAud = Character.getNumericValue(k.charAt(0));
			int additionalAud = 0;

			for (int i = 1; i <= Smax; i++) {
				int kInt = Character.getNumericValue(k.charAt(i));
				if (i > totalAud) {
					int needAud = i - totalAud;
					if (additionalAud < needAud) {
						additionalAud = needAud;
					}
				}
				totalAud += kInt;
			}
			results[testCase] = "Case #" + (testCase + 1) + ": " + additionalAud;

		}

		for (int testCase = 0; testCase < numberOfTest; testCase++) {
			System.out.println(results[testCase]);
		}
	}
}
