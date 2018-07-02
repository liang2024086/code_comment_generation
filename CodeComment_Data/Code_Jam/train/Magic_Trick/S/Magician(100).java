package methodEmbedding.Magic_Trick.S.LYD1607;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Magician {
	public static void main(String []args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileReader(args[0]));
		int numTestCases = Integer.parseInt(sc.nextLine());
		// Loop through each case.
		for (int i = 0; i < numTestCases; i++) {
			String []possibleNumber = null;
			String []possibleNumberTwo = null;
			ArrayList<String> solutions = new ArrayList<String>();
			int firstRow = Integer.parseInt(sc.nextLine());
			// Store the first row of solutions.
			for (int j = 1; j < 5; j++) {
				if (j == firstRow) {
					possibleNumber = sc.nextLine().split(" ");
				} else {
					sc.nextLine();
				}
			}
			int secondRow = Integer.parseInt(sc.nextLine());
			for (int j = 1; j < 5; j++) {
				if (j == secondRow) {
					possibleNumberTwo = sc.nextLine().split(" ");
				} else {
					sc.nextLine();
				}
			}
			for (int j = 0; j < possibleNumber.length; j++) {
				for (int k = 0; k < possibleNumberTwo.length; k++) {
					if (possibleNumber[j].equals(possibleNumberTwo[k])) {
						solutions.add(possibleNumber[j]);
					}
				}
			}
			// Outcomes.
			String printString = "Case #" + (i+1) + ": ";
			if (solutions.size() == 0) {
				// Volunteer cheated.
				System.out.println(printString + "Volunteer cheated!");
			} else if (solutions.size() == 1) {
				// Correct answer found.
				System.out.println(printString + solutions.get(0));
			} else {
				// Magician screwed up.
				System.out.println(printString + "Bad magician!");
			}
		}
	}
}
