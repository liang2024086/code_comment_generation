package methodEmbedding.Cookie_Clicker_Alpha.S.LYD788;


import java.util.ArrayList;
import java.util.Scanner;

public class ProblemB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testNo = input.nextInt() + 1;
		for (int i = 1; i < testNo; i++) {
			double C = input.nextDouble();
			double F = input.nextDouble();
			double X = input.nextDouble();
			boolean lessFound = false;
			ArrayList<Double[]> cookieArr = new ArrayList<Double[]>();
			Double[] initEntry = new Double[2];
			initEntry[0] = 0.0;
			initEntry[1] = X / 2.0;
			cookieArr.add(initEntry);
			for (int j = 1; !lessFound; j++) {
				Double[] prevEntry = cookieArr.get(cookieArr.size() - 1);
				double prevPts = prevEntry[0] + prevEntry[1];
				//System.out.println("Prev entry is: " + prevEntry[0] + " and " + prevEntry[1]);
				Double[] newEntry = new Double[2];
				newEntry[0] = prevEntry[0] + C / ((F * (j - 1)) + 2.0);
				newEntry[1] = X / ((F * j) + 2.0);
				double currentPts = newEntry[0] + newEntry[1];
				if (prevPts <= currentPts) {
					lessFound = true;
				} else {
					cookieArr.add(newEntry);
				}
			}
			Double[] prevEntry = cookieArr.get(cookieArr.size() - 1);
			double bestPts = prevEntry[0] + prevEntry[1];
			System.out.println(String.format("Case #%d: %.7f", i, bestPts));
			//System.out.println(String.format("Case #%d: ", i) +  bestPts);

		}

	}

}
