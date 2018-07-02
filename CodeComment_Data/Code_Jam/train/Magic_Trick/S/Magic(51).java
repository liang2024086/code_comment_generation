package methodEmbedding.Magic_Trick.S.LYD1272;

import java.io.*;
import java.util.*;
import java.math.*;
public class Magic
{
	public static int iRow, fRow;
	public static Set<Integer> iSet, fSet;
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		for(int t = 0; t < T; t++)
		{
			//System.out.println(t);
			iSet = new HashSet<Integer>();
			fSet = new HashSet<Integer>();
			
			iRow = input.nextInt();
			for(int i = 0; i < 4; i++)
			{
				for(int j = 0; j < 4; j++)
				{
					//System.out.printf("%d %d\n", i, iRow - 1);
					if(i == iRow - 1)
					{
						iSet.add(input.nextInt());
					}
					else
						input.nextInt();
				}
			}
			//System.out.println(Arrays.toString(iSet.toArray()));
			
			
			fRow = input.nextInt();
			for(int i = 0; i < 4; i++)
			{
				for(int j = 0; j < 4; j++)
				{
					if(i == fRow - 1)
					{
						fSet.add(input.nextInt());
					}
					else
						input.nextInt();
				}
			}
			//System.out.println(Arrays.toString(fSet.toArray()));
			iSet.retainAll(fSet);
			//System.out.println(Arrays.toString(iSet.toArray()));
			System.out.printf("Case #%d: ", t + 1);
			if(iSet.size() == 0)
				System.out.printf("Volunteer cheated!\n");
			else if(iSet.size() == 1)
				System.out.printf("%d\n", iSet.iterator().next());
			else
				System.out.printf("Bad magician!\n");
		}
	}
}
