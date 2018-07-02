package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1013;


import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class CookieClickerAlpha {

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(new File("B-small-attempt2.in"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("CookieOut.out"));
		
		int cases = input.nextInt();
		
		for (int i = 1; i <= cases; i++) {
			
			double C = input.nextDouble();
			double F = input.nextDouble();
			double X = input.nextDouble();
			double rate = 2.0;
			
			double time = 0;
			double wait;
			double buy;
			
			while (true) {
				
				wait = time + X/rate;
				buy = time + C/rate + X/(rate+F);
				if (wait <= buy) {
					time = wait;
					break;
				} else {
					time += C/rate;
					rate += F;
				}
			}
			
			DecimalFormat df = new DecimalFormat("#.0000000");
			String output = "Case #"+i+": "+df.format(time);
			System.out.println(output);
			writer.write(output);
			writer.newLine();
		}
		input.close();
		writer.close();
	}
	
}
