package methodEmbedding.Magic_Trick.S.LYD988;

import java.util.Scanner;

public class A
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);

		int tc = in.nextInt();

		for(int t = 1 ; t <= tc ; t++)
		{
			int first = in.nextInt() - 1;
			int [][] b1 = new int[4][4];
			for(int i = 0 ; i < 4 ; i++)
				for(int j = 0 ; j < 4 ; j++)
					b1[i][j] = in.nextInt();

			int second = in.nextInt() - 1;
			int [][] b2 = new int[4][4];
			for(int i = 0 ; i < 4 ; i++)
				for(int j = 0 ; j < 4 ; j++)
					b2[i][j] = in.nextInt();


			int res = 0;
			int val = -1;
			for(int i = 0 ; i < 4 ; i++)
				for(int j = 0 ; j < 4 ; j++)
				{
					if(b1[first][i] == b2[second][j])
					{
						res++;
						val = b1[first][i];
					}
				}

			System.out.print("Case #"+t+": ");
			if(res == 1)
				System.out.println(val);
			else if(res > 1)
				System.out.println("Bad magician!");
			else
				System.out.println("Volunteer cheated!");
		}
	}
}
