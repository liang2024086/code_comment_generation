package methodEmbedding.Cookie_Clicker_Alpha.S.LYD669;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jam2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputs = Integer.parseInt(br.readLine());
		double time_list[] = new double[inputs];

		for (int i = 1; i <= inputs; i++) {
			String inputLine[] = new String[3];
			inputLine = (br.readLine()).split(" ");
			double C, F, X;
			C = Double
					.parseDouble(inputLine[0]);
			F = Double
					.parseDouble(inputLine[1]);
			X = Double
					.parseDouble(inputLine[2]);
			double no_of_farms = 0;
			double cookies = 0;
			double time = 0;
			while (cookies < X) {
				while ( ((C / (2 + (F * no_of_farms))) + X / (2 + (F * (no_of_farms + 1)))) < (X / (2 + F * no_of_farms)) ) {
					time += C / (2 + (F * no_of_farms));
					no_of_farms++;
					cookies += C;
				}
				cookies = 0.0;
				time += (X - cookies) / (2.0 + (F * no_of_farms));
				cookies += X - cookies;
			}
			time_list[i - 1] = time;
		}
		for (int i = 0; i < inputs; i++) {
			System.out.println("Case #" + (i + 1) + ": " + time_list[i]);
		}
	}
}
