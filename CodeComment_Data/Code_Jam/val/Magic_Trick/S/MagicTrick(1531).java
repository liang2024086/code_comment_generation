package methodEmbedding.Magic_Trick.S.LYD2146;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class MagicTrick 
{
	public static void main (String [] args)
	{
		int[] cards = new int[16];
		int[][] grid = new int[4][4];
		int[][] grid2 = new int[4][4];

		int answerOne;
		int answerTwo;
		int testCases;
		int matches;
		int result;
		
		//Output
		try
		{
			FileWriter fw = new FileWriter("Output.txt");
			PrintWriter pw = new PrintWriter(fw);
			try
			{
				FileReader fr = new FileReader("A-small-attempt1.in");
				Scanner sc = new Scanner(fr);
				
				//Gets first line
				testCases = Integer.parseInt(sc.nextLine());
				//System.out.println(testCases);
				
				
				for(int i = 0; i < testCases; i++)
				{
					matches = 0;
					result = 0;
					answerOne = Integer.parseInt(sc.next());
					for (int j = 0; j < 4; j ++)
					{
						for(int k = 0; k < 4; k++)
						{
							grid[j][k] = Integer.parseInt(sc.next());
							//System.out.println("Grid [" + j + "][" + k + "]: " + grid[j][k]);
						}
					}
					answerTwo = Integer.parseInt(sc.next());
					for (int j = 0; j < 4; j ++)
					{
						for(int k = 0; k < 4; k++)
						{
							grid2[j][k] = Integer.parseInt(sc.next());
							//System.out.println("Grid [" + j + "][" + k + "]: " + grid[j][k]);
						}
					}
					
					for(int l = 0; l < 4; l++)
					{
						for(int o = 0; o < 4; o ++)
						{
							if(grid[answerOne - 1][l] == grid2[answerTwo - 1][o])
							{
								matches++;
								result = grid[answerOne - 1][l];
							}
						}
					}
					
					//Cases
					if(matches == 0)
					{
						//Cheated
						pw.println("Case #" + (i + 1) + ": Volunteer cheated!");
					}
					
					if(matches == 1)
					{
						//Giver Answer
						pw.println("Case #" + (i + 1) + ": " + result);
					}
					
					if(matches > 1)
					{
						//Bad Magician
						pw.println("Case #" + (i + 1) + ": Bad magician!");
					}
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
