package methodEmbedding.Cookie_Clicker_Alpha.S.LYD771;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class CookieClickerAlpha {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("B-small-attempt0.in"));
		PrintStream out = new PrintStream(new File("B-small-attempt0.out"));
		int testCases = input.nextInt();
		for (int i = 1; i <= testCases; ++i) {
			double cost, f, goal, rate = 2.0, result = 0.0;
			cost = input.nextDouble();
			f = input.nextDouble();
			goal = input.nextDouble();
			if (cost >= goal)
				result = goal / rate;
			else {
				while (cost / rate + goal / (rate + f) < goal / rate) {
					result += cost / rate;
					rate += f;
				}
				result += goal / rate;
			}
			out.print("Case #" + i + ": ");
			out.printf("%.7f\n", result);

		}
		// TODO Auto-generated method stub

	}

}
