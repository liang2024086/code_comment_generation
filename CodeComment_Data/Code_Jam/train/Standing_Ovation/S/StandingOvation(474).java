package methodEmbedding.Standing_Ovation.S.LYD430;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StandingOvation {
	private static Scanner inputScanner;
	private static PrintWriter outputOfCases;
	private static String userInput;
	private static int numberOfCases;
	private static String shynessString;
	private static int totalStadingPersons = 0;
	private static int friendsNeeded = 0;
	private static ArrayList < String[] > userInputCombinations;

	public static void main(String[] args) {
		userInputCombinations = new ArrayList < String[] > ();
		try {
			inputScanner = new Scanner(new File("C:/Users/Hemal/Desktop/A-small-attempt3.in"));
			outputOfCases = new PrintWriter("output.txt");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		boolean isFirstLine = true;
		while (inputScanner.hasNextLine()) {
			if (isFirstLine) {
				numberOfCases = Integer.parseInt(inputScanner.nextLine());
				isFirstLine = false;
			} else {
				userInput = inputScanner.nextLine();

				String[] userInputCombination = userInput.split(" ");
				if (userInputCombination.length != 2) {
					System.out.println("Invalid Input Entered by User");
					System.exit(0);
				}
				userInputCombinations.add(userInputCombination);
			}
		}
		for (int caseValue = 0; caseValue < numberOfCases; caseValue++) {
			String[] userInputCombination = userInputCombinations.get(caseValue);
			shynessString = userInputCombination[1];
			int[] shenesses = new int[shynessString.length()];

			for (int i = 0; i < shenesses.length; i++) {
				shenesses[i] = Integer.parseInt(String.valueOf(shynessString.charAt(i)));
			}
			totalStadingPersons = Integer.parseInt(String.valueOf(shynessString.charAt(0)));
			for (int personIndex = 1; personIndex < shenesses.length; personIndex++) {
				if (shenesses[personIndex] != 0) {
					while (personIndex > (totalStadingPersons + friendsNeeded)) {
						friendsNeeded++;
					}
				}
				totalStadingPersons += shenesses[personIndex];
			}
			System.out.println("Case #" + (caseValue + 1) + ": " + friendsNeeded);
			outputOfCases.println("Case #" + (caseValue + 1) + ": " + friendsNeeded);
			totalStadingPersons = 0;
			friendsNeeded = 0;
		}
		outputOfCases.close();
	}
}
