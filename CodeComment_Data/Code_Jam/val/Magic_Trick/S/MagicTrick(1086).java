package methodEmbedding.Magic_Trick.S.LYD1245;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Justin
 *
 */
public class MagicTrick {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		File f = new File("A-small-attempt0.in");
		Scanner s = new Scanner(f);
		int t = Integer.parseInt(s.nextLine());
		PrintWriter w = new PrintWriter("out.txt", "UTF-8");
		for (int i = 1; i <= t; i++) {
			int row = Integer.parseInt(s.nextLine());
			String nums = "";
			for (int j = 1; j <= 4; j++) {
				String current = s.nextLine();
				if (j == row)
					nums = current;
			}
			String[] ans = nums.split(" ");
			row = Integer.parseInt(s.nextLine());
			for (int j = 1; j <= 4; j++) {
				String current = s.nextLine();
				if (j == row)
					nums = current;
			}
			String[] secondAns = nums.split(" ");
			int answers = 0;
			int answer = 0;
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					if (ans[j].equals(secondAns[k])) {
						answers++;
						answer = Integer.parseInt(ans[j]);
					}
				}
			}
			w.print("Case #" + i + ": ");
			if (answers == 0) {
				w.println("Volunteer cheated!");
			} else if (answers == 1) {
				w.println(answer);
			} else {
				w.println("Bad magician!");
			}
		}
		w.close();
	}

}
