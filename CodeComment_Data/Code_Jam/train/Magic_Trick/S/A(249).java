package methodEmbedding.Magic_Trick.S.LYD1114;

import java.util.*;



public class A {
	
public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);
	int nCase = scanner.nextInt();
	
	String bad = new String("Bad magician!");
	String cheat = new String("Volunteer cheated!");
	
	for (int nc = 1; nc <= nCase; nc++) {
		int ans1 = scanner.nextInt();
		int[][] cards1 = new int[4][4];
		for (int i = 0; i < 4; i++)
		for (int j = 0; j < 4; j++)
			cards1[i][j] = scanner.nextInt();
		
		int ans2 = scanner.nextInt();
		int[][] cards2 = new int[4][4];
		for (int i = 0; i < 4; i++)
		for (int j = 0; j < 4; j++)
			cards2[i][j] = scanner.nextInt();
		
		boolean[] chosenCards = new boolean[17];
		for (int i = 0; i < 4; i++)
			chosenCards[cards1[ans1-1][i]] = true;
		
		int nFound = 0;
		int foundCard = 0;
		for (int i = 0; i < 4; i++)
			if (chosenCards[cards2[ans2-1][i]]) {
				nFound++;
				foundCard = cards2[ans2-1][i];
			}
		
		if (nFound == 0) {
			System.out.println("Case #" + nc + ": " + cheat);
		} else if (nFound == 1) {
			System.out.println("Case #" + nc + ": " + foundCard);
		} else {
			System.out.println("Case #" + nc + ": " + bad);
		}			
	}
}
}
