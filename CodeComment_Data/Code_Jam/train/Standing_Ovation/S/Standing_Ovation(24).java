package methodEmbedding.Standing_Ovation.S.LYD1073;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Standing_Ovation {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new FileReader(
				"A-small-attempt0.in"));
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new FileWriter("Output.txt"));
		// PrintWriter out = new PrintWriter(System.out);
		int tests = Integer.parseInt(br.readLine());
		for (int i = 1; i <= tests; i++) {
			String[] s = br.readLine().split(" ");
			String curr = s[1];
			int res = 0;
			int up = 0;
			for (int j = 0; j < curr.length(); j++) {
				int current = curr.charAt(j) - '0';
				if (j > up) {
					int diff = j - up;
					res += diff;
					up += diff;
				}
				up += current;
			}
			out.println("Case #" + i + ": " + res);
		}
		out.flush();
		out.close();

	}
}
