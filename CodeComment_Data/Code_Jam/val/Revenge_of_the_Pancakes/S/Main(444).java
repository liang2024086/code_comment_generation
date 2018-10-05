package methodEmbedding.Revenge_of_the_Pancakes.S.LYD197;

import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt(); in.nextLine();
		
		
		boolean[] flag = new boolean[10];
		
		for (int i = 0; i < n; i++)
		{
			Arrays.fill(flag, false);
			String prob = in.nextLine();
			for (int j = 0; j < prob.length(); j++)
			{
				if (prob.charAt(j) == '+')
				{
					flag[j] = true;
				}
			}
			// System.err.printf("%d: %s\n", i + 1, prob);
			int len = prob.length() - 1;
			int count = 0;
			
			for (;;)
			{
				// System.err.println(Arrays.toString(flag));
				while (len >= 0 && flag[len])
				{
					len--;
				}
				if (len < 0)
				{
					break;
				}
				count++;
				if (flag[0])
				{
					count++;
					while (len >= 0 && !flag[len])
					{
						len--;
					}
					if (len < 0)
					{
						break;
					}
				}
				else
				{
					// change
					int k = len;
					for (int j = 0; j <= k; j++)
					{
						boolean t = flag[j];
						flag[j] = !flag[k];
						flag[k] = !t;
						k--;
					}
					
				}
			}
			System.out.printf("Case #%d: %d\n", i + 1, count);
			
		}
		
	}
	
	
}
