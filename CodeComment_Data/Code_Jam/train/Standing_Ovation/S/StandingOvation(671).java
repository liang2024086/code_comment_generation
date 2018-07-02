package methodEmbedding.Standing_Ovation.S.LYD1202;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class StandingOvation {
	public StandingOvation() throws FileNotFoundException {
		System.setOut(new PrintStream(new File("A-small.out")));
		Scanner sc = new Scanner(new FileInputStream(new File(
				"A-small-attempt1.in")));
		int T = sc.nextInt();
		// Loop through each test case
		for (int testCase = 0; testCase < T; testCase++) {
			int maxShyness = sc.nextInt();
			String shynessString = sc.next();
			int S[] = new int[shynessString.length()];
			int peopleCount = 0;
			int peopleToAdd = 0;
			for (int i = 0; i < shynessString.length(); i++) {
				S[i] = Integer.parseInt(shynessString.charAt(i) + "");
				// System.out.print(S[i]);
				if (i <= peopleCount) {

				} else {
					if (S[i] == 0) {

					} else {
						peopleToAdd += i - peopleCount;
						peopleCount += peopleToAdd;
					}
				}
				peopleCount += S[i];
			}
			System.out.println("Case #" + (testCase + 1) + ": " + peopleToAdd);
			// System.out.println();
		}
		sc.close();

	}

	public static void main(String[] args) throws FileNotFoundException {
		new StandingOvation();
	}
}
