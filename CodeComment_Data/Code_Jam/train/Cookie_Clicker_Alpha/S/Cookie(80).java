package methodEmbedding.Cookie_Clicker_Alpha.S.LYD526;


import java.io.File;
import java.util.Scanner;

public class Cookie {

	private static Scanner scanner;

	public static void main(String[] args) throws Exception {
		scanner = new Scanner(new File("B-small-attempt0.in"));
		int N = scanner.nextInt();
		for (int n = 0; n < N; n++) {
			double factoryCost = scanner.nextDouble();
			double factoryRevenue = scanner.nextDouble();
			double totalCookies = scanner.nextDouble();
			double revenue = 2;
			double timeSpent = 0;

			while (true) {
				double timeWithoutFactory = totalCookies / revenue;
				double timeWithFactory = factoryCost / revenue + totalCookies
						/ (revenue + factoryRevenue);
				if (timeWithFactory < timeWithoutFactory) {
					// build
					timeSpent += factoryCost / revenue;
					revenue += factoryRevenue;
				} else {
					timeSpent += totalCookies / revenue;
					System.out.printf("Case #%d: %.7f\n", n + 1, timeSpent);
					break;
				}
			}
		}
	}
}
