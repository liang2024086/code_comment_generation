package methodEmbedding.Standing_Ovation.S.LYD1213;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) {

		File file = new File("/Users/marco_kabelitz/Desktop/A-small-attempt0.in");
		Scanner sc = null;
		int cases = -1;

		try {
			sc = new Scanner(file);
			cases = sc.nextInt();
		} catch (FileNotFoundException e) {
			System.out.println("Fehler beim Einlesen!");
			e.printStackTrace();
		}

		for (int caseNum = 1; caseNum <= cases; caseNum++) {

			int maxLevel = sc.nextInt();
			String audience = sc.next();

			int peopleStanding = Character.getNumericValue(audience.charAt(0));
			int friendsNecessary = 0;

			for (int i = 1; i <= maxLevel; i++) {
				// System.err.println(peopleStanding);
				if (peopleStanding < i) {
					friendsNecessary += i - peopleStanding;
					peopleStanding += i - peopleStanding;
				}

				peopleStanding += Character.getNumericValue(audience.charAt(i));
			}

			System.out.println("Case #" + caseNum + ": " + friendsNecessary);
		}
	}
}
