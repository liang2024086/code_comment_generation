package methodEmbedding.Magic_Trick.S.LYD833;

import java.util.Scanner;


public class MagicTrick
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		int rows = 4;
		int cols = 4;
		int tests = input.nextInt();
		int firstSet[] = new int[4];
		int secondSet[] = new int[4];
		int inRow;
		int count;
		int card = 0;
		
		for(int i = 1; i <= tests; i++)
		{
			count = 0;
			inRow = input.nextInt() - 1;
			//Read in first row -- dont care about ones that arent in the row
			for(int y = 0; y < rows; y++)
			{
				for(int x = 0; x < cols; x++)
				{
					if(y == inRow)
						firstSet[x] = input.nextInt();
					else
						input.nextInt();
				}
			}
			
			inRow = input.nextInt() - 1;
			//Read in second row -- dont care about ones that arent in the row
			for(int y = 0; y < rows; y++)
			{
				for(int x = 0; x < cols; x++)
				{
					if(y == inRow)
						secondSet[x] = input.nextInt();
					else
						input.nextInt();
				}
			}
			
			for(int x = 0; x < cols; x++)
			{
				for(int y = 0; y < cols; y++)
				{
					if(firstSet[x] == secondSet[y])
					{
						card = firstSet[x];
						count++;
					}
				}
			}
			
			System.out.print("Case #" + i + ": ");
			if(count == 0)
				System.out.print("Volunteer cheated!");
			else if(count == 1)
				System.out.print(card);
			else
				System.out.print("Bad magician!");
			
			if(i != tests)
				System.out.println();//new line
		}
	}
}
