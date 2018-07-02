package methodEmbedding.Cookie_Clicker_Alpha.S.LYD138;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class CookieClicker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US", "WIN"));
		try {
			Scanner file = new Scanner(new File("src/other/bsmall.txt"));
			int testCases = file.nextInt();
			int testCase = 1;
			
			while (testCases-- > 0) {
				double C, F, X;
				C = file.nextDouble();
				F = file.nextDouble();
				X = file.nextDouble();
				double result = Double.MAX_VALUE;
				int farmsToBuy = 0;
				while (true) {
					double currentResult = 0;
					double rate = 2;

					int tmp = farmsToBuy;
					while (tmp > 0) {
						currentResult += C / rate;
						rate += F;
						tmp--;
					}
					currentResult += X / rate;

					if (currentResult < result) {
						result = currentResult;
					} else {
						break;
					}

					farmsToBuy++;
				}

				// output << "Case #" << testCase << ": " << result << endl;
				System.out.println("Case #" + testCase + ": " + result);

				testCase++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
