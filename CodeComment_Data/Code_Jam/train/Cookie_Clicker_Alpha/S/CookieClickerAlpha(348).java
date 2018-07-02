package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1143;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class CookieClickerAlpha {

	public static void main(String args[]) throws FileNotFoundException{
		Scanner in = new Scanner(new File("input.in"));
		PrintWriter write = new PrintWriter(new File("output.out")); 
		int t = in.nextInt();
		double c,f,x,boundaryf,currentRate,time;
		for(int i = 1; i <= t; i++){
			c = in.nextDouble();
			f = in.nextDouble();
			x = in.nextDouble();
			boundaryf = ((x-c)*f)/c;
			currentRate = 2.0;
			time = 0.0;
			while(currentRate < boundaryf){
				time += (c/currentRate);
				currentRate += f;
			}
			time += x/currentRate;
			write.printf("Case #%d: %.7f\n",i,time);
			
		}
		in.close();
		write.close();
	}
}
