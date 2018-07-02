package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1165;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exo2 {
	public static void main(String[] args) {
		Scanner scan;
		try {
			scan = new Scanner(new File("B-small-attempt0.in"));
			int tests = scan.nextInt();
			
			for (int i = 0; i < tests; i++) {
				double c = scan.nextDouble();
				double f = scan.nextDouble();
				double x = scan.nextDouble();
				
				double sum = 0;
				double gain = 2;
				double time =0;
				
				while(sum != x) {
					double seconds = c/gain;
					if( seconds + x/(gain + f) >=  x/gain){
						time += x/gain;
						break;
					} else {
						sum = 0;
						gain += f;
						time += seconds;
					}
				}
				
				System.out.println("Case #" + (i+1) + ": " + time);
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}
