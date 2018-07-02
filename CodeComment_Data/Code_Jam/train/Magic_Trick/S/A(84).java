package methodEmbedding.Magic_Trick.S.LYD1347;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numCases = in.nextInt();
		int[] choices;
		int[][][] layout;
		
		for (int caseNum = 1; caseNum <= numCases; caseNum++) {
			System.out.printf("Case #%d: ", caseNum);
			choices = new int[2];
			layout = new int[2][4][4];
			
			for (int game = 0; game < 2; game++) {
				choices[game] = in.nextInt();
				for (int row = 0; row < 4; row++) {
					for (int col = 0; col < 4; col++) {
						layout[game][row][col] = in.nextInt();
					}
				}
			}
			
			Set<Integer> game1 = new HashSet<Integer>();
			for (int i = 0; i < 4; i++) {
				game1.add(layout[0][choices[0]-1][i]);
			}
			
			Set<Integer> game2 = new HashSet<Integer>();
			for (int i = 0; i < 4; i++) {
				game2.add(layout[1][choices[1]-1][i]);
			}
			
			game2.retainAll(game1);
			switch (game2.size()) {
			case 0:
				System.out.println("Volunteer cheated!");
				break;
			case 1:
				System.out.println(game2.iterator().next());
				break;
			default:
				System.out.println("Bad magician!");
				break;
			}
		}
	}
	
}
