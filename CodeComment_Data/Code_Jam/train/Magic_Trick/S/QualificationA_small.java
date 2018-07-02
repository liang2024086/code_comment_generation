package methodEmbedding.Magic_Trick.S.LYD1270;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class QualificationA_small {

	public static void main(String[] args) throws IOException {

		BufferedReader inputReader = new BufferedReader(
				new FileReader("fileQualificationA\\A-small-attempt0.in"));
		BufferedWriter outputWriter = new BufferedWriter(
				new FileWriter("fileQualificationA\\A-small-attempt0.out"));
		int testCaseNumber = Integer.valueOf(inputReader.readLine());
		for (int i = 1 ; i <= testCaseNumber ; i++) {
			int firstChoise = Integer.valueOf(inputReader.readLine());
			int[] rowOfFirstChoise = new int[4];
			for (int j = 1 ; j <= 4; j++) {
				String row = inputReader.readLine();
				if (j == firstChoise) {
					String[] rowSplit = row.split(" ");
					for (int k = 0 ; k < 4 ; k++) {
						rowOfFirstChoise[k] = Integer.valueOf(rowSplit[k]);
					}
				}
			}
			int secondChoise = Integer.valueOf(inputReader.readLine());
			int[] rowOfSecondChoise = new int[4];
			for (int j = 1 ; j <= 4; j++) {
				String row = inputReader.readLine();
				if (j == secondChoise) {
					String[] rowSplit = row.split(" ");
					for (int k = 0 ; k < 4 ; k++) {
						rowOfSecondChoise[k] = Integer.valueOf(rowSplit[k]);
					}
				}
			}
			//boolean isBad = false, isCheated = false;
			int sameNumberCount = 0;
			int[] sameNumber = new int[4];
			for (int j = 0 ; j < 4; j++) {
				for (int k = 0 ; k < 4 ; k++) {
					if (rowOfFirstChoise[j] == rowOfSecondChoise[k]) {
						sameNumber[sameNumberCount] = rowOfFirstChoise[j];
						sameNumberCount++;
					}
				}
			}
			if (sameNumberCount == 1) {
				outputWriter.write("Case #" + Integer.toString(i) + ": " + Integer.toString(sameNumber[0]));
			} else if (sameNumberCount == 0) {
				outputWriter.write("Case #" + Integer.toString(i) + ": Volunteer cheated!");
			} else {
				outputWriter.write("Case #" + Integer.toString(i) + ": Bad magician!");
			}
			outputWriter.newLine();
		}
		inputReader.close();
		outputWriter.close();
	}

}
