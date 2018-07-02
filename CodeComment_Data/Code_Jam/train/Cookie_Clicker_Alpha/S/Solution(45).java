package methodEmbedding.Cookie_Clicker_Alpha.S.LYD805;

import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		
		for (int i = 1; i <= testCases; i++) {
			double cost = scanner.nextDouble();
			double increase = scanner.nextDouble();
			double target = scanner.nextDouble();
			double timeElasped = 0;
			double currRate = 2;

			while((target)/currRate > 
			(cost/currRate + (target)/(currRate+increase)))
			{
				timeElasped+= cost/currRate;
				currRate += increase;
			}
			timeElasped += target/currRate;
			System.out.println("Case #" + Integer.toString(i)
					+ ": "  + Double.toString(timeElasped));		}
	}
}
