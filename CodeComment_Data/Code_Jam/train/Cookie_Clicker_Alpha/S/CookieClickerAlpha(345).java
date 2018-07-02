package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1565;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class CookieClickerAlpha {

	public static void main(String[] args) {
		String filename = CookieClickerAlpha.class.getName();
		try (Scanner in = new Scanner(new FileReader(filename + "-small.in"));
				FileWriter output = new FileWriter(filename + "-small.out");){			

			int T = in.nextInt();
			for(int i = 1; i <= T; i++) {
				double c = in.nextDouble();		// farm cost
				double f = in.nextDouble();		// extra cookies per farm
				double x = in.nextDouble();		// goal
				if (i != T) in.nextLine();
				
				double result = 0;
				if (x <= c) result = x / 2;
				else {
					/*
					 * goal = x
					 * rate = 2
					 * goal -= cost // we have nothing to do but produce till we reach farm cost
					 * time += cost / rate		// since we are producing till we reach value of cost
					 * compare goal(remaining goal) / current rate with goal+cost / rate + f
					 * whichever is less approve it
					 * if current rate then time += goal /rate
					 * else goal = goal+cost(have to reproduce this amount again) and rate += f
					 * loop again tell
					 */
					double goal = x;
					double rate = 2.0;
					
					while (goal > c) {
						goal -= c;
						result += c / rate;
						if (goal / rate <= x / (rate + f)) {
							//result -= c / rate;
							result += goal / rate;
							break;
						} else {
							goal += c;
							rate += f;
						}
					}
				}

				String o = String.format("Case #%d: %.7f\n", i, result);
				System.out.print(o);
				output.write(o);
			}
			
			System.out.println("Done");

		} catch(IOException e) {
			e.printStackTrace();
		} 

	}

}
