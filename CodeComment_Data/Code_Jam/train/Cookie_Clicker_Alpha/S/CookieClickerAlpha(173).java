package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1614;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class CookieClickerAlpha {

	public static void main(String[] args) throws FileNotFoundException {

		String inputPathName = "inputs/CookieClickerAlpha-small-practice.in";
		String outputPathName = "C:/Users/desingurajan_s/Desktop/out.txt";

		try (Scanner sc = new Scanner(new BufferedReader(new FileReader(
				new File(inputPathName))));
				PrintWriter pw = new PrintWriter(new File(outputPathName))) {
			int T = sc.nextInt();

			for (int i = 1; i <= T; i++) {
				double C = sc.nextDouble();
				double F = sc.nextDouble();
				double X = sc.nextDouble();

				double secondsSpend = 0.0;
				double maxSecondsNeeded = X / 2;
				double cookiesPerSecond = 2.0;
				while (true) {
					double secondsNeeded = C / cookiesPerSecond;
					cookiesPerSecond += F;
					secondsSpend += secondsNeeded;

					if ((secondsSpend + (X / cookiesPerSecond)) > maxSecondsNeeded) {
						break;
					}
					maxSecondsNeeded = secondsSpend + (X / cookiesPerSecond);
				}
				pw.format("Case #%d: %.7f%n", i, maxSecondsNeeded);
			}
		}
	}
}
