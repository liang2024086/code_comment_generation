package methodEmbedding.Magic_Trick.S.LYD947;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;


@SuppressWarnings("unused")
public class Qualification
{

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner input = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter output = new PrintWriter("A-small-attempt0.out");
		
		int T = input.nextInt();
		
		for (int i = 1; i <= T; i++)
		{
			output.print("Case #"+ i +": ");
			
			int row1 = input.nextInt();
			int[][] grid1 = new int[4][4];
			
			for (int l = 0; l < 4; l++)
			{
				for (int c = 0; c < 4; c++)
				{
					grid1[l][c] = input.nextInt();
				}
			}
			
			int row2 = input.nextInt();
			int[][] grid2 = new int[4][4];
			
			for (int l = 0; l < 4; l++)
			{
				for (int c = 0; c < 4; c++)
				{
					grid2[l][c] = input.nextInt();
				}
			}
			
			
			int [] numbersFound = new int[4];
			int N = 0;
			int number = -1;
			boolean continu = true;
			
			for (int j = 0; j < 4 && continu; j++)
			{
				for (int k = 0; k < 4 && continu; k++)
				{
					if (grid1[row1-1][j] == grid2[row2-1][k])
					{
						N++;
						if (N > 1)
							continu = false;
						else
							number = grid1[row1-1][j];
					}
				}
			}
			
			if (N > 1)
			{
				output.println("Bad magician!");
			}
			else if (number == -1)
			{
				output.println("Volunteer cheated!");
			}
			else
			{
				output.println(number);
			}
		}
		
		input.close();
		output.close();
	}

}
