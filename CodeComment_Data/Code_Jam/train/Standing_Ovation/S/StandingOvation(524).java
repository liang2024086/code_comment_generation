package methodEmbedding.Standing_Ovation.S.LYD1460;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) {

		try {

			// //////////////////////////Open Input File
			// /////////////////////////////////////////////////////////////

			FileReader inputFile = new FileReader("inputA.txt");
			Scanner sc = new Scanner(inputFile);

			// //////////////////////////Open Output File
			// /////////////////////////////////////////////////////////////

			PrintWriter outputFile = new PrintWriter("output.txt");

			// /////////////////////////// Read Number of Cases
			// /////////////////////////////////////////////////////////////

			int numberOfCases = sc.nextInt();

			// /////////////////////////// Iterate on Cases
			// ////////////////////////////////////////////////////////////

			for (int i = 1; i <= numberOfCases; i++) {
				int sMax = sc.nextInt();
				int result = 0;

				int data = sc.nextInt();
				int precedents = (int) (data / Math.pow(10, sMax));
				int mostLeft = precedents;

				for (int j = 1; j <= sMax; j++) {
					data -= mostLeft * Math.pow(10, sMax - j + 1);
					mostLeft = (int) (data / Math.pow(10, sMax-j));
					if (precedents < j) {
						result += (j - precedents);
						precedents += (j - precedents);
					}

					precedents += mostLeft;
				}

				// ///////////////////// Add Result to OutPut File

				outputFile.println("Case #" + i + ": " + result);

			} // /// Iterating on Cases close

			// /////////////////////////////////// Close OutPut File
			// ////////////////////////////////////////////////

			outputFile.close();
			sc.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	} // / Main Close

} // / Class Close

