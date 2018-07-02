package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1004;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

import java.util.*;

class CookieClicker {
	private static final String PROB_NAME = "cookieclicker";

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader(PROB_NAME + ".in"));
		BufferedWriter out = new BufferedWriter(new FileWriter(PROB_NAME + ".out"));

		int numTestCases = Integer.parseInt(in.readLine());
		for (int caseNumber = 1; caseNumber <= numTestCases; caseNumber++) {
			out.write("Case #" + caseNumber + ": ");

			// SOLUTION HERE
			double c, f, x;
			String[] line = in.readLine().split(" ");
			c = Double.parseDouble(line[0]);
			f = Double.parseDouble(line[1]);
			x = Double.parseDouble(line[2]);

			double spentTime = 0;
			double targetTime = x / 2;
			int numFarms = 0;
			while (true) {
				if (targetTime < c / (2 + f * numFarms) + x / (2 + f * numFarms + f)) {
					break;
				}
				spentTime += c / (2 + f * numFarms);
				targetTime = x / (2 + f * numFarms + f);
				numFarms++;
			}

			out.write("" + (spentTime + targetTime));

			out.write('\n');
		}

		out.close();
	}
}
