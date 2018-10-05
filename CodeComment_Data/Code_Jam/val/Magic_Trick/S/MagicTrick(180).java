package methodEmbedding.Magic_Trick.S.LYD1133;

/**
 * 
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author manurampandit
 * 
 */
public class MagicTrick {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		PrintStream out = new PrintStream(new FileOutputStream("outputA.txt"));
		System.setOut(out);
		int T = in.nextInt();
		int[][] a;
		int[][] b;
		int firstA, secondA, foundValue = 0;
		boolean isFound;
		boolean dupFound;
		for (int counter = 1; counter <= T; counter++) {
			a = new int[4][4];
			b = new int[4][4];
			firstA = in.nextInt();

			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					a[i][j] = in.nextInt();
				}
			}
			secondA = in.nextInt();
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					b[i][j] = in.nextInt();
				}
			}
			isFound = false;
			dupFound = false;
			// check for each element in firstA row with all answer in secondA
			// row
			firstA--;
			secondA--;
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (a[firstA][i] == b[secondA][j]) {
						// element is already found out
						if (isFound) {
							dupFound = true;
							break;
						}
						isFound = true;
						foundValue = a[firstA][i];
					}
				}
				if (dupFound)
					break;
			}

			if (!isFound) {
				System.out.println("Case #" + counter + ": "
						+ "Volunteer cheated!");
			} else if (dupFound) {
				System.out.println("Case #" + counter + ": " + "Bad magician!");
			} else {
				System.out.println("Case #" + counter + ": " + foundValue);
			}

			a = b = null;
		}
		out.close();
	}

}
