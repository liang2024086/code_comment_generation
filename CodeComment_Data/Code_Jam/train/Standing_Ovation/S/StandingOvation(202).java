package methodEmbedding.Standing_Ovation.S.LYD1440;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StandingOvation {
	static String PATH = "data/gcj2015/qual/", PROBLEM = "A", SIZE = "small",
			ATTEMPT = "0";

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		String filename = PATH + PROBLEM + "-" + SIZE;
		if (SIZE.equals("small"))
			filename += "-attempt" + ATTEMPT;
		Scanner sc = new Scanner(new File(filename + ".in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter(PATH + PROBLEM
				+ "-" + SIZE + "-attempt" + ATTEMPT + ".out"));
		int T = sc.nextInt();
		sc.nextLine();
		for (int t = 0; t < T; t++) {
			String line = sc.nextLine();
			String[] fields = line.split(" ");
			int sMax = new Integer(fields[0]);
			int prev = fields[1].charAt(0) - '0';
			int totalInvite = 0;
			for (int k = 1; k <= sMax; k++) {
				int n = fields[1].charAt(k) - '0';
				if (n == 0)
					continue;
				int invite = k - prev;
				if (invite < 0)
					invite = 0;
				totalInvite += invite;
				prev += n + invite;
			}
			bw.write("Case #" + (t + 1) + ": " + totalInvite);
			bw.newLine();
		}
		sc.close();
		bw.close();
	}
}
