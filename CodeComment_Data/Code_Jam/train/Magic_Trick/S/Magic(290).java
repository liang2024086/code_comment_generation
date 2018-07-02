package methodEmbedding.Magic_Trick.S.LYD1288;

import java.util.*;

public class Magic
{
	public static void main(String[] args)
	{
		String out = "";
		int ans = 0;
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();

		for (int i = 1; i <= count; i++)
		{
			int c = 0;
			int[] arr = new int[4];

			int one = input.nextInt();
			
			for (int k = 0; k < 4; k++)
			{
				boolean flag = false;
				if (k == one-1)
				{
					flag = true;
				}

				for (int j = 0; j < 4; j++)
				{
					int a = input.nextInt();
					if (flag == true)
					{
						arr[j] = a;
					}
				}
			}

			int two = input.nextInt();
			int[] arr1 = new int[4];
			
			for (int k = 0; k < 4; k++)
			{
				boolean flag = false;
				if (k == two-1)
				{
					flag = true;
				}

				for (int j = 0; j < 4; j++)
				{
					int a = input.nextInt();
					if (flag == true)
					{
						for (int jk = 0; jk < 4; jk++)
						{
							if (arr[jk] == a)
							{
								ans = a;
								++c;
								break;
							}
						}
					}
				}
			}
			if (c == 1)
			{

				out = out + "Case #" + i + ": " + ans + '\n';
			}
			else if (c > 1)
			{
				// System.out.println(c);
				out = out + "Case #" + i + ": " + "Bad magician!" + '\n';
			}
			else
			{
				out = out + "Case #" + i + ": " + "Volunteer cheated!" + '\n';	
			}
		}
		System.out.println(out);
	}
}
