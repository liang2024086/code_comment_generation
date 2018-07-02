package methodEmbedding.Cookie_Clicker_Alpha.S.LYD234;

import java.util.*;
import java.text.*;

public class Lulz {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		DecimalFormat format = new DecimalFormat("0.0000000");
		for(int t = 1; t <= T; t++) {
			double C = in.nextDouble();
			double F = in.nextDouble();
			double X = in.nextDouble();
			double best = Double.MAX_VALUE;
			double timeElapsed = 0.0;
			double rate = 2.0;
			for(int i = 0; i < 1000000; i++) {
				double wait = X / rate + timeElapsed;
				best = Math.min(wait, best);
				timeElapsed += C / rate;
				rate += F;
			}
			System.out.println("Case #" + t + ": " + format.format(best));
		}
	}
}
