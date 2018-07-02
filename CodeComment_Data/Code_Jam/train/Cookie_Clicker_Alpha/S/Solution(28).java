package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1515;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		File file = new File("B-small-attempt0.in");

		double prod_per_sec = 2;
		double c, f, x;

		try {

			Scanner sc = new Scanner(file);
			sc.useLocale(Locale.US);
			int t = sc.nextInt();

			for (int i = 0; i < t; i++) {

				prod_per_sec = 2;
				c = sc.nextDouble();
				f = sc.nextDouble();
				x = sc.nextDouble();
				double prod_time = x / prod_per_sec;
				double prod_after_buy = c / prod_per_sec + x
						/ (prod_per_sec + f);
				while (prod_time > prod_after_buy) {

					prod_time = prod_after_buy;
					prod_after_buy -= x / (prod_per_sec + f);
					prod_per_sec += f;
					prod_after_buy += c / prod_per_sec + x / (prod_per_sec + f);

				}

				System.out.println("Case #" + (i + 1) + ": " + String.format(Locale.US,"%.7f", prod_time));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
