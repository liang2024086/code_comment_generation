package methodEmbedding.Magic_Trick.S.LYD2059;

import java.util.Scanner;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.io.FileOutputStream;

public class MagicTrick {
	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(new FileReader("input.txt"));
			PrintStream outFile = new PrintStream(new FileOutputStream("output.txt"));
			System.setOut(outFile);
			int numTestCases = inFile.nextInt();

			for (int k = 1; k < numTestCases + 1; k++) {

				int answer1 = inFile.nextInt() - 1;

				ArrayList<ArrayList<Integer>> cards1 = new ArrayList<ArrayList<Integer>>();

				for (int i = 0; i < 4; i++) {
					cards1.add(new ArrayList<Integer>());
					for (int j = 0; j < 4; j++) {
						cards1.get(i).add(inFile.nextInt());
					}//end innerloop
				}//end middleloop

				int answer2 = inFile.nextInt() - 1;

				ArrayList<ArrayList<Integer>> cards2 = new ArrayList<ArrayList<Integer>>();

				for (int i = 0; i < 4; i++) {
					cards2.add(new ArrayList<Integer>());
					for (int j = 0; j < 4; j++) {
						cards2.get(i).add(inFile.nextInt());
					}//end innerloop
				}//end middleloop

				int count = 0;
				int solution = 0;
				for (int n = 0; n < 4; n++) {
					if (cards2.get(answer2).contains(cards1.get(answer1).get(n))) {
							solution = cards1.get(answer1).get(n);
							count++;
					}
				}

				if (count == 1) {
					System.out.println("Case #" + k + ": " + solution);
				}

				else if (count > 1) {
					System.out.println ("Case #" + k + ": Bad magician!");
				}

				else {
					System.out.println ("Case #" + k + ": Volunteer cheated!");
				}

			}//end outerloop
		} catch (Exception e) {

		}

	}//end main
}//end class
