package methodEmbedding.Counting_Sheep.S.LYD208;

import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int c;
		
		boolean[] arr = new boolean[10];
		
		for (int i = 0; i < n; i++)
		{
			Arrays.fill(arr, false);
			c = 0;
			
			long x = in.nextLong();
			
			if (x == 0L)
			{
				System.out.printf("Case #%d: INSOMNIA\n", i + 1);
				continue;
			}
			
			long j = 0L, y = x;
			do
			{
				y = (j + 1L) * x;
				while (y > 0L)
				{
					int z = (int)(y % 10L);
					if (arr[z] == false)
					{
						arr[z] = true;
						c++;
					}
					y /= 10L;
				}
				j++;
			} while (c < 10);
			
			System.out.printf("Case #%d: %d\n", i + 1, j * x);
		}
		
	}
	
	
}
