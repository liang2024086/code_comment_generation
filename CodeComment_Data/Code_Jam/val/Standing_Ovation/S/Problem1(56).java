package methodEmbedding.Standing_Ovation.S.LYD842;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("problem1.txt"));
		int totalCases = Integer.parseInt(scan.nextLine());
		int totalNeeded;
		for (int i = 0; i < totalCases; i++) {
			totalNeeded = 0;
			String currentLine = scan.nextLine();
			String[] parts = currentLine.split(" ");
			int sMax = Integer.parseInt(parts[0]);
			int counter = 0;
			for (int j = 0; j < sMax + 1; j++) {
				counter = counter + Character.getNumericValue(parts[1].charAt(j));
				if (counter == 0) {
					totalNeeded++;
				} else {
					counter--;
				}
			}

			System.out.println("Case #" + (i + 1) + ": " + totalNeeded);
		}
	}
}
