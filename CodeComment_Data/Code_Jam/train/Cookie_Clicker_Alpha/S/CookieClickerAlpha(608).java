package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1180;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.StringTokenizer;

public class CookieClickerAlpha {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());
		PrintWriter pw = new PrintWriter(new FileOutputStream("C:\\Users\\Evgenija\\Desktop\\out.txt"));
		
		double c, f, x;
		for (int i = 1; i <= cases; i++) {
		
			String s = in.readLine();
			StringTokenizer st = new StringTokenizer(s);
			c = Double.parseDouble(st.nextToken());
			f = Double.parseDouble(st.nextToken());
			x = Double.parseDouble(st.nextToken());
			double minresd, zard, minf, minresn, minres;
			minresd = x / 2;
			zard = 2;
			minres = 0.0;

			while (true) {
				minf = c / zard;
				minresn = minres + minf + (x / (zard + f));
				if (minresd < minresn
						&& Math.abs(minresd - minresn) > 0.0000000001) {
					System.out.println(String.format(Locale.US,
							"Case #%d: %.7f", i, minresd));
					pw.print(String.format(Locale.US,
							"Case #%d: %.7f", i, minresd) + "\n");
					pw.flush();
					break;
				} else {
					minresd = minresn;
					zard += f;
					minres += minf;

				}
			}
			
		}
		pw.close();
	}
}
