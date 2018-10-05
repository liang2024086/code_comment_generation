package methodEmbedding.Magic_Trick.S.LYD690;

import java.util.*;

public class MagicTrick
{
	static int numRows = 4;

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int numTests = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < numTests; i++)
		{
			int row1 = scan.nextInt();
			scan.nextLine();

			Set<Integer> firstSet = new HashSet<Integer>();
			for(int j = 1; j <= numRows; j++)
			{
				if (j == row1)
				{
					for (int k = 0; k < 4; k++)
					{
						firstSet.add(scan.nextInt());
					}
				}
				scan.nextLine();
			}
			//System.out.println("row1: " + row1 + "\n" + firstSet.toString());

			int row2 = scan.nextInt();
			scan.nextLine();

			Set<Integer> secondSet = new HashSet<Integer>();
			for(int j = 1; j <= numRows; j++)
			{
				if (j == row2)
				{
					for (int k = 0; k < 4; k++)
					{
						secondSet.add(scan.nextInt());
					}
				}
				scan.nextLine();
			}
			
			//System.out.println("row2: " + row2 + "\n" + secondSet.toString());
			//System.out.println("intersection: " + firstSet.toString());
			System.out.printf("Case #%d: ", i+1);
			firstSet.retainAll(secondSet);
			switch(firstSet.size()) {
				case 0:
					System.out.println("Volunteer cheated!");
				break;
				case 1:
					System.out.println(firstSet.toArray()[0]);
				break;
				default:
					System.out.println("Bad magician!");
				break;
			}
		}
	}
}

