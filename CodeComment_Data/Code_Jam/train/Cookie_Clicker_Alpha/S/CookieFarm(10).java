package methodEmbedding.Cookie_Clicker_Alpha.S.LYD918;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;


public class CookieFarm {
	public static void main (String args[]) throws FileNotFoundException, IOException{
		Scanner scanner = new Scanner(new File("B-small-attempt0.in"));
		PrintWriter pw = new PrintWriter(new File("B-small-attempt0.out"));
		DecimalFormat df = new DecimalFormat("0.0000000");
		int t = scanner.nextInt();
		for(int i = 1; i <= t; i++){
			double c = scanner.nextDouble();
			double f = scanner.nextDouble();
			double x = scanner.nextDouble();
			
			double time1 = 0, time2 = 0;
			time1 = x/2;
			time2 = c/2 + x/(2+f);
			int j = 1;
			while(time1 > time2){
				time1 = time2;
				time2 = 0;
				j++;
				for(int k = 0; k < j; k++){
					time2 += c/(2+k*f);
				}
				time2 += x/(2+j*f);
			}
			pw.println("Case #" + i + ": " + df.format(time1));
		}
		
		scanner.close();
		pw.close();
	}
}
