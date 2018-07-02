package methodEmbedding.Magic_Trick.S.LYD231;

import java.util.Scanner;
import java.io.*;
public class Q1 
{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("A-small-attempt0.in"));
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++)
		{
			int count = 0;
			int match = 0;
			int a1 = scan.nextInt();
			int[][] a = new int[4][4];
			for (int x = 0; x < 4; x++)
			{
				for (int y = 0; y < 4; y++)
				{
					a[x][y] = scan.nextInt();
				}
			}

			int a2 = scan.nextInt();
			int[][] b = new int[4][4];
			for (int x = 0; x < 4; x++)
			{
				for (int y = 0; y < 4; y++)
				{
					b[x][y] = scan.nextInt();
				}
			}

				for (int temp = 0; temp < 4; temp ++)
				{
						for (int temp1 = 0; temp1 < 4; temp1 ++)
						{
							if (a[a1 - 1][temp] == b[a2 - 1][temp1])							{
								if (count == 0)
								{
									match = a[a1 - 1][temp];
								}
								
								count ++;
							}				
						}
				}
				if (count == 0)
				{
					System.out.println("Case #" + (i + 1) + ": Volunteer cheated!");
				}
				else if (count == 1)
				{
					System.out.println("Case #" + (i + 1) + ": " + match);
				}
				else if (count > 1)
				{
					System.out.println("Case #" + (i + 1) + ": Bad magician!");
				}

		}
	}
}
