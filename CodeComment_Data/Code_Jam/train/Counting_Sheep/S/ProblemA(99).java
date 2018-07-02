package methodEmbedding.Counting_Sheep.S.LYD1546;

import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		for(int c = 0; c < cases; c++)
		{
			int num = -1;
			int N = input.nextInt();
			if(N != 0)
			{
				int digs[] = new int[10];
				int times = 0;
				boolean notDone = true;
				int temp = N;
				while(notDone)
				{
					notDone = false;
					int temp2 = temp;
					while(temp2 > 0)
					{
						int rem = temp2 % 10;
						digs[rem] = 1;
						temp2 /= 10;
					}
					for(int iter = 0; iter < digs.length; iter++)
					{
						if(digs[iter] == 0)
						{
							notDone = true;
							break;
						}
					}
					temp += N;
					times++;
				}
				num = times * N;
			}
			if(num > -1)
				System.out.println("Case #" + (c+1) + ": " + num);
			else
				System.out.println("Case #" + (c+1) + ": INSOMNIA");
		}
	}

}
