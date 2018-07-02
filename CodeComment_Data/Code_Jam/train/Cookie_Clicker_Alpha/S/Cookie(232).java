package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1597;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Cookie {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream out = new PrintStream("output.txt");
//		PrintStream out = System.out;

		Scanner scanner = new Scanner(new File("B-small-attempt0.in"));

		int cases = scanner.nextInt();
		String[] res;
		for (int casen = 1; casen <= cases; casen++) {
			out.print("Case #" + casen + ": ");

			double c, f, x;
			c = scanner.nextDouble();
			f = scanner.nextDouble();
			x = scanner.nextDouble();

			double time = 0;
			double speed = 2;
			double sol = x / speed;
			while (true) {
				time += c / speed;
				speed += f;
				double newSol = time + x / speed;
				if (newSol < sol)
					sol = newSol;
				else
					break;
			}
			out.print(sol);

			out.println();
		}
		scanner.close();
	}

}
