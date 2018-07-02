package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1489;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class CookieClickerAlpha {
	public CookieClickerAlpha() throws FileNotFoundException {
		System.setOut(new PrintStream(new File("cookie-clicker-output.txt")));
		Scanner sc = new Scanner(new File("B-small-attempt0.in"));
		int testCaseNo = sc.nextInt();
		for (int i = 0; i < testCaseNo; i++) {
			double c = sc.nextDouble();
			double f = sc.nextDouble();
			double x = sc.nextDouble();
			double cookieCount = 0;
			double cookieRate = 2;
			double totalTime = 0.0;
			double ans1 = c / cookieRate;
			double ans2 = x / (cookieRate + f);
			double ans3 = x / cookieRate;
			while (true) {
				if ((ans1 + ans2) < ans3) {
					cookieRate += f;
					totalTime += ans1;
					ans1 = c / cookieRate;
					ans2 = x / (cookieRate + f);
					ans3 = x / cookieRate;
					continue;
				} else {
					totalTime += ans3;
					break;
				}
			}

			System.out.println("Case #" + (i + 1) + ": " + totalTime + "");
		}

	}

	public static void main(String[] args) throws FileNotFoundException {
		new CookieClickerAlpha();
	}
}
