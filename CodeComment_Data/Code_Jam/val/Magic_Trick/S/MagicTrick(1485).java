package methodEmbedding.Magic_Trick.S.LYD462;

import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;


public class MagicTrick {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int row1 = sc.nextInt();
			int cards[][] = new int[4][4];
			for(int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					cards[j][k] = sc.nextInt();
				}
			}
			Vector<Integer> v = new Vector<Integer>();
			for (int j = 0; j < 4; j++) {
				v.add(cards[row1 - 1][j]);
			}
			int row2 = sc.nextInt();
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					cards[j][k] = sc.nextInt();
				}
			}
			Vector<Integer> w = new Vector<Integer>();
			for (int j = 0; j < 4; j++) {
				if (v.contains(new Integer(cards[row2 - 1][j]))) {
					w.add(cards[row2 - 1][j]);
				}
			}
			if (w.isEmpty()) {
				System.out.println("Case #" + (i + 1) + ": Volunteer cheated!");
			}
			else if (w.size() == 1) {
				
				System.out.println("Case #" + (i + 1) + ": " + w.get(0));
			}
			else {
				System.out.println("Case #" + (i + 1) + ": Bad magician!");
			}
		}
	}
}
