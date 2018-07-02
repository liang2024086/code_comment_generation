package methodEmbedding.Cookie_Clicker_Alpha.S.LYD169;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CookieClickerAlpha {
	private static final String SMALL_IN = "data/cookieClickerAlpha/B-small-attempt0.in";
	private static final String SMALL_OUT = "data/cookieClickerAlpha/small0.out";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(SMALL_IN));
		BufferedWriter bw = new BufferedWriter(new FileWriter(SMALL_OUT));
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; ++t) {
			String[] line = br.readLine().split(" ");
			double C = Double.parseDouble(line[0]);
			double F = Double.parseDouble(line[1]);
			double X = Double.parseDouble(line[2]);
			double totalTime = 0.0;
			double speed = 2.0;
			while (true) {
				// judge
				if ((X - C) / speed > X / (speed + F)) {
					// build
					totalTime += C / speed;
					speed += F;
				} else {
					// finish
					totalTime += X / speed;
					break;
				}
			}
			bw.write(String.format("Case #%d: %.7f\r\n", t, totalTime));
		}
		bw.close();
		br.close();
	}
}
