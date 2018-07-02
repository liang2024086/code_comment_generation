package methodEmbedding.Cookie_Clicker_Alpha.S.LYD102;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CookieClickerAlpha {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(reader.readLine());
		for (int t=1; t <= T; t++) {

			double C, F, X;
			String[] parts = reader.readLine().split(" ");
			C = Double.parseDouble(parts[0]);
			F = Double.parseDouble(parts[1]);
			X = Double.parseDouble(parts[2]);

			double score = 0;
			double timeElapsed = 0;
			double cookieRate = 2;
			while (score < X) {
				double scoreRemaining = X - score;
				if (score < C) {
					double increment = Math.min(C, scoreRemaining);
					score += increment;
					timeElapsed += increment / cookieRate;
				} else {
					double noFarmTimeRemaining = scoreRemaining / cookieRate;
					double newFarmTimeRemaining = (C + scoreRemaining) / (F + cookieRate);
					if (noFarmTimeRemaining < newFarmTimeRemaining) {
						timeElapsed += noFarmTimeRemaining;
						score = X + 1;
					} else {
						score -= C;
						cookieRate += F;
					}
				}
			}

			String answer = Double.toString(timeElapsed);
			System.out.println("Case #" + t + ": " + answer);
		}
	}
}
