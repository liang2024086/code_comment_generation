package methodEmbedding.Standing_Ovation.S.LYD663;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner in = new Scanner(new File("input.txt"));
		PrintWriter writer = new PrintWriter("output.txt");
		int nTestCases = in.nextInt();
		int n;
		String shyness;
		for (int t = 1; t <= nTestCases; t++) {
			n = in.nextInt();
			shyness = in.next();
			int totall = 0;
			int addVal = 0;
			for (int i = 0; i < n + 1; i++) {
				int shyVal = (shyness.charAt(i) - '0');

				if (shyVal == 0)
					continue;

				if (totall < i) {
					int add = (i - totall);
					totall += add;
					addVal += add;
				}
				totall += shyVal;
			}
			writer.println("Case #" + t + ": " + addVal);
		}
		in.close();
		writer.close();

	}
}
