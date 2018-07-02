package methodEmbedding.Magic_Trick.S.LYD143;

import java.util.Scanner;

public class Magician {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int cases = T;
		while(T-->0)
		{
			int r1 = sc.nextInt() - 1;
			int[][] layout1 = new int[4][4];
			
			for(int r = 0; r < 4; r++)
			{
				for(int c = 0; c < 4; ++c)
				{
					layout1[r][c]=sc.nextInt();
				}
			}
			
			int r2 = sc.nextInt() - 1;
			int[][] layout2 = new int[4][4];
			
			for(int r = 0; r < 4; r++)
			{
				for(int c = 0; c < 4; ++c)
				{
					layout2[r][c]=sc.nextInt();
				}
			}
			
			int matchCount = 0;
			int lastMatch = 0;
			
			for(int i = 0; i < 4; ++i)
			{
				for(int j = 0; j < 4; ++j)
				{
				//	System.out.println(layout1[r1][i]+":"+layout2[r2][j]);
					if(layout1[r1][i]==layout2[r2][j])
					{
					//	System.out.println(r1+":"+r2+"---"+i+":"+j);
						++matchCount;
						lastMatch = layout1[r1][i];
					}
				}
			}
			
			System.out.print("Case #"+(cases-T)+": ");
			if(matchCount == 0)
			{
				System.out.println("Volunteer cheated!");
			}
			else if(matchCount == 1)
			{
				System.out.println(lastMatch);
			}
			else
			{
				System.out.println("Bad magician!");
			}
			
		}
	}
}
