package methodEmbedding.Magic_Trick.S.LYD1917;

import java.util.*;
import java.io.*;
public class A 
{
	static final int size = 4;
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(new File("A-small-attempt0.in"));
		//Scanner sc = new Scanner(System.in);
		BufferedWriter out = new BufferedWriter(new FileWriter(new File("small.out")));
		int num_cases = sc.nextInt();
		for(int k=1; k<=num_cases; k++)
		{
			int row_1 = sc.nextInt();
			ArrayList<Integer> row_chose = new ArrayList<Integer>();
			//int[][] board = new int[size][size];
			for(int i=0; i<size; i++)
			{
				for(int j=0; j<size; j++)
				{
					int temp = sc.nextInt();
					if(i==row_1-1)
						row_chose.add(temp);
				}
			}
			//System.out.println(row_chose);
			int ctr = 0;
			int row_2 = sc.nextInt();
			int ans = -1;
			for(int i=0; i<size; i++)
			{
				for(int j=0; j<size; j++)
				{
					int temp = sc.nextInt();
					if(i==row_2-1 && row_chose.contains(temp))
					{
						ans = temp;
						ctr++;
					}
				}
			}
			
			if(ctr==0)
				out.write("Case #"+k+": Volunteer cheated!\n");
			else if(ctr==1)
				out.write("Case #"+k+": "+ans+"\n");
			else
				out.write("Case #"+k+": Bad magician!\n");
		}
		out.close();
	}
}
