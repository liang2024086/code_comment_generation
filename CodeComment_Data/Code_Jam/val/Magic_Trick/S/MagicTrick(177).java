package methodEmbedding.Magic_Trick.S.LYD386;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagicTrick {
	private static final boolean DEBUG = false;
	private static final String FILENAME = "magic_trick";

	public static void main(String[] args) throws IOException {
		long startTime = System.nanoTime();

		if(DEBUG) {
			System.setIn(new BufferedInputStream(new FileInputStream(FILENAME + "_example.in")));
		} else {
			System.setIn(new BufferedInputStream(new FileInputStream(FILENAME + ".in")));
			System.setOut(new PrintStream(FILENAME + ".out"));
		}

		Scanner sc = new Scanner(System.in);

		int numTestCases = sc.nextInt();
		for(int caseNum = 1; caseNum <= numTestCases; caseNum++) {
			int rowFirstTime = sc.nextInt() - 1;
			int[][] cardsFirstTime = new int[4][4];
			for(int row = 0; row < cardsFirstTime.length; row++) {
				for(int col = 0; col < cardsFirstTime[row].length; col++) {
					cardsFirstTime[row][col] = sc.nextInt();
				}
			}
			
			int rowSecondTime = sc.nextInt() - 1;
			int[][] cardsSecondTime = new int[4][4];
			for(int row = 0; row < cardsSecondTime.length; row++) {
				for(int col = 0; col < cardsSecondTime[row].length; col++) {
					cardsSecondTime[row][col] = sc.nextInt();
				}
			}
			
			List<Integer> possibleCards = new ArrayList<Integer>();
			
			for(int colFirstCards = 0; colFirstCards < cardsFirstTime.length; colFirstCards++) {
				for(int colSecondCards = 0; colSecondCards < cardsSecondTime.length; colSecondCards++) {
					if(cardsFirstTime[rowFirstTime][colFirstCards] == cardsSecondTime[rowSecondTime][colSecondCards]) {
						possibleCards.add(cardsFirstTime[rowFirstTime][colFirstCards]);
					}
				}
			}
			
			if(possibleCards.size() == 0) {
				System.out.println("Case #" + caseNum + ": " + "Volunteer cheated!");
			} else if(possibleCards.size() == 1) {
				System.out.println("Case #" + caseNum + ": " + possibleCards.get(0));
			} else {
				System.out.println("Case #" + caseNum + ": " + "Bad magician!");
			}
		}

		if(DEBUG) System.out.println("Total time: " + ((System.nanoTime() - startTime) / 1000.0 / 1000.0 / 1000.0) + "s");
	}
}
