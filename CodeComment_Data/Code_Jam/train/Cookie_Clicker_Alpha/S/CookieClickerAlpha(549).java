package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1624;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CookieClickerAlpha {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("input.txt");
		File output = new File("output.txt");
		Scanner scanner = new Scanner(file);
		PrintWriter printer = new PrintWriter(output);
		int T = scanner.nextInt();
		double C, F, X;
		double time = 0.0, rate;

		for (int t = 0; t < T; t++) {
			C = scanner.nextDouble();
			F = scanner.nextDouble();
			X = scanner.nextDouble();
			time = 0.0;
			rate = 2.0;

			while (true) {
				if ((X / rate) > (C / rate + X / (rate + F))) {
					time += (C / rate);
					rate += F;
				} else {
					time += (X / rate);
					break;
				}
			}

			printer.write("Case #" + (t + 1) + ": " + String.format("%.7f%n", time));
		}
		printer.flush();
	}

}
