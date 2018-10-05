package methodEmbedding.Counting_Sheep.S.LYD201;

import java.util.*;
public class sheep
{
	static boolean debug = true;
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		int N = in.nextInt();
		for(int n = 1; n <= N; n++)
		{
			int T = in.nextInt();
			if(T == 0)
			{
				System.out.println("Case #"+n+": INSOMNIA");
				continue;
			}
			int bitmask = 0;
			int its = 0;
			int kT;
			for(kT = T; bitmask != (1 << 10)-1; kT += T)
			{
				for(int temp = kT; temp > 0; temp /= 10)
				{
					bitmask |= (1 << (temp % 10));
				}
				its++;
			}
			System.out.println("Case #"+n+": "+(kT-T));
		}
	}
}
