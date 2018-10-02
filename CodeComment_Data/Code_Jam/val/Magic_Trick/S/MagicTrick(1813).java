package methodEmbedding.Magic_Trick.S.LYD990;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class MagicTrick {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (new FileReader("A-small-attempt0 (2).in"));
		PrintWriter pw = new PrintWriter (new FileWriter("out.txt"));
		int numTest = sc.nextInt();
		for (int z = 1; z <= numTest; z++) {
			int volChoice1 = sc.nextInt();
			int[] row1 = new int[4];
			for (int i = 1; i <= 4; i++) {
				if (i==volChoice1) {
					for (int j = 0; j < 4; j++) {
						row1[j] = sc.nextInt();
					}
				}
				else {
					for (int j = 0; j < 4; j++) {
						sc.nextInt();
					}
				}
			}
			int volChoice2 = sc.nextInt();
			int[] row2 = new int[4];
			for (int i = 1; i <= 4; i++) {
				if (i==volChoice2) {
					for (int j = 0; j < 4; j++) {
						row2[j] = sc.nextInt();
					}
				}
				else {
					for (int j = 0; j < 4; j++) {
						sc.nextInt();
					}
				}
			}
			int card = -1;
			int numCards = 0;
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (row1[i] == row2[j]) {
						card = row1[i];
						numCards++;
					}
				}
			}
			System.out.println(card);
			if (numCards == 0) {
				pw.println("Case #" + z + ": Volunteer cheated!");
			}
			else if (numCards == 1) {
				pw.println("Case #" + z + ": " + card);
			}
			else {
				pw.println("Case #" + z + ": Bad magician!");
			}
			pw.flush();
		}
		pw.close();
	}

}
