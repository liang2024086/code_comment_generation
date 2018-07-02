package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1398;

import java.util.*;
import java.io.*;

public class CookieClickerAlpha {
	final static String fileName = "B-small-attempt0";
	public static void main(String args[]) throws FileNotFoundException {
		Scanner in = new Scanner(new File(fileName + ".in"));
		PrintWriter out = new PrintWriter(new File((fileName + ".out")));

		int T = in.nextInt();
		for(int loopvar = 1; loopvar <= T; loopvar++) {
			double C = in.nextDouble(), F = in.nextDouble(), X = in.nextDouble();
			//time, minimum time, cookie rate
			double t = 0, minT = Integer.MAX_VALUE, dc = 2;
			while(t + X / dc <= minT) {
				minT = t + X / dc;
				t += C / dc;
				dc += F;
			}
			out.printf("Case #%d: %.7f%n", loopvar, minT);
		}

		out.close();
	}
}
