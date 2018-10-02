package methodEmbedding.Magic_Trick.S.LYD1274;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class MagicTrick {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(new File("/home/piyushk/codejam/A-small-attempt0.in"));
		PrintWriter pw = new PrintWriter("/home/piyushk/codejam/A-small-attempt0.out");
		int T = s.nextInt();
		for(int i = 0; i < T; i++) {
			int a = s.nextInt();
			int[] fA = new int[4];
			int[] sA = new int[4];
			for(int j = 0; j < 4; j++) {
				for(int k = 0; k < 4; k++) {
					if(j == a - 1) {
						fA[k] = s.nextInt();
					} else {
						s.next();
					}
				}
			}
			
			a = s.nextInt();
			for(int j = 0; j < 4; j++) {
				for(int k = 0; k < 4; k++) {
					if(j == a - 1) {
						sA[k] = s.nextInt();
					} else {
						s.next();
					}
				}
			}

			String answer = "Volunteer cheated!";
			boolean foundOnce = false;
			for(int j = 0; j < 4; j++) {
				for(int k = 0; k < 4; k++) {
					if(fA[j] == sA[k]) {
						if(foundOnce) {
							answer = "Bad magician!";
						} else {
							foundOnce = true;
							answer = fA[j] + "";
						}
					}
				}
			}

			pw.println(String.format("Case #%s: %s", i + 1, answer));
		}
		pw.close();
		s.close();
	}

}
