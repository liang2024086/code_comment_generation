package methodEmbedding.Cookie_Clicker_Alpha.S.LYD904;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;

public class CJ14QRBSL {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		PrintWriter pw = new PrintWriter("output.txt");
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			String tokens[] = br.readLine().split(" ");
			double c = Double.parseDouble(tokens[0]);
			double f = Double.parseDouble(tokens[1]);
			double x = Double.parseDouble(tokens[2]);
			double ans = 0;
			int j = 0;
			while (true) {
				double a = x / (2 + j * f);
				double b = c / (2 + j * f) + x / (2 + (j + 1) * f);
				if (a < b) {
					ans += a;
					break;
				} else {
					ans += c / (2 + j * f);
				}
				j++;
			}
			pw.printf("Case #%d: %.7f\n", i, ans);
		}
		pw.close();
	}

}
