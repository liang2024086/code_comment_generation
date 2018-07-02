package methodEmbedding.Standing_Ovation.S.LYD1115;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;

public class StandingOvation {

	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
		PrintStream ps = new PrintStream(new FileOutputStream("asd1.out"));
		int testcases = Integer.parseInt(br.readLine());
		for (int testcase = 0; testcase < testcases; testcase++) {
			String[] in = br.readLine().split(" ");
			int smax = Integer.parseInt(in[0]);

			int[] people = new int[smax + 1];
			for (int k = 0; k <= smax; k++) {
				people[k] = Integer.parseInt(in[1].charAt(k) + "");
			}
			int added = 0;
			int standing = people[0];

			for (int k = 1; k <= smax; k++) {
				if (people[k] != 0) {
					int amt = people[k];
					if (standing < k) {
						int diff = k - standing;
						added += diff;
						standing += diff;
					}
					standing += amt;
				}
			}
			ps.println("Case #" + (testcase + 1) + ": " + added);
		}

	}

}
