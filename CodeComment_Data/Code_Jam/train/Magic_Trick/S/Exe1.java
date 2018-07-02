package methodEmbedding.Magic_Trick.S.LYD1712;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;


public class Exe1 {
	public static void main (String[] args) throws Exception
	{
		Scanner input = new Scanner(new File("input"));
		BufferedWriter output = new BufferedWriter(new FileWriter(new File("output")));
		int T = input.nextInt();
		for ( int i = 0; i<T ; i++)
		{
			int [] counter = new int[16];
			for ( int j = 0; j < 16; j++)
			{
				counter[j] = 0;
			}
			int row = input.nextInt();
			for (int j = 0; j < 4*(row-1) ; j++ )
			{
				int dummy = input.nextInt();
			}
			for (int j = 0; j < 4 ; j++)
			{
				int read = input.nextInt();
				counter[read-1]++;
			}
			for (int j = 0; j < 4*(4-row); j++)
			{
				int dummy = input.nextInt();
			}
			row = input.nextInt();
			for (int j = 0; j < 4*(row-1) ; j++ )
			{
				int dummy = input.nextInt();
			}
			for (int j = 0; j < 4 ; j++)
			{
				int read = input.nextInt();
				counter[read-1]++;
			}
			for (int j = 0; j < 4*(4-row); j++)
			{
				int dummy = input.nextInt();
			}
			int ans = -1;
			for (int j = 0; j < 16; j++)
			{
				if (counter[j] == 2)
				{
					if (ans == -1)
						ans = j+1;
					else if ( ans != -1)
					{
						ans = -2;
					}
				}
			}
			output.write("Case #"+(i+1)+": ");
			if ( ans == -1)
			{
				output.write("Volunteer cheated!");
			}
			else if ( ans == -2)
			{
				output.write("Bad magician!");
			}
			else
			{
				output.write(""+ans);
			}
			output.newLine();
		}
		output.flush();
		input.close();
		output.close();
	}
}

