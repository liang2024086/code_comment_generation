package methodEmbedding.Standing_Ovation.S.LYD1452;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("in.txt"));
		PrintWriter out = new PrintWriter("out.txt");
		int t = sc.nextInt();
		for (int CaseNum = 1; CaseNum <= t; CaseNum++) {
			int sMax = sc.nextInt();
			String s = sc.next();
			int[] shy = new int[sMax + 1];
			for (int i = 0; i < s.length(); i++)
				shy[i] = Integer.parseInt(s.charAt(i) + "");

			int curStanding = shy[0];
			int needed = 0;
			for (int i = 1; i < sMax + 1; i++) {
				if (shy[i] > 0) {
					if (curStanding < i)
						needed += i - curStanding;
					curStanding += shy[i] + needed;
				}
			}

			out.printf("Case #%d: %d\n", CaseNum, needed);
		}
		out.flush();
	}
}
