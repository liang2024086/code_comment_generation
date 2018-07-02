package methodEmbedding.Standing_Ovation.S.LYD1360;

import java.util.*;
public class a {
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	int T = input.nextInt();
	for(int t = 0; t<T; t++)
	{
		int max = input.nextInt();
		int[] counts = new int[max+1];
		String s = input.next();
		for(int i = 0; i<max+1; i++)
		{
			counts[i] = s.charAt(i) - '0';
		}
		int res = 0;
		int count = 0;
		for(int i = 0; i<=max; i++)
		{
			if(count < i)
			{
				res += i - count;
				count = i;
			}
			count += counts[i];
		}
		System.out.println("Case #" + (t+1)+": "+res);
	}
}
}
