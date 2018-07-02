package methodEmbedding.Magic_Trick.S.LYD198;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class MainClass 
{
	public static void main (String args[]) throws IOException
	{
		File inputFile = null;
		PrintWriter out = new PrintWriter(new FileWriter("output.txt"), true);
		int testCaseNumber = 0;
		int row_sel_1;
		int row_sel_2;
		try
		{
			inputFile = new File("A-small-attempt0.in");
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		Scanner sc = new Scanner(inputFile);
		if(inputFile == null)
		{
			System.out.println("File input can't be found");
		}
		testCaseNumber = sc.nextInt();
		for(int i = 1; i <= testCaseNumber; i++)
		{
			row_sel_1 = sc.nextInt();
			int[][] arrangement = new int[4][4];
			int[] row1 = new int[4];
			int[] row2 = new int[4];
			int duplicate = 0;
			ArrayList<Integer> answer = new ArrayList<Integer>();
			for(int j = 0; j < 4; j++)
			{
				for(int k = 0; k < 4; k++)
				{
					arrangement[j][k] = sc.nextInt();
				}
			}
			//loop through chosen row
			for(int l = 0; l < 4; l++)
			{
				row1[l] = arrangement[row_sel_1-1][l];
				//System.out.print(row1[l]);
			}
			row_sel_2 = sc.nextInt();
			for(int j = 0; j < 4; j++)
			{
				for(int k = 0; k < 4; k++)
				{
					arrangement[j][k] = sc.nextInt();
				}
			}
			//loop through chosen row
			for(int l = 0; l < 4; l++)
			{
				row2[l] = arrangement[row_sel_2-1][l];
			}
			
			//loop through arrays to find similarities
			for(int m = 0; m < 4; m++)
			{
				for(int n = 0; n < 4; n++)
				{
					if(row1[m] == row2[n])
					{
						answer.add(row1[m]);
					}
				}
			}
			//System.out.println("Answer size is: " + answer.size());
			if(answer.size() > 1)
			{
				out.write("Case #" + i + ": " + "Bad magician!\n");
				//System.out.println("Case #" + i + ": " + "Bad magician!");
			}
			else if(answer.size() == 0)
			{
				out.write("Case #" + i + ": " + "Volunteer cheated!\n");
				//System.out.println("Case #" + i + ": " + "Volunteer cheated!");
			}
			else
			{
				out.write("Case #" + i + ": " + answer.get(0) + "\n");
				//System.out.println("Case #" + i + ": " + answer.get(0));
			}
		}
		out.close();
	}
}
