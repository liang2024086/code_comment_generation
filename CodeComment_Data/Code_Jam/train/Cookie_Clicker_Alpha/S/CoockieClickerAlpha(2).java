package methodEmbedding.Cookie_Clicker_Alpha.S.LYD535;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class CoockieClickerAlpha {

	public static void main(String[] args) {
		Scanner sc = null;
		PrintWriter fout = null;

		try {
			sc = new Scanner(new File(args[0]));
			fout = new PrintWriter(new BufferedWriter(new FileWriter("result.txt")));
		} catch(Exception e) {
			System.out.println(e);
		}

		final int T = sc.nextInt();
		for( int t = 1; t <= T; t++ ) {
			final double C = sc.nextDouble();
			final double F = sc.nextDouble();
			final double X = sc.nextDouble();
			
			double cpc = 2, sum = 0;
			double res = 0;
			
			while( true ){
//				num = ( num / cpc - C / cpc ) * ( cpc + F ) = num * ( cpc + F ) / cpc -  C * ( cpc + F ) / cpc;
//				0 = num * F / cpc - C * ( cpc + F ) / cpc;
				double nextCookies = C * ( cpc + F ) / F;
				
				if( nextCookies >= X ) {
					res += X / cpc;
					break;
				}
				res += C / cpc;
				cpc += F;
			}
			
//			System.out.println( "Case #" + t + ": " + res );
			fout.println( "Case #" + t + ": " + res );
		}
		
		fout.close();
		sc.close();
	}

}
