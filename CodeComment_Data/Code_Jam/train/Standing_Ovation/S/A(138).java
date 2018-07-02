package methodEmbedding.Standing_Ovation.S.LYD922;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class A {
	static final Boolean SAMPLE = false;
	static final String PROBLEM = "A";
	static final String INPUT = "small";
	static final String ID = "1";
	static final String PATH = "/Users/wangkai/Documents/codejam-commandline-1.2-beta1/source/";

	public static void main(String[] args) throws Throwable {
		Scanner in = SAMPLE ? new Scanner(System.in) : new Scanner(new File(
				PATH + PROBLEM + "-" + INPUT + "-" + ID + ".in"));
		PrintStream out = SAMPLE ? System.out : new PrintStream(PATH + PROBLEM
				+ "-" + INPUT + "-" + ID + ".out");

		int test = in.nextInt();
		for (int t = 1; t <= test; t++) {
			out.print("Case #" + t + ": ");

			int shyMax = in.nextInt();
			String shys = in.next();
			int inviteNum = 0;
			int standNum = 0;
			for (int i = 0; i < shys.length(); i++) {
				int shy = shys.charAt(i) - '0';
				int add = 0;
				if (shy > 0) {
					add = Math.max(0, i - standNum);
					inviteNum += add;
				}
				standNum += add + shy;
			}
			out.println(inviteNum);
		}

		out.close();
		in.close();

		System.out.println("finish!");
	}
}
