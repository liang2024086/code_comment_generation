package methodEmbedding.Magic_Trick.S.LYD1783;


import java.util.Scanner;

public class MagicTrick
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int grid1[][] = new int[4][4];
		int grid2[][] = new int[4][4];
		
		for(int c=1; c<=t; c++)
		{
			// answer to the first question
			int ans1 = sc.nextInt() - 1;
			
			// fill the grid
			for(int i=0; i<4; i++)
				for(int j=0; j<4; j++)
					grid1[i][j] = sc.nextInt();
			
			// answer to the first question
			int ans2 = sc.nextInt() - 1;
			
			// fill the grid
			for(int i=0; i<4; i++)
				for(int j=0; j<4; j++)
					grid2[i][j] = sc.nextInt();
			
			int found=0, card=0;
			for(int j1=0; j1<4; j1++)
				for(int j2=0; j2<4; j2++)
				{
					if(grid1[ans1][j1] == grid2[ans2][j2])
					{
						found ++;
						card = grid1[ans1][j1];
					}
				}
			
			if(found == 0)
				System.out.println("Case #" + c + ": " + "Volunteer cheated!");

			else if(found > 1)
				System.out.println("Case #" + c + ": " + "Bad magician!");
			
			else
				System.out.println("Case #" + c + ": " + card);
		}
		
		sc.close();
	}

}
