package methodEmbedding.Cookie_Clicker_Alpha.S.LYD122;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class CookieClickerAlpha {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scanner = new Scanner(new File("input.in"));
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			double pro = 2;
			double c, f, x;
			c = scanner.nextDouble();
			f = scanner.nextDouble();
			x = scanner.nextDouble();

			double best = x / pro;

			double sum = 0;
			while (best > (sum + (c / pro) + (x / (pro + f)))) {
				best = (sum + (c / pro) + (x / (pro + f)));
				sum += (c / pro);
				pro += f;
			}

			DecimalFormat df = new DecimalFormat("#.0000000"); 
			System.out.println("Case #" + (i + 1) + ": " + df.format(best));

		}

	}
}
