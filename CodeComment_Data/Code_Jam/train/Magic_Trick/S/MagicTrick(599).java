package methodEmbedding.Magic_Trick.S.LYD1463;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class MagicTrick {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("A-small-attempt0.in"));
		int testCases = input.nextInt();
		PrintStream out = new PrintStream(new File("A-small-attempt0.out"));
		for (int i = 1; i <= testCases; ++i) {
			int[][] first = new int[4][4];
			int[][] second = new int[4][4];
			int firstChoice, secondChoice;
			firstChoice = input.nextInt();
			for (int j = 0; j < 4; ++j)
				for (int k = 0; k < 4; ++k)
					first[j][k] = input.nextInt();
			secondChoice = input.nextInt();
			for (int j = 0; j < 4; ++j)
				for (int k = 0; k < 4; ++k)
					second[j][k] = input.nextInt();
			int result = 0, counter = 0;
			for (int j = 0; j < 4; ++j) {
				for (int k = 0; k < 4; ++k) {
					if (first[firstChoice - 1][j] == second[secondChoice - 1][k]) {
						result = first[firstChoice - 1][j];
						counter++;
					}
				}
			}
			out.print("Case #" + i + ": ");
			switch (counter) {
			case 0:
				out.println("Volunteer cheated!");
				break;
			case 1:
				out.println(result);
				break;
			default:
				out.println("Bad magician!");

			}

		}
		input.close();
		out.close();

	}

}
