package methodEmbedding.Cookie_Clicker_Alpha.S.LYD236;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class CookieClickerAlpha {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(new File("cookie.in"));
		PrintWriter out = new PrintWriter(new FileWriter("cookie.out"));
		int n = scan.nextInt();
		for(int i = 1; i <= n; i++) {
			double c = scan.nextDouble();
			double f = scan.nextDouble();
			double x = scan.nextDouble();
			
			double t = 0;
			
			for(double r = 2; ; r += f) {
				//System.out.println("r: " + r + "\tt: " + t + "\tx/r: " + x/r + "\tx/(r+f): " + x/(r+f) + "\tc/r: " + c/r);
				if(x/r > x/(r+f) + c/r)
					t += c/r;
				else {
					t += x/r;
					break;
				}
			}
			
			out.println("Case #"+i+": "+t);
		}
		
		out.close();

	}

}
