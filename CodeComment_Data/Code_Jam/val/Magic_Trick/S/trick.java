package methodEmbedding.Magic_Trick.S.LYD2168;

import java.io.*;
import java.util.*;

class trick
{
	public static void main(String[] args) throws IOException
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
		int test,count=0,row,cas= 0,i,j,result=0,k;
		int[][] grid = new int[4][4];
		test = Integer.parseInt(br.readLine());
		while(test>0)
		{
			count = 0;
			hs.clear();
			cas++;
			test--;
			for(k =0;k<2;k++)
			{
				row = Integer.parseInt(br.readLine());
				row--;
				for(i=0;i<4;i++)
				{
					StringTokenizer st = new StringTokenizer(br.readLine());
					for(j=0;j<4;j++)
					{
						grid[i][j] = Integer.parseInt(st.nextToken());
					}
				}
				for(i=0;i<4;i++)
				{
					if(hs.contains(grid[row][i]))
					{
						count++;
						if(count>1)
						{
							pw.println("Case #"+cas+": Bad magician!");
							pw.flush();
							break;
						}
						result = grid[row][i];
					}
					else
					{
						hs.add(grid[row][i]);
					}
				}
			}
			if(count == 0)
			{
				pw.println("Case #"+cas+": Volunteer cheated!");
				pw.flush();
			}
			if(count == 1)
			{
				pw.println("Case #"+cas+": "+result);
				pw.flush();
			}
			
		}
	}
}
