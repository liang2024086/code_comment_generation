package methodEmbedding.Magic_Trick.S.LYD1695;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q1
{
	public static void main(String[] args) throws IOException
	{
		File input = new File("CodeJamInput.txt");
		File output = new File("CodeJamOutput.txt");
		FileWriter writer = new FileWriter(output);
		Scanner scan = new Scanner(input);
		
		
		int testCases = scan.nextInt();
		String result = "";
		int[][] grid1 = new int[4][4];
		int[][] grid2 = new int[4][4];
		int answer1 = 0;
		int answer2 = 0;
		int[] possibilities1 = new int[4];
		int[] possibilities2 = new int[4];
		int answer = 0;
		for (int i = 1; i <= testCases; i++)
		{
			answer = 0;
			result = "";
			answer1 = scan.nextInt() - 1;
			for (int a = 0; a < 4; a++)
			{
				for (int b = 0; b < 4; b++)
				{
					grid1[a][b] = scan.nextInt();
				
				}
			}
			answer2 = scan.nextInt() - 1;
			for (int a = 0; a < 4; a++)
			{
				for (int b = 0; b < 4; b++)
				{
					grid2[a][b] = scan.nextInt();
				}
			}
			possibilities1 = grid1[answer1];
			possibilities2 = grid2[answer2];
			for (int a = 0; a < 4; a++)
			{
				if ((possibilities1[a]==possibilities2[0])||(possibilities1[a]==possibilities2[1])||(possibilities1[a]==possibilities2[2])||(possibilities1[a]==possibilities2[3]))
					{
						if (answer!=0) result = "Bad magician!";
						else answer = possibilities1[a];
					}
			}
			if (result.equals(""))
			{
				if (answer==0) result = "Volunteer cheated!";
				else result = "" + answer;
			}
			writer.write("Case #" + i + ": " + result + "\n");
		}
		
		
		scan.close();		
		writer.close();
		System.out.println("Done");
	}
}
