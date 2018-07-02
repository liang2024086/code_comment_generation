package methodEmbedding.Magic_Trick.S.LYD92;

import java.util.ArrayList;
import java.util.Scanner;


public class MagicTrick {
	
	public static void main(String[] args)
	{
		Scanner a = new Scanner(System.in);
		
		int T = a.nextInt();
		
		for (int i = 0; i < T; i++)
		{
			int line1 = a.nextInt();
			
			int[][] firstSet = new int[4][4];
			
			for (int j = 0; j < 4; j++)
			{
				for (int k = 0; k < 4; k++)
				{
					firstSet[j][k] = a.nextInt();
				}
			}
			
			int line2 = a.nextInt();
			
			int[][] secondSet = new int[4][4];
			
			for (int j = 0; j < 4; j++)
			{
				for (int k = 0; k < 4; k++)
				{
					secondSet[j][k] = a.nextInt();
				}
			}
			
			ArrayList<Integer> list1 = new ArrayList<Integer>();
			for (int o : firstSet[line1 - 1])
			{
				list1.add(o);
			}

			ArrayList<Integer> list2 = new ArrayList<Integer>();
			for (int o : secondSet[line2 - 1])
			{
				list2.add(o);
			}
			
			ArrayList<Integer> finalList = new ArrayList<Integer>();
			for (Integer foo : list1)
			{
				for (Integer bar : list2)
				{
					if (foo == bar)
					{
						if (finalList.contains(bar) == false)
						{
							finalList.add(bar);
						}
					}
				}
			}
			
			if (finalList.size() == 0)
			{
				System.out.println("Case #" + (i+1) + ": Volunteer cheated!");
			}
			else if (finalList.size() == 1)
			{
				System.out.println("Case #" + (i+1) + ": " + finalList.get(0));
			}
			else
			{
				System.out.println("Case #" + (i+1) + ": Bad magician!");
			}
		}
	}
}
