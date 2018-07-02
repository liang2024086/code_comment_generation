package methodEmbedding.Cookie_Clicker_Alpha.S.LYD313;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CookieClicker {

	/**
	 * @param args
	 */
public static void main(String[] args) throws FileNotFoundException {
		
		double C, F, X;
		
		Scanner reader = new Scanner(new File("01.in"));
		int ncases = Integer.parseInt(reader.nextLine());
		for (int i = 0; i < ncases; i ++) {
			String finalStr = "";
			
			String[] input = reader.nextLine().trim().split(" ");
			C = Double.parseDouble(input[0].trim());
			F = Double.parseDouble(input[1].trim());
			X = Double.parseDouble(input[2].trim());
			//System.out.println(C + "--" + F + "--" + X +  "--");
			double totalSecond = 0.0;
			double cRate = 2.0;
			boolean isSolved = false;
			while (!isSolved) {
				double timeToDirectWin = X / cRate;
				double newRateIfBuy = cRate + F;
				double timeToBuy = (C/cRate);
				double timeToBuyWin = timeToBuy + (X / newRateIfBuy);
				
				if (timeToDirectWin < timeToBuyWin) {
					totalSecond += timeToDirectWin;
					cRate += F;
					isSolved = true;
				}
				else {
					cRate += F;
					totalSecond += timeToBuy;
				}
			}
			
			System.out.printf("Case #%d: %.7f\n", (i+1), totalSecond);
		}
	}

}
