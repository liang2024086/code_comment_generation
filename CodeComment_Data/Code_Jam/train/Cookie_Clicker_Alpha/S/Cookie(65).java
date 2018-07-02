package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1057;

import java.io.*;
import java.util.*;
import java.math.*;
public class Cookie
{
	public static double cost, bonus, goal;
	
	public static void main(String[] args) throws IOException
	{
		Scanner input = new Scanner(System.in);
		int numCases = input.nextInt();
		
		for(int t = 0; t < numCases; t++)
		{
			cost = input.nextDouble();
			bonus = input.nextDouble();
			goal = input.nextDouble();
			double rate = 2;
			double totalTime = 0;
			//System.out.println("here");
			while(true)
			{
				double timeNoFarm = goal / rate;
				double timeFarm = goal / (rate + bonus) + cost / rate;
				
				//System.out.printf("%f %f\n", timeNoFarm, timeFarm);
				
				if(timeNoFarm < timeFarm)
				{
					totalTime += timeNoFarm;
					break;
				}
				else
				{
					totalTime += cost / rate;
					rate += bonus;
				}
			}
			System.out.printf("Case #%d: %.7f\n", t+1, totalTime);
			
		}
	}
}
