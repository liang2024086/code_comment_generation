package methodEmbedding.Magic_Trick.S.LYD171;


import java.util.*;
import java.io.*;

public class MagicTrick {
	private static Scanner reader = new Scanner(System.in);
	private static String inputFolder;

	public static void main(String[] args) throws Exception {
		inputFolder = reader.nextLine();
		
		BufferedReader br = new BufferedReader(new FileReader(inputFolder
				+ "\\input.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter(inputFolder
				+ "\\output.txt"));

		int howManyRounds;
		int firstChoose;
		int secondChoose;
		String[] helper;
		int[] firstOptions = new int[4];
		int[] secondOptions = new int[4];
		int counter;
		int solution;

		String currLine;

		howManyRounds = Integer.parseInt(br.readLine());
		// loop for diff rounds
		for (int i = 1; i <= howManyRounds; i++) {

			// first choose
			firstChoose = Integer.parseInt(br.readLine());

			// get the right numbers
			for (int j = 1; j <= 4; j++) {
				currLine = br.readLine();
				if (j == firstChoose) {
					helper = currLine.split(" ");
					for (int k = 0; k < 4; k++)
						firstOptions[k] = Integer.parseInt(helper[k]);
				}
			}

			// second choose
			secondChoose = Integer.parseInt(br.readLine());

			// get the right numbers
			for (int j = 1; j <= 4; j++) {
				currLine = br.readLine();
				if (j == secondChoose) {
					helper = currLine.split(" ");
					for (int k = 0; k < 4; k++)
						secondOptions[k] = Integer.parseInt(helper[k]);
				}
			}

			counter = 0;
			solution = 0;
			for (int j = 0; j < 4; j++)
				for (int k = 0; k < 4; k++)
					if (firstOptions[j] == secondOptions[k]) {
						counter++;
						solution = firstOptions[j];
					}

			if (i == howManyRounds) {
				if (counter > 1)
					bw.write("Case #" + i + ": Bad magician!");
				else if (counter == 0)
					bw.write("Case #" + i + ": Volunteer cheated!");
				else
					// if counter ==1
					bw.write("Case #" + i + ": " + solution);
			} else {
				if (counter > 1)
					bw.write("Case #" + i + ": Bad magician!\n");
				else if (counter == 0)
					bw.write("Case #" + i + ": Volunteer cheated!\n");
				else
					// if counter ==1
					bw.write("Case #" + i + ": " + solution + "\n");
			}
		}

		br.close();
		bw.close();
	}
}
