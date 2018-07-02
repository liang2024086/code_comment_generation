package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1436;

import java.util.*;
import java.io.*;

public class CookieClicker {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("B-small-attempt0.in"));
		//Scanner scan = new Scanner(System.in);
		int T = Integer.parseInt(scan.next());
		for(int k = 1; k <= T; k++) {
			double C, F, X;
			C = Double.parseDouble(scan.next());
			F = Double.parseDouble(scan.next());
			X = Double.parseDouble(scan.next());
			
			double rate = 2;
			double Y = 0;
			while(true) {
				if(C*(rate + F) - X*F < 0) {
					Y += C/rate;
					rate += F;
				}
				else{
					Y += X/rate;
					break;
				}	
			}
			System.out.format("%s%d%s%.7f%n", "Case #", k, ": ", Y);
		}
	}
}
