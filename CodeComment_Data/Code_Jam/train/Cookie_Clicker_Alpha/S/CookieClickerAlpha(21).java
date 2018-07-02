package methodEmbedding.Cookie_Clicker_Alpha.S.LYD26;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author ?ngel Jes?s Garc?a Pineda ~ Agedjus.com
 */

public class CookieClickerAlpha {

	public static void main(String[] args) {
		BufferedWriter bw = null;
		Scanner sc = null;
		try {
			sc = new Scanner(new File("input.txt"));
			bw = new BufferedWriter(new FileWriter(new File("output.txt")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		PrintWriter wr = new PrintWriter(new BufferedWriter(bw));

		// PROGRAM

		int nCases = sc.nextInt();
		for (int i = 0; i < nCases; i++) {
			double C = new Double(sc.next()), F = new Double(sc.next()), X = new Double(
					sc.next()), cookies = 0, factor = 2, seconds = 0;
			while (cookies < X) {
				double calc1 = (X - cookies) / factor, calc2 = (C - cookies)
						/ factor, calc3 = X / (factor + F);
				if (calc1 < calc2 + calc3) {
					seconds += calc1;
					cookies = X;
				} else {
					cookies = 0;
					factor += F;
					seconds += calc2;
				}
			}
			wr.println("Case #" + (i + 1) + ": " + seconds);
		}

		// PROGRAM

		sc.close();
		wr.close();
		try {
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
