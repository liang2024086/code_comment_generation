package methodEmbedding.Standing_Ovation.S.LYD1261;


import java.io.File;
import java.util.Scanner;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		int iteration;

		Scanner iterationScanner = new Scanner(
				Main.class.getResourceAsStream("A-small-attempt1.in"));
		Scanner problemDivider = null;
		int highestShyness = 0;
		int audinessNumber = 0;
		int friendNumber = 0;
		String audinessLevel;
		int counter = 1;
		iterationScanner.hasNext();
		iteration = iterationScanner.nextInt();
		iterationScanner.hasNext();
		iterationScanner.nextLine();
		while (counter <= iteration) {
			String problem = iterationScanner.nextLine();
			problemDivider = new Scanner(problem);
			problemDivider.hasNext();
			highestShyness = problemDivider.nextInt();
			problemDivider.hasNext();
			audinessLevel = problemDivider.next();
			for (int i = 0; i <= highestShyness; i++) {
				if (audinessNumber < i) {
					friendNumber = friendNumber + (i - audinessNumber);
					audinessNumber += 1;
				}
				audinessNumber += (audinessLevel.charAt(i) - '0');
			}
			System.out.println("Case #" + counter + ": " + friendNumber);
			friendNumber = 0;
			audinessNumber = 0;
			counter++;
		}
		iterationScanner.close();
		problemDivider.close();
	}
}
