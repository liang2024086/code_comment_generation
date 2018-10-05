package methodEmbedding.Counting_Sheep.S.LYD174;

import java.util.*;

public class sheep
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int numCases = scan.nextInt();

		for (int i = 1; i <= numCases; i++)
		{
			int n = scan.nextInt(); 
			int[] digits = {0,0,0,0,0,0,0,0,0,0};
			boolean done = false; 
			if (n == 0)
			{
				System.out.println("Case #" + i + ": INSOMNIA");
				done = true; 
			}
			int multi = 1; 
			while (!done)
			{
				done = true;
				n = multi*n; 
				int temp = n, temp2 = n;
				while (temp > 0)
				{
					temp = (temp/10)*10; 
					int dig = temp2-temp;
					digits[dig] = 1; 
					temp2 = temp2/10;
					temp = temp/10; 
				}
				for (int j = 0; j < digits.length; j++)
				{
					if (digits[j] == 0)
					{
						done = false; 
					}
				}
				if (done == false)
				{
					n = n/multi; 
					multi++; 
				}
			}
			if (digits[0] != 0)
				System.out.println("Case #" + i + ": " + n);
		}
	}
}
