package methodEmbedding.Counting_Sheep.S.LYD820;

import java.util.*;

class JAM
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 1; i <= num; i++)
		{
			int n = sc.nextInt();
			int temp = n;
			int mul = 2;
			int temp1= 0;
			int answer = 0;
			boolean flag = true;
			int count[] = new int[10];
			int visited[] = new int[10];
			int k =0;
			for(int j = 0; j < 10; j++)
			{
				count[j] = 0;
			}
			if(n == 0)
			{
				System.out.println("Case #" + i + ": INSOMNIA");
				continue;
			}
			while(flag)
			{
				answer = temp;
				while(temp > 0)
				{
					temp1 = temp % 10;
					count[temp1] = 1;
					temp = temp/10;
				}
				for(k = 0; k < 10; k++)
				{
					if(count[k] == 0)
					{
						break;
					}
				}
				if(k == 10)
				{
					flag =false;
				}
				else
				{
					flag =true;
				}
				temp = mul * n;
				mul++;	
			}
			System.out.println("Case #" + i + ": " + answer);	
		}
	}

}
