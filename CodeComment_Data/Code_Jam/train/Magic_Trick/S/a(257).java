package methodEmbedding.Magic_Trick.S.LYD963;

import java.util.HashSet;
import java.util.Scanner;


public class a {
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		for (int z = 1; z <= t; z++)
		{
			int n = in.nextInt() - 1;
			HashSet<Integer> valid = new HashSet<Integer>();
			for (int i = 0; i < 4; i++)
			{
				if (i != n)
					for (int j = 0; j < 4; j++)
						in.nextInt();
				else
					for (int j = 0; j < 4; j++)
						valid.add(in.nextInt());
			}
			
			n = in.nextInt() - 1;
			int same = 0;
			int ret = 0;
			
			for (int i = 0; i < 4; i++)
			{
				if (i != n)
					for (int j = 0; j < 4; j++)
						in.nextInt();
				else
					for (int j = 0; j < 4; j++)
					{
						int cur = in.nextInt();
						if (valid.contains(cur))
						{
							same++;
							ret = cur;
						}
					}
			}
			
			System.out.printf("Case #%d: ", z);
			if (same == 0)
				System.out.println("Volunteer cheated!");
			else if (same == 1)
				System.out.println(ret);
			else
				System.out.println("Bad magician!");
		}
	}

}
