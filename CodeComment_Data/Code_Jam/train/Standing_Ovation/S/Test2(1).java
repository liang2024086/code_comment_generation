package methodEmbedding.Standing_Ovation.S.LYD1055;


import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Path inputFilePath = Paths
				.get("C:/MyDrive/Programming/GoogleCodeJam/StandingOvation/A-small-attempt1.in");
		Path outputFilePath = Paths
				.get("C:/MyDrive/Programming/GoogleCodeJam/StandingOvation/A-small-attempt1.out");
		String line;
		String[] tokens;
		char[] c;
		int numberOfPersonsToBeAdded = 0;
		int currentPeopleCount = 0;
		int caseNumber = 0;
		try (Scanner scanner = new Scanner(inputFilePath);
				BufferedWriter writer = Files.newBufferedWriter(outputFilePath)) {
			while (scanner.hasNextLine()) {

				line = scanner.nextLine();
				tokens = line.split(" ");
				if (tokens.length > 1) {
					c = tokens[1].toCharArray();
					caseNumber++;

					for (int i = 0; i < c.length; i++) {
						if (i == 0
								&& Integer.parseInt(String.valueOf(c[i])) == 0) {
							numberOfPersonsToBeAdded++;
							currentPeopleCount++;
						}

						if (i != 0 && c[i] != 0 && i > currentPeopleCount) {
							numberOfPersonsToBeAdded = numberOfPersonsToBeAdded
									+ (i - currentPeopleCount);
							currentPeopleCount += (i - currentPeopleCount);
						}

						currentPeopleCount = currentPeopleCount
								+ Integer.parseInt(String.valueOf(c[i]));
						System.out.println("currentPeopleCount "
								+ currentPeopleCount);
					}
					writer.write("Case #" + caseNumber + ": "
							+ numberOfPersonsToBeAdded);
					writer.newLine();
					numberOfPersonsToBeAdded = 0;
					currentPeopleCount = 0;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
