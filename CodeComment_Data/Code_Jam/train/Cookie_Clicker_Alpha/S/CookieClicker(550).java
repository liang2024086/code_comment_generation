package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1555;

import java.io.*;
import java.util.*;

public class CookieClicker {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(in.readLine().trim());
		for(int test = 1; test <= tests; test++) {
			System.out.printf("Case #%d: ", test);
			String[] s = in.readLine().split("\\s+");
			double c = Double.parseDouble(s[0]);
			double f = Double.parseDouble(s[1]);
			double x = Double.parseDouble(s[2]);
			double rate = 2.0;
			double cookies = 0.0;
			double time = 0.0;

			while(c/rate + x/(rate+f) < x/rate) {
				time += c/rate;
				rate += f;
			}
			time += x/rate;
			System.out.printf("%.7f\n", time);
		}
	}
}
