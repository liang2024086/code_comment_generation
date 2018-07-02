package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1147;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 *  Code Jam 2014 - Online qualification round - Problem B
 */

public class CookieClickerAlpha
{
	public static void main(String[] args)
	{
		//Check for input file
		if(args.length != 1)
		{
			System.out.println("Input file name not given");
			System.exit(1);
		}
		
		BufferedReader inputFile = null;
		
		//Open the file
		try
		{
			inputFile = new BufferedReader(new FileReader(args[0]));
			
			//Store number of lines
			int numCases = Integer.parseInt(inputFile.readLine());
			int caseCount = 1;	//Variable to count up to number of lines
			
			//Start while loop to read through each line in input file.
			while(caseCount <= numCases)
			{
				/* Start getting input for one case */
				String[] tempInput = inputFile.readLine().split(" ");
				
				//Double variables to store the different input values
				double cookiesForFarm = Double.parseDouble(tempInput[0]);		//C as described in the problem
				double rateIncrementPerFarm = Double.parseDouble(tempInput[1]);	//F a described in the problem
				double requiredCookies = Double.parseDouble(tempInput[2]);		//X as described in the problem

				double time = 0.0;
				double rate = 2.0;	//starting rate is 2.0.
				/* Finished getting all the input for one case */

				
				/* Actual logic for solving the problem */
				while(true)
				{
					//Calculate time for the two possible methods of reaching the required number of cookies
					double time1 = requiredCookies/rate;
					double time2 = (cookiesForFarm/rate) + (requiredCookies/(rate + rateIncrementPerFarm));
					
					//If this case is true, then that means the optimum rate of producing cookies has been reached. Hence we break the loop
					if(time1 <= time2)
					{
						time += time1;
						break;
					}
					//If this case is true, then we do not have the optimum rate of producing cookies. We need to add the time taken to buy a farm
					else
					{
						time += cookiesForFarm/rate;
						rate += rateIncrementPerFarm;
					}
				}
				
				//Print output in required format
				System.out.println("Case #" + caseCount + ": " + time);
				
				caseCount++;	//increment case counter
			}
		}
		catch(FileNotFoundException e)
		{
			System.err.println("Error - File not found " + e.getMessage());
		}
		catch(IOException e)
		{
			System.err.println("Error - I/O exception " + e.getMessage());
		}
		finally
		{
			//To close file, need to put it in a try-catch block!
			try
			{
				inputFile.close();
			}
			catch(IOException e)
			{
				System.err.println("Error - Unable to close file " + e.getMessage());
			}
		}
	}
}
