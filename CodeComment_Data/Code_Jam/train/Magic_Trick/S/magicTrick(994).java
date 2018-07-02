package methodEmbedding.Magic_Trick.S.LYD1731;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class magicTrick {

	/**
	 * @param args- The input file 
	 */
	public static void main(String[] args) {

		File file = new File(args[0]);
		File output = new File(file.getName().substring(0,
				file.getName().length() - 3)
				+ "-out.txt");

		try {

			FileWriter fw = new FileWriter(output);
			BufferedWriter bw = new BufferedWriter(fw);

			Scanner scanner = new Scanner(file);
			int numberOfTestCases = 0;

			if (scanner.hasNextLine()) {
				numberOfTestCases = scanner.nextInt();
				System.out.println("Number of test Cases " + numberOfTestCases);
			}

			for (short i = 0; i < numberOfTestCases; i++) {

				HashSet<String> theCards = new HashSet<String>();
				HashSet<String> theNewCards = new HashSet<String>();

				short firstAnswer = scanner.nextShort();
				scanner.nextLine();
				System.out.println("First Answer " + firstAnswer);
				for (short first = 1; first <= 4; first++) {
					String line = scanner.nextLine();

					if (first == firstAnswer) {
						String[] tempArray = line.split(" ");
						theCards.addAll(Arrays.asList(tempArray));
						System.out.println(theCards);
					}
				}

				short secondAnswer = scanner.nextShort();
				scanner.nextLine();
				System.out.println("Second Answer " + secondAnswer);
				for (short second = 1; second <= 4; second++) {
					String line = scanner.nextLine();
					// System.out.println(line);
					if (second == secondAnswer) {
						String[] tempArray = line.split(" ");
						theNewCards.addAll(Arrays.asList(tempArray));
						System.out.println(theNewCards);
					}
				}

				theCards.retainAll(theNewCards);

				StringBuffer resultString = new StringBuffer();
				if (theCards.size() == 0) {
					resultString.append("Volunteer cheated!");
				} else if (theCards.size() == 1) {
					resultString.append(theCards.iterator().next());
				} else {
					resultString.append("Bad magician!");
				}

				bw.write("Case #" + (i + 1) + ": " + resultString.toString()
						+ System.getProperty("line.separator"));
				System.out.println(resultString.toString());
			}
			bw.close();
		}

		catch (Exception e) {
			System.out.println(e);
		}

	}

}
