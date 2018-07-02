package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1342;

import static java.lang.System.*;import static java.lang.Math.*;import static java.lang.Character.*;import java.io.*;import java.text.*;import java.util.*;import java.util.regex.*;import java.math.*;
public class mostwanted {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("mostwanted.dat"));
		int dS = Integer.parseInt(sc.nextLine());
		for (int xxy = 0; xxy < dS; xxy++) {
			final double c = sc.nextDouble();
			final double f = sc.nextDouble();
			final double x = sc.nextDouble();

			double rate = 2.;
			double current_time = 0.;

			while(true) {
				final double rate_2 = rate + f;
				final double current_time_2 = c/rate+current_time;
				final double calc = rate*rate_2*(current_time_2-current_time)/(rate_2-rate);
				if(calc >= x) {
					System.out.printf("Case #%d: %.7f\n", xxy+1, x/rate+current_time);
					break;
				} else {
					rate = rate_2;
					current_time = current_time_2;
				}
			}
 
		}
		
	}
}
