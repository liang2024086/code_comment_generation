package methodEmbedding.Cookie_Clicker_Alpha.S.LYD963;

/* Filename: Q2014B.java
 * Author: Mushiyo
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q2014B {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(new File("B-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new File("pB.out"));

		while (input.hasNext()) {
			int T= input.nextInt();
			
			for(int t = 1; t <= T; ++t){
				double C = input.nextDouble();
				double F = input.nextDouble();
				double X = input.nextDouble();
				double rate = 2;
				
				double timePassed = 0;
				
				while(true){
					if(C / rate + X / (rate + F) < X / rate){
						timePassed += C / rate;
						rate += F;
					}
					else{
						timePassed += X / rate;
						break;
					}
				}
			
				out.printf("Case #%d: %.7f\n", t, timePassed);
			}
		}
		
		out.close();
	}

}
