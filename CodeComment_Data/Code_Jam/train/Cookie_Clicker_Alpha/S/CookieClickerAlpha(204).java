package methodEmbedding.Cookie_Clicker_Alpha.S.LYD929;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CookieClickerAlpha {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("B-small-attempt0.in"));
		int t = scanner.nextInt();
		int caseNumber = 1;
		while (caseNumber <= t) {
			double c = scanner.nextDouble();
			double f = scanner.nextDouble();
			double x = scanner.nextDouble();

			double result = 0;

			int breakingPoint = (int) (x / c - 2 / f);
			
			int i = 0;
			for (; i < breakingPoint; i++) {
				result += c / (f * i + 2);
			}
			
			result += x / (f * i + 2);
			
			System.out.println("Case #" + caseNumber++ + ": " + result);
		}
	}
	
}
