package methodEmbedding.Cookie_Clicker_Alpha.S.LYD485;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Cookie {

	public static void main(String[] args)  throws FileNotFoundException {
		
		Scanner scanner = new Scanner(new File("B-small-attempt0.in"));
		PrintWriter writer = new PrintWriter("Cookie.out");
		
		int cases = scanner.nextInt();
		int count = 1;
		
		while (cases --> 0) {
			double c = scanner.nextDouble();
			double f = scanner.nextDouble();
			double x = scanner.nextDouble();
			
			double rate = 2;
			double time = 0;
			
			while ( (x/(rate+f)) + (c/rate) < (x/rate)) {
				time += (c/rate);
				rate += f;
			}
			time += (x/rate);
			
			writer.printf("Case #" + count++ + ": %.7f\n", time);
			
		}
		
		writer.close();
	}
	
}
