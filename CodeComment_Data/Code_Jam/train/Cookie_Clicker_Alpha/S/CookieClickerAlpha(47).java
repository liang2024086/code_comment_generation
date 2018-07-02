package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1418;


import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class CookieClickerAlpha {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new FileWriter(
				"C:\\Users\\Aniket\\Desktop\\output.txt"));
		int n = Integer.parseInt(br.readLine());
		int i = 1;
		while (n-- > 0) {
			double c, f, x;
			String ip[] = br.readLine().split(" ");
			c = Double.parseDouble(ip[0]);
			f = Double.parseDouble(ip[1]);
			x = Double.parseDouble(ip[2]);

			double cookieRate = 2.0;
			double time = x / cookieRate;
			double farmTime = 0.0;
			do {
				farmTime += (c / cookieRate);
				cookieRate += f;
				farmTime += (x / cookieRate);
				if (farmTime < time) {
					time = farmTime;
				} else {
					break;
				}
				farmTime -= (x / cookieRate);
			} while (true);

			System.out.println("Case #" + (i) + ": " + time);
			out.println("Case #" + (i++) + ": " + time);
		}
		
		out.close();
	}

}
