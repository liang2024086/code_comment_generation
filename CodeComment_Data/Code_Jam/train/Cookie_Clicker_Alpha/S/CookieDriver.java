package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1258;

import java.util.Scanner;
import java.io.*;

public class CookieDriver 
{
	public static void main(String[] args)throws IOException
	{
		Scanner input = new Scanner(new FileInputStream("B-small-attempt0 (1).in"));
		PrintWriter output = new PrintWriter("Output.txt", "UTF-8");
		int nrTests = input.nextInt();
		
		for (int i = 0; i<nrTests;i++)// NR of test cases
		{
			//Initialise Problem ########################
			int caseNr = i+1;
			double C,F,X,R, T;
			R = 2.0; //Inital rate of production
			
			C = input.nextDouble(); //Cost
			F = input.nextDouble(); //Flow
			X = input.nextDouble(); //Target
			T = 0; 					// Total TIME taken
			boolean solutionNotFound = true;
			
			double timeWin, timeWinBig, timeBuy; //Winbig is after the purchase of another farm
			
			// ##########################################
			
			while (solutionNotFound)
			{
				timeWin = X/R;
				timeWinBig = X/(R + F);
				timeBuy = C/R;
				
				if (timeWin - timeWinBig > timeBuy) // then buy
				{
					R += F; // your flow increases
					T += timeBuy; // the time to buy the farm
				}
				else
				{
					T += timeWin;
					solutionNotFound = false; //Found Solution
				}		
			}
			System.out.printf("Case #" + caseNr + ": " + "%.7f" + "\n", T); //COMMENT OUT AT END @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
			output.printf("Case #" + caseNr + ": " + "%.7f" + "\n", T);
			
		}//nr of test cases
		output.close();
		
		
	}


}
