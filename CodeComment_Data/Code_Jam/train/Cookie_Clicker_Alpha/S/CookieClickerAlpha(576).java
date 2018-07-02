package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1050;


import java.io.*;
import java.util.*;

public class CookieClickerAlpha {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("B-small.in"));
		System.setOut(new PrintStream("B-small.out"));
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		for (int t = 1; t <= T; ++t) {
			
			double C = in.nextDouble();
			double F = in.nextDouble();
			double X = in.nextDouble();
			
			double ans = 0.0;
			double rate = 2.0;
			while (true) {
				double timeToFinish = X / rate;
				double timeBuying = C / rate + X / (rate + F);
				
				if (Double.compare(timeToFinish, timeBuying) <= 0) {
					ans += timeToFinish;
					break;
				} else {
					ans += C / rate;
					rate += F;
				}
			}
			
			System.out.printf(Locale.ENGLISH, "Case #%d: %.7f\n", t, ans);
		}
		
		in.close();
		System.exit(0);
	}
}
