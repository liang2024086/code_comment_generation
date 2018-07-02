package methodEmbedding.Magic_Trick.S.LYD970;

import java.util.*;

public class CJA
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();
		for(int num = 1; num <= test; num++)
		{
			int row1 = sc.nextInt();

			ArrayList<Integer> fRow = new ArrayList<Integer>();
			for(int i = 0; i < 4; i++)
			{
				for(int j = 0; j < 4; j++)
				{
					if(i == row1-1)
						fRow.add(sc.nextInt());
					else
						sc.nextInt();
				}
			}
			
			int row2 = sc.nextInt();

			ArrayList<Integer> sRow = new ArrayList<Integer>();
			for(int i = 0; i < 4; i++)
			{
				for(int j = 0; j < 4; j++)
				{
					int next = sc.nextInt();
					if(i == row2-1 && fRow.contains(next))
						sRow.add(next);
				}
			}

			System.out.printf("Case #%d: ", num);
			if(sRow.size() > 1)
				System.out.println("Bad magician!");
			else if(sRow.size() == 0)
				System.out.println("Volunteer cheated!");
			else
				System.out.println(sRow.get(0));
		}
	}
}
