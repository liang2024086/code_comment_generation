package methodEmbedding.Cookie_Clicker_Alpha.S.LYD84;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class CookieClickerAlpha {

	public static void main(String[] args) throws IOException {
		int num_cases = 0;
		String[] line = new String[3];
		double C = 0;
		double F = 0;
		double X = 0;
		double rate = 2;
		double time = 0;
		boolean game_finished = false;
		BufferedReader br = new BufferedReader(new FileReader("B-small-attempt0.in"));

		num_cases = Integer.parseInt(br.readLine());

		for (int i = 1; i <= num_cases; i++) {
			time = 0;
			rate = 2;
			game_finished = false;
			line = br.readLine().split(" ");
			C = Double.parseDouble(line[0]);
			F = Double.parseDouble(line[1]);
			X = Double.parseDouble(line[2]);

			// System.out.println(C+" "+F+" "+X);
			
			while (!game_finished) {
			if((X/rate)<(C/rate)+(X/(rate+F))) {
				time += (X/rate);
				game_finished = true;
				//System.out.println((X/rate));
			}
			else {
				time += (C/rate);
				rate += F;
				//System.out.println((C/rate)+(X/(rate+F)));
			}
			}
			
			
			System.out.print("Case #" + i + ": ");
			System.out.printf("%.7f\n", time);


		}
		br.close();
	}
}
