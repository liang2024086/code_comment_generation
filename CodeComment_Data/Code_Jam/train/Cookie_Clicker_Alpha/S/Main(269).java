package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1140;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.StringTokenizer;

public class Main {

	static double res = 0;

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		PrintWriter out = new PrintWriter(new FileOutputStream(
				"C:\\Users\\Kristijan\\Desktop\\out.txt"));
		StringTokenizer st;
		int t = Integer.parseInt(in.readLine());

		DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.US);

		DecimalFormat format = new DecimalFormat("0.0000000",dfs);
		for (int i = 1; i <= t; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append("Case #" + i + ": ");
			st = new StringTokenizer(in.readLine());

			double c, f, x;
			c = Double.parseDouble(st.nextToken());
			f = Double.parseDouble(st.nextToken());
			x = Double.parseDouble(st.nextToken());

			double cookie = 2;
			res = x / cookie;

			double tmpRes = 0;
			boolean b = true;
			while (b) {
				b = false;
				tmpRes += c / cookie;

				cookie += f;

				if (tmpRes + (x / cookie) < res && Math.abs(tmpRes - res) > 0.00000001) {
					res = tmpRes + (x / cookie);
					b = true;
				}
			}
			sb.append(format.format(res));
			res = Double.MAX_VALUE;
			System.out.println(sb.toString());
			out.print(sb.toString()+"\n");
		}
		out.close();
	}
}
