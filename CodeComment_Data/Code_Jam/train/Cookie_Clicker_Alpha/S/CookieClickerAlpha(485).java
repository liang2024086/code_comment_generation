package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1126;

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
		Scanner s = new Scanner(new File("/home/piyushk/codejam/B-small-attempt0.in"));
		PrintWriter pw = new PrintWriter("/home/piyushk/codejam/B-small-attempt0.out");
		int T = s.nextInt();
		for(int i = 0; i < T; i++) {
			double C = s.nextDouble();
			double F = s.nextDouble();
			double X = s.nextDouble();
			
			double currentRate = 2;
			double time = 0;
			while(true) {
				if( X / currentRate > C / currentRate + X / (currentRate + F)) {
					time += C / currentRate;
					currentRate += F;
				} else {
					time += X / currentRate;
					break;
				}
			}
			
			pw.println(String.format("Case #%s: %s", i + 1, time));
		}
		pw.close();
		s.close();
	}
}
