package methodEmbedding.Magic_Trick.S.LYD1891;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuestionOne {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(new File("A-small-attempt0.in"));
			int nTests = Integer.parseInt(scan.nextLine());
			for (int i=1; i<=nTests; i++) {
				int guess1 = Integer.parseInt(scan.nextLine());
				int[] candidate1 = new int[4];
				for (int j=1; j<=4; j++) {
					String[] lines = scan.nextLine().split(" ");
					if (j == guess1) {
						candidate1 = new int[]{Integer.parseInt(lines[0]),
								Integer.parseInt(lines[1]),Integer.parseInt(lines[2]),
								Integer.parseInt(lines[3])};
					}
				}
				int guess2 = Integer.parseInt(scan.nextLine());
				int[] candidate2 = new int[4];
				for (int j=1; j<=4; j++) {
					String[] lines = scan.nextLine().split(" ");
					if (j == guess2) {
						candidate2 = new int[]{Integer.parseInt(lines[0]),
								Integer.parseInt(lines[1]),Integer.parseInt(lines[2]),
								Integer.parseInt(lines[3])};
					}
				}
				int nMatches = 0;
				int matched = -1;
				for (int c1: candidate1) {
					for (int c2: candidate2) {
						if (c1 == c2) {
							nMatches++;
							matched = c1;
						}
					}
				}
				if (nMatches == 0) {
					System.out.println("Case #" + i + ": " + "Volunteer cheated!");
				} else if (nMatches == 1) {
					System.out.println("Case #" + i + ": " + matched);
				} else if (nMatches > 1) {
					System.out.println("Case #" + i + ": " + "Bad magician!");
				}
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
