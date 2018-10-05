package methodEmbedding.Magic_Trick.S.LYD1317;

import java.util.Scanner;

public class MagicTrick {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		String[] output = new String[cases];
		
		for(int i = 0; i < cases; i++)
		{
			int[][] cards1 = new int[4][4];
			int[][] cards2 = new int[4][4];
			
			int answer = in.nextInt();
			
			for(int b = 0; b < 4; b++)
			{
				cards1[b][0] = in.nextInt();
				cards1[b][1] = in.nextInt();
				cards1[b][2] = in.nextInt();
				cards1[b][3] = in.nextInt();
			}
			
			int answer2 = in.nextInt();
			
			for(int b = 0; b < 4; b++)
			{
				cards2[b][0] = in.nextInt();
				cards2[b][1] = in.nextInt();
				cards2[b][2] = in.nextInt();
				cards2[b][3] = in.nextInt();
			}
			
			boolean selected = false;
			
			for(int c = 0; c < 4; c++)
			{
				for(int v = 0; v < 4; v++)
				{
					if(cards1[answer-1][c] == cards2[answer2-1][v])
					{
						if(selected)
							output[i] = "Bad Magician!";
						
						else{
							selected = true;
							output[i] = Integer.toString(cards1[answer-1][c]);
						}
					}
				}
			}
			
			if(!selected)
				output[i] = "Volunteer Cheated!";
		}
		
		for(int a = 0; a < cases; a++)
		{
			System.out.println("Case #" + (a+1) + ": " + output[a]);
		}
	}
}
