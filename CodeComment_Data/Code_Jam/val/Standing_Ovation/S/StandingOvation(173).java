package methodEmbedding.Standing_Ovation.S.LYD914;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class StandingOvation {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("A-small-attempt0.in"));
		PrintStream output = new PrintStream(new File("A-small-attempt0.out"));
		int numberOfCases = input.nextInt();
		for (int i = 0; i < numberOfCases; i++) {
			int additionalPeople = 0;
			int currentStanding = 0;
			output.print("Case #" + (i + 1) + ": ");
			int maxShyness = input.nextInt() + 1;
			String shynessString = input.next();
			char[] numberOfPeopleInEachLevel = shynessString.toCharArray();
			for (int currentShyness = 0; currentShyness < maxShyness; currentShyness++) {
				if (currentStanding < currentShyness) {
					additionalPeople += currentShyness - currentStanding;
					currentStanding = currentShyness;
				}
				currentStanding += Integer.parseInt(numberOfPeopleInEachLevel[currentShyness] + "");
			}
			output.println(additionalPeople);
		}
		input.close();
		output.close();
	}
}
