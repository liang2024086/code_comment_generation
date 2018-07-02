package methodEmbedding.Cookie_Clicker_Alpha.S.LYD160;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Eden
 * 
 */
public class CookieClicker {
	@SuppressWarnings("nls")
	public static void main(String[] args) throws IOException {
		String inFile, outFile;
		inFile = String
				.format("C:\\Users\\Eden\\Downloads\\B-small-practice.in");
		outFile = "C:\\Users\\Eden\\Downloads\\B-small.out";
		Scanner in = new Scanner(new File(inFile));
		PrintWriter out = new PrintWriter(new FileWriter(outFile));
		int T = in.nextInt();
		double farmPrice, f, target;
		for (int t = 1; t <= T; t++) {
			out.print("Case #" + t + ": ");
			farmPrice = in.nextDouble();
			f = in.nextDouble();
			target = in.nextDouble();
			double min = target / 2.0;
			int i = 1;
			while (true) {
				double temp = target / (2.0 + i * f);
				for (int j = 0; j < i; j++) {
					temp += farmPrice / (j * f + 2);
				}
				if (temp > min) {
					break;
				}
				min = temp;
				i++;
			}
			out.println(min);
		}
		out.close();
	}

}
