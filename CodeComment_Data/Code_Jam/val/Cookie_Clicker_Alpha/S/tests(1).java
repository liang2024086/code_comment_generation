package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1495;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class tests {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		in.useLocale(Locale.US);
		int k = in.nextInt();
		double C=0, F=0, X=0;
		for (int i=0; i<k; i++)
		{
			if (in.hasNextDouble()) C = in.nextDouble();
			if (in.hasNextDouble()) F = in.nextDouble();
			if (in.hasNextDouble()) X = in.nextDouble();
			boolean ok = false;
			double t=0, p=2;
			for (int j=0; j<100000 && !ok; j++)	{
				if (t+C/p + X/(p+F) < t + X/p) {
					t+=C/p;
					p+=F;
				}
				else {
					t+=X/p;
					ok = true;
				}
			}
			System.out.print("Case #" + (i+1) + ": ");
			System.out.println(String.format("%8.7f", t).replace(',', '.'));


		}
	}

}
