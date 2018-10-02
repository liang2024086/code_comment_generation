package methodEmbedding.Cookie_Clicker_Alpha.S.LYD495;

import java.lang.*;
import java.io.*;
import java.util.*;


public class Prob2A {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner sc;
		PrintStream ps = new PrintStream (new File ("test.out"));
		
		try {
			sc = new Scanner (new File("test.in"));
			
			int t = sc.nextInt();
			
			for (int qq = 1; qq <= t; qq++) {
				double c = sc.nextDouble();
				double f = sc.nextDouble();
				double x = sc.nextDouble();
				
				double rate = 2;
				double n = 0;
				double sec = 0;
				
				while (n < x) {
					
					{
						double choice1 = (x-n)/(rate + f) + c/rate;
						double choice2 = (x-n)/rate;
						
						//System.out.println("choice1: " + choice1 +  " choice2: " + choice2);
						
						if (choice1 < choice2) {
							sec += c/rate;
							rate += f;
							if (n > 0) {
								n -= c;
							}
							
						} else {
							sec += choice2;
							n += x - n;
						}
						
						//System.out.println(" " + sec + " " + n);
					}
				}
				
				
				ps.printf("Case #%d: %.7f\n",qq, sec);
				ps.flush();

			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ps.close();
	}
}
