package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1218;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cookie {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("A"));
		// Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			double c = sc.nextDouble();
			double f = sc.nextDouble();
			double x = sc.nextDouble();

			double min = 0;
			double s = 2;
			for (;; s += f) {
				double a = c / s + x / (s + f);
				double b = x / s;
				if (b < a) {
					// stop
					min += b;
					System.out.printf("%s%.7f\n", "Case #" + (i + 1) + ": ",
							min);
					break;
				} else {
					min += (c / s);
				}
			}

		}
	}

}
