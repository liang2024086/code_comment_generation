package methodEmbedding.Magic_Trick.S.LYD1678;

import java.util.Scanner;


public class Solution {

	private static int flag = 0;

	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		int choosenNumber = -1;
		int a[][] = new int[4][4];
		int b[][] = new int[4][4];;
		
		int cases = s.nextInt();
		int n = 1;
		while (n <=cases)
		{
			flag = 0;
			int choosenRow1 = s.nextInt();
			for (int i =0; i<4 ; i++)
			{
				for (int j =0; j<4 ; j++)
				{
					a[i][j] = s.nextInt();
				}
			}
			int choosenRow2 = s.nextInt();
			for (int i =0; i<4 ; i++)
			{
				for (int j =0; j<4 ; j++)
				{
					b[i][j] = s.nextInt();
				}
			}
			
			for (int i=0; i<4 ;i++)
			{
				for (int j=0; j<4 ;j++)
				{//System.out.println("Comparing "+ a[choosenRow1-1][i] +" and "+ b[choosenRow2-1][i]);
					if (a[choosenRow1-1][i] == b[choosenRow2-1][j] )
					{
						flag ++;
						choosenNumber = a[choosenRow1-1][i];
					}
				}
			}
			if (flag == 1)
			{
				System.out.println("Case #"+n+": "+choosenNumber);
			}
			else if (flag == 2 || flag == 3 || flag == 4) System.out.println("Case #"+n+": Bad magician!");
			else System.out.println("Case #"+n+": Volunteer cheated!");
			
			n++;
		}
				
	}
}
