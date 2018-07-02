package methodEmbedding.Magic_Trick.S.LYD453;

import java.util.*;

class Magic
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int numCases = sc.nextInt();
		int curCase = 1;

		while(curCase <= numCases)
		{
			Set<Integer> set = new HashSet<Integer>();
			int row = sc.nextInt();
			for(int i = 1; i < 5; ++i)
			{
				for(int j = 0; j < 4; ++j)
				{
					int x = sc.nextInt();
					if (i == row)
						set.add(x);	
				}
			}
			
			row = sc.nextInt();
			int counter = 0;
			int answer = -1;
			for(int i = 1; i < 5; ++i)
			{
				for(int j = 0; j < 4; ++j) 
				{
					//System.out.println("COUNTER: " + counter);
					int curNum = sc.nextInt();
					if (i == row && set.contains(curNum))
					{
						++counter;
						answer = curNum;
					}
				}
			}
			switch (counter)
			{
				case 0: System.out.println("Case #" + curCase + ": Volunteer cheated!");
					break;
				case 1: System.out.println("Case #" + curCase + ": " + answer);
					break;
				default: System.out.println("Case #" + curCase + ": Bad magician!"); 
					break;

			}
			++curCase;
		}
	}
}
			


