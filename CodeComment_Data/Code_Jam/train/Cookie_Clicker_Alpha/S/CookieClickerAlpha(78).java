package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1010;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * @author Gregory M Chen
 */
public class CookieClickerAlpha {

	/**
	 * Main method.
	 * @param args
	 * @throws FileNotFoundException 
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		Scanner scanner = new Scanner(new File("B-small-attempt0.in"));
		PrintWriter pw = new PrintWriter("Output2.txt", "UTF-8");
		int T = scanner.nextInt();
		for(int i = 1; i <= T; i++) {
			double C = scanner.nextDouble();
			double F = scanner.nextDouble();
			double X = scanner.nextDouble();
			// find k
			int k = 0;
			double leftSide = -1;
			do {
				leftSide = X / (2 + (k+1) * F) + C / (2 + k * F) - X / (2 + k * F);
				if(leftSide < 0) {
					k++;
				}
			} while (leftSide < 0);
			double answer = 0;
			for(int j = 0; j < k; j++) {
				answer += C / (2 + j * F);
			}
			answer += X / (2 + k * F);
			pw.write("Case #" + i + ": " + answer + "\n");
		}
		pw.close();
	}

}
