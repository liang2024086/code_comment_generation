package methodEmbedding.Magic_Trick.S.LYD1441;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class p1 {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// ///////////////////////////////////////////////////////////////////
		//long start = System.nanoTime();
		// ///////////////////////////////////////////////////////////////////
		//Scanner inFile = new Scanner(new File("p1.txt"));
		 Scanner inFile = new Scanner(new File("A-small-attempt0.in"));
		//Scanner inFile = new Scanner(new File("A-Large.in"));
		PrintWriter out = new PrintWriter("p1out.txt");
		int numberOfTimes = inFile.nextInt();

		for (int times = 1; times <= numberOfTimes; times++) {
			int row1 = inFile.nextInt();
			int index = 0;
			int cards[] = new int[4];
			ArrayList<Integer> mcard = new ArrayList<Integer>();
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (i == row1 - 1) {
						cards[index] = inFile.nextInt();
						index++;
					} else {
						inFile.nextInt();
					}
				}
			}
			int row2 = inFile.nextInt();
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (i == row2 - 1) {
						int card = inFile.nextInt();
						for (int k = 0; k < cards.length; k++) {
							if (cards[k] == card) {
								mcard.add(card);
							}
						}
					} else {
						inFile.nextInt();
					}
				}
			}
			if (mcard.size() > 1) {
				out.println("Case #"+times+": Bad magician!");
			} else if (mcard.size() == 0) {
				out.println("Case #"+times+": Volunteer cheated!");
			} else {
				out.println("Case #"+times+": "+mcard.get(0));
			}
		}
		inFile.close();
		out.close();
		// ///////////////////////////////////////////////////////////////////
		//long stop = System.nanoTime();
		//System.out.printf("Run time: %.1f ms%n", (stop - start) / 1000000.0);
		//System.out.println("End of Program");
		// ///////////////////////////////////////////////////////////////////

	}
}
