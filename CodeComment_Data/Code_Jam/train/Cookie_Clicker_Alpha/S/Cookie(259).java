package methodEmbedding.Cookie_Clicker_Alpha.S.LYD195;

import static java.lang.StringBuffer.*; //Of Utmost Importance and Indisputable Gravity.
import static java.lang.Math.*;
import java.math.*;
import java.util.*;
import java.io.*;

public class Cookie {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(new File("B-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new FileWriter("cookie.out")); 
		
		
		int times = sc.nextInt();
		for(int time = 1;time <= times;time++)
		{
			out.print("Case #" + time + ": ");
			
			double C = sc.nextDouble();
			double F = sc.nextDouble();
			double X = sc.nextDouble();
			
			double cookieRate = 2;
			double sec = 0;
			
			while(X / cookieRate > (C / cookieRate) + (X / (cookieRate + F))) {
				sec += C / cookieRate;
				cookieRate += F;
			}
			sec += X / cookieRate;
			out.printf("%.7f\n",sec);
			
		}
		
		sc.close();
		out.close();
	}
}
