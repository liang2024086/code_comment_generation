package methodEmbedding.Magic_Trick.S.LYD1822;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CodeJam {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("A-small-attempt1.out");
			File file = new File("A-small-attempt1.in");
			Scanner in = new Scanner(file);
			int T = in.nextInt();
			int[] c1 = new int[4];
			int[] c2 = new int[4];
			int row;
			int ans = 0;
			for (int caze = 1; caze <= T; caze++) {
				row = in.nextInt();
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						int l = in.nextInt();
						if (i == row - 1) {
							c1[j] = l;
						}
					}
				}
				row = in.nextInt();
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						int l = in.nextInt();
						if (i == row - 1) {
							c2[j] = l;
						}
					}
				}
				int i = 0;
				ans = 0;
				if (c1.length > 0 && c2.length > 0) {
					for (int l1 : c1) {
						if (i > 1) {
							break;
						}
						for (int l2 : c2) {
							if (l1 == l2) {
								ans = l1;
								i++;
							}
						}
					}
				}
				String res = "";
				if (i > 1) {
					res = "Case #" + caze + ": Bad magician!";
				} else if (ans == 0) {
					res = "Case #" + caze + ": Volunteer cheated!";
				} else {
					res = "Case #" + caze + ": " + ans;
				}
				writer.println(res);
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} finally {
			if (writer != null) {
				writer.close();
			}
		}
	}
}
