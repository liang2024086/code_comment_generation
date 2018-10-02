package methodEmbedding.Standing_Ovation.S.LYD2025;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class StandingOvation {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("src/in.txt"));
		PrintWriter out = new PrintWriter("out.txt");

		int t = Integer.parseInt(in.readLine());
		for (int tc = 1; tc <= t; tc++) {
			String line = in.readLine();
			String[] split = line.split(" ");
			int n = Integer.parseInt(split[0]);
			String s = split[1];

			int min = 0;
			int total = 0;
			for (int i = 0; i <= n; i++) {
				int dif = 0;
				if ((s.charAt(i) - '0' > 0) && (total < i)) {
					min += i - total;
					dif = i - total;
				}

				total += s.charAt(i) - '0' + dif;
			}

			out.println("Case #" + tc + ": " + min);
		}

		in.close();
		out.close();
	}
}
