package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1616;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;


public class CookieClickerAlpha {
	CookieClickerAlpha() throws Exception{
		Scanner in = new Scanner(new File("cookieClickerAlpha.in"));
		PrintWriter out = new PrintWriter(new File("cookieClickerAlpha.out"));
		
		int tests = in.nextInt();
		for(int t = 1; t<=tests; t++){
			double farmCost = in.nextDouble();
			double farmBonus =  in.nextDouble();
			double target = in.nextDouble();
			
			double time = 0;
			double cps = 2;
			double res = target/cps;
			for(int i = 0; i<34234; i++){
				time += farmCost/cps;
				cps += farmBonus;
				res = Math.min(res, time+target/cps);
			}
			out.printf("Case #%d: %.7f\n", t, res);
		}
		
		in.close();
		out.close();
	}
	public static void main(String[] args) throws Exception{
		new CookieClickerAlpha();
	}
}
