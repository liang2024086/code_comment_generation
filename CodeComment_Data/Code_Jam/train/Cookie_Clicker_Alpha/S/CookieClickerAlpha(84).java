package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1194;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CookieClickerAlpha {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("B-small-attempt0.in"));
		
		int numInputs = in.nextInt();
		for (int i = 0; i < numInputs; i++) {
			double C = in.nextDouble();
			double F = in.nextDouble(); 
			double X = in.nextDouble();
			
			double timeElapsed = 0;
			double rate = 2;
			// Optimization crap
			// You have C = cookie cost, F = additional production, X = goal
			double toFinish = X / rate;
			double extraFact = X / (F + rate) + C / rate;
			while (true) {
				//System.out.println(timeElapsed + " " + toFinish + " " + extraFact);
				if (toFinish <= extraFact) {
					timeElapsed += toFinish;
					break;
				} else {
					timeElapsed += C / rate;
					rate += F;
					toFinish = X / rate;
					extraFact = X / (F + rate) + C / rate;
				}	
			}
			
			System.out.printf("Case #%d: %.7f\n", i + 1, timeElapsed);
		}
		
	}
}
