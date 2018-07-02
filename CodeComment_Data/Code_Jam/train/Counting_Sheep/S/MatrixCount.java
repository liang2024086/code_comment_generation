package methodEmbedding.Counting_Sheep.S.LYD1072;

import java.util.Scanner;


public class MatrixCount
{
	public static void main (String args[])
	{
		char digits[] = new char[10];
		int check = 0;
		int count = 0;
		int j = 0;
		Scanner ip = new Scanner(System.in);
		int inputSize = ip.nextInt();
		for (int i = 1; i <= inputSize; i++)
		{
			int input = ip.nextInt();
			j = 0;
			for(int kk = 0 ; kk< 10; kk++)
			{
				digits[kk] = '0';
			}
			count = 0;
			for (int mul = 0; mul < 200; mul++)
			{
				int k = input * mul;
				while (k != 0)
				{
					digits[k%10] = '1';
					k=k/10;
					count = 0;
					for(check = 0; check < 10; check++)
					{
						if(digits[check] == '1')
						{
							count++;
						}
					}
				}
				if (count == 10)
				{
					System.out.println("Case #" + i + ": " + input*mul);
					j=1;
					break;
				}
			}
			if (j != 1)
			{
				for(check = 0; check < 10; check++)
				{
					if(digits[check] == '1')
					{
						count++;
					}
				}
				if (count != 10)
				{
					System.out.println("Case #" + i + ": " + "INSOMNIA");
				}
			}
		}
	}

}
