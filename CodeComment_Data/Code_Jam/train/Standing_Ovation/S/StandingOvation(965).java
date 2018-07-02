package methodEmbedding.Standing_Ovation.S.LYD1437;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StandingOvation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("A-small.in"));
			PrintWriter printWriter = new PrintWriter(new File("A-small.out"));
			int testCases = sc.nextInt();
			for (int t = 0; t < testCases; t++) {
				sc.nextInt();
				String input = sc.next();
				int s = 0;
				int invitationNeeded = 0;
				for (int i = 0; i < input.length(); i++) {
					int num = Character.getNumericValue(input.charAt(i));
					if (s < i) {
						if (num != 0) {
							invitationNeeded += i - s;
							s += i - s;
						}
					}
					s += num;
				}
				printWriter.println("Case #" + (t + 1) + ": " + invitationNeeded);
			}
			sc.close();
			printWriter.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
