package methodEmbedding.Cookie_Clicker_Alpha.S.LYD411;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CookieClicker {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("b.in"));
		
		int times = sc.nextInt();
		for(int cu = 0; cu < times; cu++) {
			double C = sc.nextDouble(), 
				F = sc.nextDouble(), 
				X = sc.nextDouble();
			
			double rate = 2;
			double cookies = 0;
			double time = 0;
			
			if(X <= C) {
				time = X/2.0;
			} else {
				while(cookies < X) {
					double remainder = X - cookies;
					if(cookies >= C) {
						if(C / F < remainder / rate) {
							rate += F;
							cookies -= C;
						}
					}
					
					if(cookies < C) {
						time += (C - cookies) / rate;
						cookies += (C - cookies);
					} else {
						time += (X - cookies) / rate;
						cookies = X;
					}
				}
			}
			
			System.out.println("Case #" + (cu+1) + ": " + time);
		}
	}

}
