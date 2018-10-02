package methodEmbedding.Cookie_Clicker_Alpha.S.LYD559;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


public class cookie {

	public static void main(String[] args) {
		int numCases = 0;
		try
		{
			PrintWriter writer = new PrintWriter("small.out");
			
			Scanner scanner = new Scanner(new File("small.in"));
			
			numCases = scanner.nextInt();
			
			for(int i = 0; i < numCases; i++)
			{
				double farmCost = scanner.nextDouble();
				double farmProduction = scanner.nextDouble();
				double goal = scanner.nextDouble();
				
				double productionRate = 2;
				
				double result = goal/productionRate;
				
				for(int j = 0; j < goal; j++)
				{
					double tempResult = 0;
					productionRate = 2;
					
					for(int k = 0; k < j; k++)
					{
						tempResult += (farmCost/productionRate);
						productionRate += farmProduction;
					}
					
					tempResult += (goal / productionRate);
					
					if(tempResult < result)
					{
						result = tempResult;
					}
				}

				writer.printf("Case #%d: %.7f\n", i+1, result);
			}
			writer.close();
		} catch (Exception e){}
	}

}
