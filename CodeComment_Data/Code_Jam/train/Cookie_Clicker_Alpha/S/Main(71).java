package methodEmbedding.Cookie_Clicker_Alpha.S.LYD155;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		double c, f, x;
		double time_until_x = 0;
		double time_until_x_after_farm = 0;
		double time_until_farm = 0;
		double production = 0;
		double time = 0;

		for (int i = 0; i < t; i++) {
			c = scanner.nextDouble();
			f = scanner.nextDouble();
			x = scanner.nextDouble();

			production = 2.0;
			time = 0.0;

			time_until_x = x / production;
			time_until_farm = c / production;
			time_until_x_after_farm = time_until_farm + x / (production + f);

			while (time_until_x_after_farm < time_until_x) {
				time += time_until_farm;
				production += f;

				time_until_x = x / production;
				time_until_farm = c / production;
				time_until_x_after_farm = time_until_farm + x / (production + f);
			}

			time += x / production;

			System.out.print("Case #" + (i + 1) + ": " + String.format("%.7f", time));
			if (i != t - 1) System.out.println();
		}

		scanner.close();
	}
}
