package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1378;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;


public class CookieClickerAlpha {

	public static void main(String[] args) throws IOException {
		PrintWriter out;
		Scanner scanner;
		out = new PrintWriter(new FileWriter("out.txt"));
		scanner = new Scanner(new BufferedReader(new FileReader("in.txt")));
//		out = new PrintWriter(System.out);
//		scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		double C, F, X;
		for (int i = 1; i <= T; i++) {
			C = Double.parseDouble(scanner.next());
			F = Double.parseDouble(scanner.next());
			X = Double.parseDouble(scanner.next());
			
			int todo = Integer.MAX_VALUE;
			double seconds = Double.MAX_VALUE;
			for (int m = 0; m < todo; m++) {
				double dividend = X+(m*C);
				for (int j = 0; j < m; j++) {
					dividend += F*C*(m-j)/(2+(j*F));
				}
				double divisor = 2+(m*F);
				double tmpSeconds = dividend/divisor;
				if (tmpSeconds < seconds)
					seconds = tmpSeconds;
				else
					break;
			}

			DecimalFormat df = new DecimalFormat( "0.0000000" );
			out.println("Case #"+i+": "+df.format(seconds).replace(',', '.'));
		}
		
		out.close();
		scanner.close();
	}

}
