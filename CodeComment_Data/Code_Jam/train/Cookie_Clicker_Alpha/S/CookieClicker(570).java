package methodEmbedding.Cookie_Clicker_Alpha.S.LYD352;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class CookieClicker 
{
	public static void main (String [] args)
	{
		double cookieRate = 2.0f;
		double farmCost = 0.0f; //C
		double farmRate = 0.0f; //F
		double goal = 0.0f; //X
		double result = 0.0f;
		double timeOne = 0.0f;
		double timeTwo = 0.0f;
		double counter = 0.0f;
		
		int testCases = 0;
		boolean loop = true;
		
		try
		{
			FileWriter fw = new FileWriter("OutputCookie.txt");
			PrintWriter pw = new PrintWriter(fw);
			try
			{
				FileReader fr = new FileReader("B-small-attempt0.in");
				Scanner sc = new Scanner(fr);				
				testCases = Integer.parseInt(sc.nextLine());
				
				for(int i = 0; i < testCases; i++)
				{
					loop = true;
					counter = 0;
					
					farmCost = Double.parseDouble(sc.next());
					farmRate = Double.parseDouble(sc.next());
					goal = Double.parseDouble(sc.next());
					
					//Initial Checker
					timeOne = goal/(cookieRate);
					timeTwo = farmCost/(cookieRate + farmRate);
					timeTwo += goal/(cookieRate + farmRate);
					if(timeTwo > timeOne)
					{
						result = timeOne;
						loop = false;
					}
					
					//Loop Checker
					while(loop == true)
					{
						timeOne = 0.0f;
						timeTwo = 0.0f;
						
						for(double j = 0; j < counter; j += 1.0f)
						{
							timeOne += farmCost/(cookieRate + farmRate * j);
							timeTwo += farmCost/(cookieRate + farmRate * j);
						}
						
						timeTwo += farmCost/(cookieRate + farmRate * counter);
						timeOne += goal/(cookieRate + farmRate * counter);
						timeTwo += goal/(cookieRate + farmRate * (counter+1));
						
						if(timeTwo > timeOne)
						{
							loop = false;
							result = timeOne;
						}
						counter++;
					}

					pw.printf("Case #" + (i + 1) + ": %.7f%n", result);
				}
				
			}
			catch(IOException e)
			{
				System.out.println("File not found!");
			}
		
			pw.close();
		} 
		catch (IOException e) 
		{
			System.out.println("ERROR!");
		}
	}
}
