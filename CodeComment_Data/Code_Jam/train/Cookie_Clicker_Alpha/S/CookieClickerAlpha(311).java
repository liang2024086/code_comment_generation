package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1187;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CookieClickerAlpha {

	private static final String INPUT_FILE_NAME = "resources/CookieClickerAlpha/B-small-attempt0.in";
	private static final String OUTPUT_FILE_NAME = "resources/CookieClickerAlpha/B-small-attempt0.out";

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_NAME));
		BufferedWriter wr = new BufferedWriter(new FileWriter(OUTPUT_FILE_NAME));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			String[] line = br.readLine().split(" ");

			double C = Double.parseDouble(line[0]);
			double F = Double.parseDouble(line[1]);
			double X = Double.parseDouble(line[2]);

			double totalSeconds = 0.0;
			double cookieRate = 2.0;

			while ((X/cookieRate) > ((X/(cookieRate+F)) + (C/cookieRate))) {
				totalSeconds += (C/cookieRate);
				cookieRate += F;
			}
			totalSeconds += (X/cookieRate);

			int caseNum = i+1;

			wr.write("Case #" + caseNum + ": " + totalSeconds + "\n");
		}

		br.close();
		wr.close();
	}
}
