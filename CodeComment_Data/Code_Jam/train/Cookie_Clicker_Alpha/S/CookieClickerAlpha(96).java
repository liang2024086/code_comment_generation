package methodEmbedding.Cookie_Clicker_Alpha.S.LYD469;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class CookieClickerAlpha {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.0000000");
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream("src/codejam/B-small-attempt0.in"),
					"utf-8"));
			FileWriter writer = new FileWriter("src/codejam/B.txt", false);
			String line = br.readLine();
			int T = Integer.parseInt(line);
			for (int t = 1; t <= T; t++) {
				line = br.readLine();
				String[] number = line.split(" ");
				double C = Double.parseDouble(number[0]);
				double F = Double.parseDouble(number[1]);
				double X = Double.parseDouble(number[2]);
				double time = 0.0;
				double cur = 2.0;
				while (C * cur < F * (X - C)) {
					time += C / cur;
					cur += F;
				}
				time += X / cur;

				StringBuffer sb = new StringBuffer("Case #" + t + ": ");
				sb.append(df.format(time));
				System.out.println(sb);
				writer.write(sb.toString() + "\n");
			}
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
