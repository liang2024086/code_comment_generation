package methodEmbedding.Magic_Trick.S.LYD683;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws FileNotFoundException,
			UnsupportedEncodingException {
		final String mag = "Bad magician!";
		final String vo = "Volunteer cheated!";

		Scanner scn = new Scanner(new File("in.txt"));
		int map1[][] = new int[4][4];
		int map2[][] = new int[4][4];
		int row1 = 0;
		int row2 = 0;
		int card1 = 0;

		PrintWriter writer = new PrintWriter("out.in", "UTF-8");

		int t = scn.nextInt();
		int z = 1;
		while (t != 0) {
			t--;
			row1 = scn.nextInt()-1;

			for (int i = 0; i < 4; i++) {
				for (int y = 0; y < 4; y++) {
					map1[i][y] = scn.nextInt();
				}
			}

			row2 = scn.nextInt()-1;

			for (int i = 0; i < 4; i++) {
				for (int y = 0; y < 4; y++) {
					map2[i][y] = scn.nextInt();
				}
			}
			
			int g = 0;
			for (int r = 0; r < 4; r++) {
				for (int o = 0; o < 4; o++) {
					if (map1[row1][r] == map2[row2][o]) {
						if (card1 == 0)
							card1 = map1[row1][r];
						else if (map1[row1][r] != card1) {
							if (t != 0)
								writer.println("Case #" + z + ": " + mag);
							else
								writer.println("Case #" + z + ": " + mag);
							g++;
							break;
						}
					}
				}
				if (g > 0)
					break;
			}
			if (g == 0) {
				if (card1 != 0) {
					if (t != 0)
						writer.println("Case #" + z + ": " + card1);
					else
						writer.println("Case #" + z + ": " + card1);

				}

				else {
					if (t != 0)
						writer.println("Case #" + z + ": " + vo);
					else
						writer.print("Case #" + z + ": " + vo);
				}
			}

			z++;
			card1 = 0;

		}

		writer.close();

	}

}
