package methodEmbedding.Cookie_Clicker_Alpha.S.LYD79;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CookieClicker {
   public static void main(String args[]) {
	    Scanner sc = null;
		try {
			sc = new Scanner(new File("B-small-attempt0.in"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int testNum = sc.nextInt();
		for(int i = 0; i < testNum; i++) {
			double C = sc.nextDouble();
			double F = sc.nextDouble();
			double X = sc.nextDouble();
			double rate = 2.0;
			double min = X / rate;
			double origTime = 0;
			while(true) {
				origTime += C / rate;
				rate += F;
				double total = X/rate + origTime;
				if(total < min) {
					min = total;
				}
				else {
					break;
				}
			}
			
			System.out.println("Case #" + (i+1) + ": " + min);
			
		}
   }
}
