package methodEmbedding.Cookie_Clicker_Alpha.S.LYD609;

import java.io.File;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class CoockieClicker {

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(new File("B-small-attempt1.in"));
		PrintWriter out = new PrintWriter(new File("output_b_1.out"));
		int numOfTests = in.nextInt();
		for (int test = 1; test <= numOfTests; test++) {
			double c = Double.parseDouble(in.next());
			double f = Double.parseDouble(in.next());
			double x = Double.parseDouble(in.next());
			double spendedTime = 0.0;
			double speed = 2.0;
			double timeToGetCoockies = spendedTime + x / speed;
			double timeToGetFarm = c / speed;
			double timeToGetCookiesWithAdditionalFarm = spendedTime + timeToGetFarm + x / (speed += f);
			while (timeToGetCookiesWithAdditionalFarm < timeToGetCoockies) {
				spendedTime += timeToGetFarm;
				timeToGetCoockies = spendedTime + x / speed;
				timeToGetFarm = c / speed;
				timeToGetCookiesWithAdditionalFarm = spendedTime + timeToGetFarm + x / (speed += f);
			}
			out.println(String.format(Locale.US, "Case #%d: %.7f", test, timeToGetCoockies));
		}
		out.close();
		in.close();
	}

}
