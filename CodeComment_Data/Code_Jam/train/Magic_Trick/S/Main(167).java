package methodEmbedding.Magic_Trick.S.LYD25;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
	public static void main(String args[]) throws IOException
	{
		Scanner in=new Scanner(System.in);
		
		int T=in.nextInt();
		for(int i=1;i<=T;i++)
		{
			int row1=in.nextInt();
			int grid[][]=new int[4][4];
			for(int a=0;a<4;a++)
			{
				for(int b=0;b<4;b++)
				{
					grid[a][b]=in.nextInt();
				}
			}
			Set<Integer> s=new HashSet<Integer>();
			for(int a=0;a<4;a++)
			{
				s.add(grid[row1-1][a]);
			}
			int count=0;
			row1=in.nextInt();
			for(int a=0;a<4;a++)
			{
				for(int b=0;b<4;b++)
				{
					grid[a][b]=in.nextInt();
				}
			}
			int card=0;
			for(int a=0;a<4;a++)
			{
				if(s.contains(grid[row1-1][a])) 
					{
					card=grid[row1-1][a];
					count++;
					}
			}
			if(1==count)
			{
				System.out.println("Case #"+i+": "+card);
			}
			else if(count>1)
			{
				System.out.println("Case #"+i+": Bad magician!");
			}
			else
			{
				System.out.println("Case #"+i+": Volunteer cheated!");
			}
		}
	}
}
