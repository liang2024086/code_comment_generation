package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1215;

import java.io.*;
import java.util.*;
import java.lang.*;

public class CookieClickerAlpha {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new File("CookieClickerAlpha.dat"));
		System.setOut(new PrintStream(new File("CookieClickerAlpha.out")));

		int t = input.nextInt();
		for(int tr = 0; tr < t; tr++) {
			double c = input.nextDouble(), f = input.nextDouble(), x = input.nextDouble();
			
			double currentProduction = 2.0;
			double accruedTime = 0.0;
			double directTime = accruedTime + x / currentProduction;
			
			double factoryTime = c / currentProduction + x / (currentProduction + f);
			
			//System.out.println("Initial Conditions:  " + directTime + ", directly, or " + factoryTime + " if you buy another factory.");
			
			while(factoryTime <= directTime) {
				accruedTime += (c / currentProduction);
				//System.out.println("Accrued Time increased to " + accruedTime);
				directTime = factoryTime;
				
				currentProduction += f;
				
				factoryTime = accruedTime + x / currentProduction;

				//System.out.println("At this step: " + directTime + " directly, or " + factoryTime + " if you buy another factory.");
			}
			
			System.out.println("Case #" + (tr + 1) + ": " + String.format("%.7f", directTime));
		}

		input.close();
		System.out.close();
	}
}
