package methodEmbedding.Cookie_Clicker_Alpha.S.LYD653;

import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

public class Cookie
{
	public static void main(String[] args) throws IOException
	{
		Scanner reader = new Scanner(new File(args[0]));
		FileWriter writer = new FileWriter(new File("answer.txt"));
		
		int rounds = reader.nextInt();
		
		for(int i = 1; i <= rounds;i++)
		{
			double cookieCost = reader.nextDouble();
			double increase = reader.nextDouble();
			double target = reader.nextDouble();
			
			double rate = 2;
			
			double minCost = target/rate;
			double runVar = cookieCost/rate;
			rate += increase;
			double newCost = runVar + (target/rate);
			
			while(minCost > newCost)
			{
				minCost = newCost;
				runVar += (cookieCost/rate);
				rate += increase;
				newCost = runVar + (target/rate);
			}
			
			writer.write("Case #" + i + ": " + minCost + "\n");
		}
		reader.close();
		writer.close();
	}
}
