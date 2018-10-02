package methodEmbedding.Cookie_Clicker_Alpha.S.LYD627;

import java.io.*;
import java.util.*;

public class cookieclickeralpha {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st;
		
		for (int t = Integer.parseInt(br.readLine()), k = 1; t-- > 0; k++) {
			st = new StringTokenizer(br.readLine());
			double c = Double.parseDouble(st.nextToken()), f = Double.parseDouble(st.nextToken()), x = Double.parseDouble(st.nextToken()), minTime = x / 2.0, toGetC = c / 2.0, rate = 2.0 + f;
			while (true) {
				double temp = toGetC + x / rate;
				if (minTime > temp) {
					minTime = temp;
					toGetC += c / rate;
					rate += f;
				}
				else {
					out.printf("Case #" + k + ": %.7f\n",  minTime);
					break;
				}
			}
		}
		out.close();
	}
}
