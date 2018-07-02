package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1552;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author swapnil
 * 
 */
public class CookieCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		String line = null;

		line = reader.readLine();
		int noOfTestCases = Integer.parseInt(line);
		for (int i = 0; i < noOfTestCases; i++) {
			line = reader.readLine();
			String arr[] = line.split(" ");
			double C = Double.parseDouble(arr[0]);
			double F = Double.parseDouble(arr[1]);
			double X = Double.parseDouble(arr[2]);
			double currentRate = 2;
			double totalTime = 0;
			boolean moreCookies = false;
			while (!moreCookies) {
				if ((X / currentRate) <= ((C / currentRate) + (X / (currentRate + F)))) {
					totalTime += (X / currentRate);
					moreCookies = true;
					System.out.printf("Case #%d: %.7f\n", i + 1, totalTime);
				} else {
					totalTime += (C / currentRate);
					currentRate += F;
				}
			}
		}

		reader.close();
	}
}
