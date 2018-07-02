package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1152;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author wdebicki Wojciech.Debicki@gmail.com
 * 
 */

public class CookieClickerAlpha {
	private static final String BASE_NAME = "B-small-attempt0";
	private static final String DATA_IN = BASE_NAME + ".in";
	private static final String DATA_OUT = BASE_NAME + ".out";

	public static void main(String[] args) throws IOException {

		Scanner inputScanner = new Scanner(Paths.get(DATA_IN));
		inputScanner.useLocale(Locale.US);
		PrintWriter writer = new PrintWriter(DATA_OUT);
		int n = inputScanner.nextInt();
		double C, F, X;

		double cookieGainPerSecond = 2;
		double numberOfSeconds = 0;
		double timeToBuild = -1;
		double cummulitiveTime = -1;
		double timeToBuildNextCookieFab = -1;

		for (int i = 0; i < n; i++) {
			cookieGainPerSecond = 2;
			numberOfSeconds = 0;
			timeToBuild = -1;
			cummulitiveTime = -1;
			C = inputScanner.nextDouble();
			F = inputScanner.nextDouble();
			X = inputScanner.nextDouble();

			do {

				timeToBuild = (X / cookieGainPerSecond);
				timeToBuildNextCookieFab = (C / cookieGainPerSecond);
				cummulitiveTime = (timeToBuildNextCookieFab + (X / (cookieGainPerSecond + F)));

				if (timeToBuild > cummulitiveTime) {
					numberOfSeconds += timeToBuildNextCookieFab;
				} else {
					numberOfSeconds += timeToBuild;
				}

				cookieGainPerSecond += F;

			} while (timeToBuild > cummulitiveTime);

			writer.println("Case #" + (i + 1) + ": " + String.format(Locale.US, "%.7f", numberOfSeconds));
		}
		writer.close();
	}
}
