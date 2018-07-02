package methodEmbedding.Magic_Trick.S.LYD510;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 *  Code Jam 2014 - Online qualification round
 */
public class MagicTrick
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
				//Get first answer - the row corresponding to first set of cards
				int row1 = Integer.parseInt(inputFile.readLine());
				
				//Arrays to store the card sequences
				int[][] cards1 = new int[4][4];
				int[][] cards2 = new int[4][4];
				
				String[] tempNums = new String[4];
				
				//Get first arrangement of cards
				for(int i=0; i < 4; i++)
				{
					tempNums =  inputFile.readLine().split(" ");
					
					for(int j=0; j < tempNums.length; j++)
					{
						cards1[i][j] = Integer.parseInt(tempNums[j]);
					}
				}
				
				//Get second answer - the row corresponding to second set of cards
				int row2 = Integer.parseInt(inputFile.readLine());
				
				//Get second arrangement of cards
				for(int i=0; i <4; i++)
				{
					tempNums = inputFile.readLine().split(" ");
					for(int j=0; j < tempNums.length; j++)
					{
						cards2[i][j] = Integer.parseInt(tempNums[j]);
					}
				}
				/* Finished getting all the input for one case */
				
		
				/* Actual logic for solving the problem */
				int answer = 0;	//number to store the answer if the magic trick happened correctly
				int numSimilars = 0;
				
				for(int i=0; i < 4; i++)
				{
					for(int j=0; j<4; j++)
					{
						//Compare the numbers present in the corresponding rows
						if(cards1[row1-1][i] == cards2[row2-1][j])
						{
							numSimilars++;
							answer = cards1[row1-1][i];
						}
					}
				}
				
				
				//Print output in required format
				if(numSimilars == 1)
					System.out.println("Case #" + caseCount + ": " + answer);
				else if(numSimilars > 1)
					System.out.println("Case #" + caseCount + ": Bad magician!");
				else
					System.out.println("Case #" + caseCount + ": Volunteer cheated!");
				
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
