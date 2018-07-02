package methodEmbedding.Cookie_Clicker_Alpha.S.LYD100;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class CookieClickerAlpha {
	public static final String FILE_NAME = "B-small-attempt0";
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File(FILE_NAME + ".in"));
		PrintStream output = new PrintStream(new File(FILE_NAME + ".out"));
		int cases = input.nextInt();
		
		for (int i = 1; i <= cases; i++) {
			double farmCost = input.nextDouble();
			double upgrade = input.nextDouble();
			double goal = input.nextDouble();
			
			double currRate = 2.0;
			double timeElapsed = 0.0;
			
			while (timeElapsed + (goal / currRate) > timeElapsed + (farmCost / currRate) + (goal / (currRate + upgrade))) {
				timeElapsed += farmCost / currRate;
				currRate += upgrade;
			}
			
			timeElapsed += goal / currRate;
			
			output.printf("Case #%d: %.7f\n", i, timeElapsed);
		}
		
		input.close();
		output.close();
	}

}
