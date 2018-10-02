package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1172;

/**
 * 
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import general.IO;

/**
 * @author michael
 *
 */
public class Problem {

	/**
	 * Metodo main que corre el programa.
	 * @param args Argumentos con los que es llamado el programa.
	 * @throws Exception Si hubo excepcion.
	 */
	public static void main(String args[]) throws Exception {

		String file = "B-small-attempt0";

		Object[] pairIO = IO.openIO(file);
		BufferedReader red = (BufferedReader) pairIO[0];
		PrintWriter wr = (PrintWriter) pairIO[1];


		int problemas = Integer.parseInt(red.readLine());
		outer: for (int w = 0 ; w < problemas ; w++) {
			String par [] = red.readLine().split(" ");
			double C = Double.parseDouble(par[0]);
			double F = Double.parseDouble(par[1]);
			double X = Double.parseDouble(par[2]);
			double V0 = 2;
			
			double mint = X/V0;
			double parSum = 0;
			int i = 1;
			while (true) {
				double series = parSum + C/(V0 + (i-1)*F);
				double t = series + X/(V0 + i*F);
				if (t < mint) {
					mint = t;
					parSum = series;
					i++;
				}
				else {
					break;
				}
			}
			
			wr.println("Case #" + (w+1) + ": " + mint);
		}
	}
}
