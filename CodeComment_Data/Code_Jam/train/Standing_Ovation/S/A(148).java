package methodEmbedding.Standing_Ovation.S.LYD560;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader buf = new BufferedReader(new FileReader("A-small-attempt0.in"));
		PrintWriter writer = new PrintWriter("A.out");
		int tCases = Integer.parseInt(buf.readLine().trim());
		for (int t = 1; t <= tCases; t++) {
			StringTokenizer str = new StringTokenizer(buf.readLine());
			int n = Integer.parseInt(str.nextToken()) + 1;
			char[] a = str.nextToken().toCharArray();
			int guests = 0;
			int friends = 0;
			for (int si = 0; si < n; si++) {
				int m = a[si] - '0';
				if (si > guests) {
					int diff = si - guests;
					friends += diff;
					guests += diff;
				}
				guests += m;
			}
			writer.printf("Case #%d: %d\n", t, friends);
		}
		writer.close();
	}
}
