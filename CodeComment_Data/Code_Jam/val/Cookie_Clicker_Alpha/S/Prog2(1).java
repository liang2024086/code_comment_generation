package methodEmbedding.Cookie_Clicker_Alpha.S.LYD21;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Prob2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_cases = Integer.parseInt(br.readLine());
		double times[] = new double[test_cases];

		DecimalFormat newFormat = new DecimalFormat("#.#######");

		for (int i = 1; i <= test_cases; i++) {
			String inputLine[] = new String[3];
			inputLine = (br.readLine()).split(" ");
			double C, F, X;
			C = Double.valueOf(newFormat.format(Double
					.parseDouble(inputLine[0])));
			F = Double.valueOf(newFormat.format(Double
					.parseDouble(inputLine[1])));
			X = Double.valueOf(newFormat.format(Double
					.parseDouble(inputLine[2])));
			double farms = 0;
			double cookies = 0;
			double time = 0;
			while (cookies < X) {
				while ( ((C / (2 + (F * farms))) + X / (2 + (F * (farms + 1)))) < (X / (2 + F * farms)) ) {
					time += Double.valueOf(newFormat.format(C
							/ (2 + (F * farms))));
					farms++;
					cookies += C;
				}
				cookies = 0.0;
				time += Double.valueOf(newFormat.format((X - cookies)
						/ (2.0 + (F * farms))));
				cookies += X - cookies;
			}
			times[i - 1] = Double.valueOf(newFormat.format(time));
		}
		for (int i = 0; i < test_cases; i++) {
			System.out.println("Case #" + (i + 1) + ": " + times[i]);
		}
	}
}
