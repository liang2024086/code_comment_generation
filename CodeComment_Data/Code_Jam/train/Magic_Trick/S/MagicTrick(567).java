package methodEmbedding.Magic_Trick.S.LYD2159;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MagicTrick {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Marco\\Desktop\\A-small-attempt0.in");
		Scanner sc = null;
		int numCases = 0;
		
		try {
			sc = new Scanner(file);
			numCases = sc.nextInt();
		} catch (FileNotFoundException e) {
			System.out.println("Fehler beim Einlesen!");
			e.printStackTrace();
		}
		
		for (int caseNum = 1; caseNum <= numCases; caseNum++) {
			
			int firstAnswer = Integer.parseInt(sc.next());
			int[][] first = new int[4][4];
			
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					first[i][j] = Integer.parseInt(sc.next());
				}
			}
			
			int secondAnswer = Integer.parseInt(sc.next());
			int[][] second = new int[4][4];
			
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					second[i][j] = Integer.parseInt(sc.next());
				}
			}
			
			boolean legit = false;
			boolean nothingFound = true;
			int found = -1;
			
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (first[firstAnswer-1][i] == second[secondAnswer-1][j]) {
						if (found == -1) {
							found = first[firstAnswer-1][i];
							legit = true;
							nothingFound = false;
						} else {
							legit = false;
							break;
						}
					}
				}
			}
			
			System.out.print("Case #" + caseNum + ": ");
			
			if (nothingFound) {
				System.out.println("Volunteer cheated!");
				continue;
			}
			
			if (legit) {
				System.out.println(found);
			} else {
				System.out.println("Bad magician!");
			}
			
			
		}
	}
}
