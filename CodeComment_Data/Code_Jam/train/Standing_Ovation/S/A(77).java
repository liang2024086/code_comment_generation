package methodEmbedding.Standing_Ovation.S.LYD1419;

import java.util.Scanner;


public class A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numTests = in.nextInt();
		for (int test = 1; test <= numTests; ++test) {
			// read input
			int max = in.nextInt();
			char[] s = in.next().toCharArray();
			int[] cnts = new int[s.length];
			for (int i = 0; i < s.length; ++i)
				cnts[i] = s[i] - '0';
			// solve
			int ans = 0;
			while (ans <= max) {
				boolean done = true;
				int standing = ans;
				for (int i = 0; i <= max; ++i) {
					if (standing < i) {
						done = false;
						break;
					}
					standing += cnts[i];
				}
				if (done)
					break;
				++ans;
			}
			System.out.println("Case #" + test + ": " + ans);
		}
	}

}
