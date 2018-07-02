package methodEmbedding.Magic_Trick.S.LYD743;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException 
	{
		Scanner in = new Scanner(new FileReader("A-small-attempt0.in"));
		//BufferedReader in = new BufferedReader(new FileReader(""));
		PrintWriter out = new PrintWriter(new FileWriter("A-small-attempt0.out"));
		int ncase = 0;
		int row = 0, col = 0;
		int count = 0;
		int number = 0;
		
		int[][] matrix = new int[4][4];
		int[] colVector = new int[4];
		int [][] matrixa = new int[4][4];
		int[] colVectora = new int[4];
		
		
		ncase = in.nextInt();
		
		for(int c = 0; c < ncase ; c++)
		{
			row = 0;
			col = 0;
			
			count = 0;
			number = 0;
		
			row = in.nextInt();
			row -=1;
			
			for(int i=0;i<4;i++)
			{
				for (int j = 0; j < 4; j++) 
				{
					matrix[i][j] = in.nextInt();
				}
			}
				
			for(int i=0;i<4;i++)
			{
				colVector[i] = matrix[row][i];
			}
			
			col = in.nextInt();
			col -=1;
			
			for(int i=0;i<4;i++)
			{
				for (int j = 0; j < 4; j++) 
				{
					matrixa[i][j] = in.nextInt();
				}
			}
			
			for(int i=0;i<4;i++)
			{
				colVectora[i] = matrixa[col][i];
			}
			
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					if(colVector[i] == colVectora[j])
					{
						count++;
						number = colVector[i];
					}
				}
			}
					
			if(count == 0)
			{
				out.println("Case #" + (c+1) + ": " + "Volunteer cheated!");
			}
			else if(count == 1)
			{
				out.println("Case #" + (c+1) + ": " + number);
			}
			else
			{
				out.println("Case #" + (c+1) + ": " + "Bad magician!");
			}
			
		}
		
		
		out.close();
	}

}
