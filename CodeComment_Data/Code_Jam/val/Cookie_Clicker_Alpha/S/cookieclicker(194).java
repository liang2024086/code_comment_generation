package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1138;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class cookieclicker {
	public static void main(String[] args) throws IOException {
		String filename = "src/cookieclicker/B-small-attempt1";
		Scanner in = new Scanner(new BufferedReader(new FileReader(new File(filename + ".in"))));
		in.useLocale(Locale.US);
		
		BufferedWriter out = new BufferedWriter(new FileWriter(new File(filename + ".out")));
//		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cases = in.nextInt();
		
		for (int t = 1; t <= cases; t++) {
			
			double c = in.nextDouble();
			double f = in.nextDouble();
			double x = in.nextDouble();
			
			boolean won = false;
			double time = 0;
			double rate = 2;
			while(!won) {
				
				// next event?
				double farmtime = c / rate;
				double wintime = x / rate;
				double wintimewithfarm = farmtime + (x / (rate + f));
				
				if (wintimewithfarm < wintime) {
					time += farmtime;
					rate += f;
				} else {
					won = true;
					time += wintime;
				}
			}
			
			out.write(String.format(Locale.US, "Case #%d: %.7f\n", t, time));
			
		}
		out.flush();
	}
}
