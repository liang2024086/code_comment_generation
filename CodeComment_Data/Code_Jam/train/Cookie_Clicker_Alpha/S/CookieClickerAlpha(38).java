package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1441;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class CookieClickerAlpha {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("B-small-attempt0.in");
		BufferedReader reader = new BufferedReader(fr);

		FileWriter fw = new FileWriter("output.txt");
		PrintWriter pw = new PrintWriter(fw);

		int tcase = Integer.parseInt(reader.readLine());
		String[] str;
		double[] input = new double[3];

		double c, f, x, r, temp;

		for (int i = 0; i < tcase; i++) {

			str = reader.readLine().split(" ");

			c = Double.parseDouble(str[0]);
			f = Double.parseDouble(str[1]);
			x = Double.parseDouble(str[2]);

			// System.out.println(c+"---"+f+"----"+x);

			int pos;
			pos = i + 1;

			if (x <= c) {
				double xx;
				xx = x - 1;
				DecimalFormat format_2Places = new DecimalFormat("0.0000000");

				double TotalPrice = Double.valueOf(format_2Places.format(xx));
				
				String s = String.format("%.7f", TotalPrice);
				System.out.println("Case #" + pos + ": " + s);
				pw.println("Case #" + pos + ": " + s);
				continue;
			}

			double prev = x, current = x - 1;
			temp = 0;
			r = 2;
			while (prev > current) {

				prev = current;
				current = temp + (x / r);
				// System.out.println(current);
				temp = temp + (c / r);
				r = r + f;
			}
			
			
			DecimalFormat format_2Places = new DecimalFormat("0.0000000");

			double TotalPrice2 = Double.valueOf(format_2Places.format(prev));
			
			String s = String.format("%.7f", TotalPrice2);

			System.out.println("Case #" + pos + ": " + s);
			pw.println("Case #" + pos + ": " + s);

		}

		reader.close();
		fr.close();
		pw.close();
		fw.close();
	}

}
