package methodEmbedding.Cookie_Clicker_Alpha.S.LYD72;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CookieClickerAlpha {
	public static void main(String[] args) {
		Scanner s = null;
		try {
			s = new Scanner(new FileInputStream(
					"Qualification2014/B-small-attempt0.in"));
		} catch (FileNotFoundException e) {
		}

		PrintWriter p = null;
		try {
			p = new PrintWriter(new File("Qualification2014/B-small.out"));
		} catch (IOException e) {
		}

		int t = s.nextInt();

		for (int a = 0; a < t; a++) {
			double c = s.nextDouble(); // first farm price
			double f = s.nextDouble(); // increase in cookies per second from
										// farm
			double x = s.nextDouble(); // goal cookies

			double time = 0.0;
			double cps = 2.0; // cookies per second
			double bestTime = x / cps;

			while (time < bestTime) {
				time += c / cps;
				cps += f;
				bestTime = Math.min(bestTime, time + x / cps);
			}

			DecimalFormat df = new DecimalFormat("#.#######");
			p.println("Case #" + (a + 1) + ": " + df.format(bestTime));
		}

		p.close();
		s.close();
	}
}
