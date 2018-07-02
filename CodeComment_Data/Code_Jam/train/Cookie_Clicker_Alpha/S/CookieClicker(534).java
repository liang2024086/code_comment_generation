package methodEmbedding.Cookie_Clicker_Alpha.S.LYD38;

import java.io.File;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class CookieClicker {

	public static void main(String[] args) throws Exception {
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner in = new Scanner(new File("problem.in"));
		PrintStream out = new PrintStream(new File("problem.out"));
		
		int T = in.nextInt();
		for (int test = 1; test <= T; test++) {
			double c = in.nextDouble();
			double f = in.nextDouble();
			double x = in.nextDouble();
			
			double time = 0.0, s = 2.0;
			double min = x / s;
			
			while (true) {
				time += (c / s);
				s += f;
				double time1 = time + (x / s);
				if (time1 < min) {
					min = time1; 
				} else {
					break;
				}
			}
			
			out.println("Case #" + test + ": " + min);
		}
	}
}
