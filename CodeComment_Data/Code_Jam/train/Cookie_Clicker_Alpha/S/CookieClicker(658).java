package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1620;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class CookieClicker {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		
		Scanner scan = new Scanner(new File("B-small-attempt0.in"));
		int rounds = scan.nextInt();
		
		for (int round = 0; round < rounds; round++) {
			
			double c = scan.nextDouble();
			double f = scan.nextDouble();
			double x = scan.nextDouble();
			double rate = 2;
			
			double time = 0;
			double curr;
			double prev = Double.MAX_VALUE;

			while (true) {
				curr = time + (x / rate);
				time += (c / rate);
				rate += f;
				
				if (prev < curr)
					break;
				prev = curr;
			}
			
			System.out.println("Case #" + (round + 1) + ": " + prev);
		}

	}
 
}
