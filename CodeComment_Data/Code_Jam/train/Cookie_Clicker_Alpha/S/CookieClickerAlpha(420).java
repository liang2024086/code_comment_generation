package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1123;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class CookieClickerAlpha {

	static {
		try {
			String input = "B-small-attempt0.in";
			String output = input.substring(0, input.lastIndexOf('.')) + ".out";
			System.setIn(new FileInputStream(input));
			System.setOut(new PrintStream(new FileOutputStream(output), true));
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for (int total = input.nextInt(), r = 1; r <= total; r++) {
			double c = input.nextDouble();
			double f = input.nextDouble();
			double x = input.nextDouble();
			double v = 2, t = 0, tx, tf;
			while (true) {
				tx = x / v;
				tf = c / v;
				v += f;
				if (tx > tf + (x / v)) {
					t += tf;
				} else {
					t += tx;
					break;
				}
			}
			System.out.printf("Case #%d: %.7f\n", r, t);
		}
		input.close();
	}

}
