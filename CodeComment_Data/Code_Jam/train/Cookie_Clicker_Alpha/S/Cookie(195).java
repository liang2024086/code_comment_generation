package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1268;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cookie {
	private static String input;
	private static String[] lines;
	private static BigDecimal X;
	private static BigDecimal F;
	private static BigDecimal C;
	private static String output = "";

	public static void main(String[] args) throws FileNotFoundException {
		input = Util.getStringFromFile("cookie.txt");
		lines = input.split(System.getProperty("line.separator"));

		for (int i = 1; i < lines.length; i++) {
			C = new BigDecimal(lines[i].split(" ")[0]);
			F = new BigDecimal(lines[i].split(" ")[1]);
			X = new BigDecimal(lines[i].split(" ")[2]);

			BigDecimal seconds = new BigDecimal(0);
			BigDecimal wealth = new BigDecimal(0);
			BigDecimal cookiesPerSecond = new BigDecimal(2);

			while (wealth.compareTo(X) == -1) {

				// at my current rate, i can make it to X in n seconds
				BigDecimal n = X.divide(cookiesPerSecond,7, RoundingMode.HALF_UP);

				// with another farm, i can make it to X in m seconds
				BigDecimal timeToBuyNewFarm = C.subtract(wealth).divide(
						cookiesPerSecond,7, RoundingMode.HALF_UP);
				BigDecimal timeToWinWithNewFarm = X.divide(
						cookiesPerSecond.add(F), 7, RoundingMode.HALF_UP);

				BigDecimal m = timeToBuyNewFarm.add(timeToWinWithNewFarm);

				// if n < m
				if (n.compareTo(m) == -1) {
					seconds = seconds.add(n);
					wealth = wealth.add(seconds.multiply(cookiesPerSecond));
				} else {
					// buy new farm
					seconds = seconds.add(timeToBuyNewFarm);
					wealth = BigDecimal.ZERO;
					cookiesPerSecond = cookiesPerSecond.add(F);
				}
			}
			output  += "Case #" + i + ": " + seconds;
			if(i != lines.length - 1) {
				output += System.getProperty("line.separator");
			}
		}
		Util.writeToFileFromString(output, "cookie_output.txt");

	}
}
