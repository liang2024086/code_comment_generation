package methodEmbedding.Magic_Trick.S.LYD2132;

import java.util.Scanner;
import java.io.*;

public class Megician {

	public static void main(String[] args)throws FileNotFoundException{
		
		File f1 = new File("C:\\Users\\ADMIN\\Downloads\\Output.txt");
		Scanner sc = new Scanner(f1);
		int test = sc.nextInt();
		int number[] = new int[test];
		for(int i=0;i<test;i++)
		{
			Megic_Tecnic tech = new Megic_Tecnic();
			int[][][] cards = new int[2][4][4];
			int[] no_row = new int[2];
			for(int a=0;a<2;a++)
			{
				no_row[a] = sc.nextInt()-1;
				for(int j=0;j<4;j++)
				{
					for(int k=0;k<4;k++)
					{	
						cards[a][j][k] = sc.nextInt();
					}
				}
			}
			number[i] = tech.Check_Row(cards[0][no_row[0]], no_row[1], cards[1]);
		}
		for(int i=0;i<test;i++)
		{
			if(number[i]==0)
			{
				System.out.println("Case #"+(i+1)+": Volunteer cheated!");
			}
			else if(number[i] ==100)
			{
				System.out.println("Case #"+(i+1)+": Bad magician!");
			}
			else
			{
				System.out.println("Case #"+(i+1)+": "+number[i]);
			}
		}
		sc.close();
	}
}
