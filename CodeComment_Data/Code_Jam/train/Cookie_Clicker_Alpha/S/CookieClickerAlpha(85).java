package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1153;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Formatter;


public class CookieClickerAlpha {
	public static void main(String args[]) throws IOException {
		Formatter out;
		try {
			File rfile = new File("input.txt");
			out = new Formatter("output.txt");
			FileReader fReader = new FileReader(rfile);
			BufferedReader bReader = new BufferedReader(fReader);
			String line = bReader.readLine();
			int cases = Integer.parseInt(line);
			String[] nums = new String[3];
			// System.out.println(cases);
			for (int i = 0; i < cases; i++) {
				double farmCost, farmProd, winCookies, cookies = 0, rate = 0.0000002, time = 0.0,iterations;
				int flag = 0;
				nums = bReader.readLine().split("\\s+");
				farmCost = Double.parseDouble(nums[0]);
				farmProd = Double.parseDouble(nums[1])/10000000;
				winCookies = Double.parseDouble(nums[2]);
				//	System.out.println("farm cost: " + farmCost + "\nfarm production: " + farmProd + "\nwinCookies: " + winCookies);
				while (cookies < winCookies) {
					if (farmCost > winCookies) {
						iterations = ((winCookies-cookies)/rate);
						cookies = cookies + (rate * iterations);
						time = time + (iterations/10000000);
						//		System.out.println(time);
					} else if (cookies < farmCost) {
						iterations = ((farmCost-cookies)/rate);
						//		System.out.println("iterations: " + iterations);
						cookies = cookies + (rate * iterations);
						time = time + (iterations/10000000);
					} else if (cookies >= farmCost) {
						double a = ((winCookies - cookies) / rate)/10000000;
						double b = ((winCookies-(cookies-farmCost))/(rate + farmProd))/10000000;
						//	System.out.println("Comparing: " + a + "\t" + b);
						if (b < a) {
							cookies = cookies - farmCost;
							rate = rate + farmProd;
							//		System.out.println("new farm added, new rate = " + rate);
						} else {
							time = time + ((winCookies - cookies)/rate)/10000000;
							break;
						}
					}
				}
				out.format("%s%s%s%s%s", "Case #", i+1, ": ", time,"\n");
			}
			bReader.close();
			out.close();
		} catch(Exception e) {
			System.out.println("Scene bad ho gya ha.");
			e.printStackTrace();
		}
	}
}
