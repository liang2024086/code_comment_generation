package methodEmbedding.Cookie_Clicker_Alpha.S.LYD97;

import java.util.Scanner;


public class Cookies 
{ 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int cs = sc.nextInt();
		for(int i = 0; i < cs; ++i)
		{
			double farm = sc.nextDouble();
			double farmOutput = sc.nextDouble();
			double x = sc.nextDouble();
			
			double output = 2;
			
			double count = 0.0;
			boolean finished = false;
			while(!finished)
			{
				
				double toGoal = x / (output);
				double purchaseFarmAndGoal = (farm / output) + (x / (output + farmOutput));
				if(toGoal < purchaseFarmAndGoal)
				{
					count += toGoal;
					finished = true;
				}
				else
				{
					count += farm / output;
					output += farmOutput;
				}
				
				
			}
		//	System.out.printf("Case #%d: %f\n",(i+1),count);
			System.out.println("Case #" +(i+1) + ": " + count);
		}
	}
}
