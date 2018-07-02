package methodEmbedding.Magic_Trick.S.LYD429;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class A {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new FileReader(
				"A-small-attempt2.in"));
		FileWriter fw = new FileWriter("A-small.out");
		/*
		 * BufferedReader in = new BufferedReader(new FileReader("A-large.in"));
		 * FileWriter fw = new FileWriter("A-large.out");
		 */
		int totalCases = new Integer(in.readLine());
		for (int cases = 1; cases <= totalCases; cases++) {
			int firstChoise = new Integer(in.readLine());
			String firstChoiceLine = null;
			int[] firstChoiceArr = new int[4];
			for (int i = 1; i <= 4; i++) {
				if (i == firstChoise)
					firstChoiceLine = in.readLine();
				else
					in.readLine();
			}

			int secondChoise = new Integer(in.readLine());
			String secondChoiceLine = null;
			int[] secondChoiceArr = new int[4];
			for (int i = 1; i <= 4; i++) {
				if (i == secondChoise)
					secondChoiceLine = in.readLine();
				else
					in.readLine();
			}
			// System.out.println(firstChoiceLine);
			StringTokenizer firstTokenizer = new StringTokenizer(
					firstChoiceLine);
			int x = 0;
			while (firstTokenizer.hasMoreElements()) {
				firstChoiceArr[x] = Integer
						.parseInt(firstTokenizer.nextToken());
				// System.out.println(firstChoiceArr[x]);
				x++;

			}
			StringTokenizer secondTokenizer = new StringTokenizer(
					secondChoiceLine);
			int y = 0;
			while (secondTokenizer.hasMoreTokens()) {
				secondChoiceArr[y] = Integer.parseInt(secondTokenizer
						.nextToken());
				y++;

			}

			int match = 0;
			int matchVal = 0;
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (firstChoiceArr[i] == secondChoiceArr[j]) {
						match++;
						matchVal = firstChoiceArr[i];
						System.out.println(matchVal);
					}
					if (match > 1) {
						break;
					}
				}
			}
			if (match == 0)
				fw.append("Case #" + cases + ": Volunteer cheated!\n");
			else if (match == 1)
				fw.append("Case #" + cases + ": " + matchVal + "\n");
			else
				fw.append("Case #" + cases + ": Bad magician!\n");
		}
		fw.flush();
		fw.close();
		in.close();
	}

}
