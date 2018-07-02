package methodEmbedding.Standing_Ovation.S.LYD1951;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter("output.txt");
		BufferedReader bf = new BufferedReader(new FileReader(
				"A-small-attempt0.in"));
		int t = Integer.parseInt(bf.readLine());
		int c = 1;
		while (t-- > 0) {
			String l[] = bf.readLine().split(" ");
			int Smax = Integer.parseInt(l[0]);
			char[] nums = l[1].toCharArray();
			int aud = 0;
			int res = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] > '0') {
					if (aud < i) {
						res += (i - aud);
						aud += (i - aud);
					}
					aud += (nums[i] - '0');
				}
			}
			out.println("Case #" + c++ + ": " + res);
		}
		out.close();
		bf.close();
	}
}
