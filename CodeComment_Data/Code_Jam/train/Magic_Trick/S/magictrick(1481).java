package methodEmbedding.Magic_Trick.S.LYD172;

import java.util.*;
import java.io.*;

public class magictrick {
	public static void main(String[] args) throws IOException
	{
		Scanner input = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter("magictrick.out");
		int count = input.nextInt();
		for(int i=0; i<count; i++)
		{
			int ans = 0;
			int num = 0;
			int f = input.nextInt();
			int[][] mat = new int[4][4];
			for(int j=0; j<4; j++)
				for(int k=0; k<4; k++)
					mat[j][k] = input.nextInt();
			int s = input.nextInt();
			int[][] mat2 = new int[4][4];
			for(int j=0; j<4; j++)
				for(int k=0; k<4; k++)
					mat2[j][k] = input.nextInt();
			for(int j:mat[f-1])
			{
				for(int k:mat2[s-1])
				{
					if(j==k)
						{
							ans++;
							num = j;
						}
				}
			}
			if(ans == 1)
				out.println("Case #" + (i + 1) + ": " + num);
			else if (ans > 1)
				out.println("Case #" + (i + 1) + ": " + "Bad magician!");
			else if (ans == 0)
				out.println("Case #" + (i + 1) + ": " + "Volunteer cheated!");
		}
		out.close();
	}
}
