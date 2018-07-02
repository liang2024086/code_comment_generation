package methodEmbedding.Magic_Trick.S.LYD1641;


import java.io.*;
import java.util.Scanner;

public class p1 {
	public static void main(String [] args) {
		try {
			Scanner sc = new Scanner(new File("p1in.txt"));
			PrintWriter writer = new PrintWriter("p1out.txt", "UTF-8");
			int num_tests = sc.nextInt();
			int fst_ans, snd_ans, card;
			boolean bad;
			int[][] layout = new int[4][4];
			int[] fst_row = new int[4];
			int[] snd_row = new int[4];
			for(int i = 0; i < num_tests; i++) {
				card = 0;
				bad = false;
				fst_ans = sc.nextInt();
				for(int j = 0; j < 4; j++) {
					for(int k = 0; k < 4; k++) {
						layout[j][k] = sc.nextInt();
					}
				}
				System.arraycopy(layout[fst_ans -1], 0, fst_row, 0, 4);
				snd_ans = sc.nextInt();
				for(int j = 0; j < 4; j++) {
					for(int k = 0; k < 4; k++) {
						layout[j][k] = sc.nextInt();
					}
				}
				System.arraycopy(layout[snd_ans -1], 0, snd_row, 0, 4);
				for(int fdx = 0; fdx < 4; fdx++) {
					for(int sdx = 0; sdx < 4; sdx++) {
						if (fst_row[fdx] == snd_row[sdx]) {
							if (card == 0) {
								card = fst_row[fdx];
							} else {
								bad = true;
							}
						}
					}
				}
				if (bad) {
					System.out.printf("Case #%d: %s\n", i + 1, "Bad magician!");
					writer.printf("Case #%d: %s\n", i + 1, "Bad magician!");
				} else if (card == 0) {
					System.out.printf("Case #%d: %s\n", i + 1, "Volunteer cheated!");
					writer.printf("Case #%d: %s\n", i + 1, "Volunteer cheated!");
				} else {
					System.out.printf("Case #%d: %d\n", i + 1, card);
					writer.printf("Case #%d: %d\n", i + 1, card);
				}
				
				
			}
			writer.close();
			sc.close();
		} catch (IOException e) {
			System.err.println("File error!\n");
		}
	}
}
