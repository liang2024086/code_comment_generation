package methodEmbedding.Cookie_Clicker_Alpha.S.LYD136;

import java.io.*;
import java.util.*;
public class CookieClickerAlpha {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("B-small-attempt0.in"));
		PrintStream output = new PrintStream(new File("output.txt"));
		int numberOfCases = input.nextInt();
		for (int i = 1; i <= numberOfCases; i++) {
			output.print("Case #" + i + ": ");
			double cookiesPerSecond = 2.0;
			double c = input.nextDouble();
			double f = input.nextDouble();
			double x = input.nextDouble();
			double time = 0.0;
			boolean done = false;
			while (!done) {
				double num = (x / cookiesPerSecond);
				double numOne = (c / cookiesPerSecond);
				if (num <= numOne + x / (cookiesPerSecond + f)) {
					time += num;
					done = true;
				} else {
					time += numOne;
					cookiesPerSecond += f;
				}
			}
			output.println(time);
		}
		input.close();
		output.close();
	}
}
