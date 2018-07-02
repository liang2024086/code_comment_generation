package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1264;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class CookieClicker {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(new File("input/cookie_small.in"));
		PrintWriter output = new PrintWriter(new File("output/cookie_small.out"));
		int T = input.nextInt();
		for (int oncase=1; oncase<=T; oncase++) {
			output.printf("Case #%d: ", oncase);
			double C = input.nextDouble();
			double F = input.nextDouble();
			double X = input.nextDouble();
			
			double time = 0;
			double cps = 2;
			double best = Double.MAX_VALUE;
			while (true) {
				double timeToFarm = time + C/cps;
				double timeToWin = time + X/cps;
				if (timeToWin > best) {
					output.printf("%.7f%n", best);
					break;
				} else {
					best = timeToWin;
					time = timeToFarm;
					cps += F;
				}
			}
		}
		output.close();
	}
}
