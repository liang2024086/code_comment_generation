package methodEmbedding.Cookie_Clicker_Alpha.S.LYD932;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

	public static void main(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintStream out = new PrintStream(new File("f.out"));
		double c, f, x, res;
		int t, T;
		for (t = 1, T = sc.nextInt(); t <= T; t++) {
			c = sc.nextDouble();
			f = sc.nextDouble();
			x = sc.nextDouble();
			res = x;
			double r = 2;

			double farmConstructionCost = 0;
			while (true) {
				double newres = x / r + farmConstructionCost;
				if (newres <= res) {
					res = newres;
					farmConstructionCost += c / r;
					r = r + f;
				} else {
					break;
				}
			}
			out.println(String.format("Case #%d: %.7f", t, res));
		}
	}

}
