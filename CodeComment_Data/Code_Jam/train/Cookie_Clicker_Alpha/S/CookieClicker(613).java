package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1605;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CookieClicker {
	public static void main(String[] args)
	{
		File file = new File("/Users/unicornherder/Documents/workspace/CookieClicker/src/input.txt");
		try
		{
			Scanner in = new Scanner(file);
			int T = in.nextInt();
			for (int i=1; i<=T; i++)
			{
				double C = in.nextFloat();
				double F = in.nextFloat();
				double X = in.nextFloat();
				double R = 2.0;
				
				double currentT = X/R;
				double currentTP = (C/R) + (X/(R+F));
				double totalTime = 0;
				
				if (currentT <= currentTP)
				{
					System.out.println("Case #"+i+": "+currentT);
				}
				else
				{
					do
					{
						totalTime += C/R;
						R += F;
						
						currentT = totalTime + (X/R);
						currentTP = totalTime + (C/R) + (X/(R+F));
					}
					while (currentT >= currentTP);
					
					System.out.println("Case #"+i+": "+currentT);
				}
				
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
