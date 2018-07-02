package methodEmbedding.Cookie_Clicker_Alpha.S.LYD850;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.StringTokenizer;

public class CookieClickerAlpha {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("cookieclickeralpha.in"));
		int cases = Integer.parseInt(in.readLine());
		Writer out = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream("cookieclickeralpha.out"), "UTF-8"));
		
		
		for (int i = 1; i <= cases; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			double c = Double.parseDouble(st.nextToken());
			double f = Double.parseDouble(st.nextToken());
			double x = Double.parseDouble(st.nextToken());

			double totalTime = x / 2;
			int numFarms = 1;
			for (int j = 1; j <= x / c; j++) {
				double tempTime = 0;
				
				double rate = 2;

				for (int k = numFarms; k > 0; k--) {
					tempTime += (c / rate);
					rate += f;
				}
				tempTime += x / rate;
				if (tempTime < totalTime) {
					totalTime = tempTime;
				}
				numFarms ++;
			}
			out.write(String.format("Case #" + i + ": %.7f%n",totalTime));
		}
		
		out.close();
	}
}
