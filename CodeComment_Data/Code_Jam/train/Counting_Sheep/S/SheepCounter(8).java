package methodEmbedding.Counting_Sheep.S.LYD836;

import java.io.*;

public class SheepCounter {

	public static void main(String args[])throws IOException
	{
		int i,numTestCases,j,N,flag,num,digit,fin=0,mult =1;
		int set[] = new int[10];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		numTestCases = Integer.parseInt(br.readLine());
		
		int[] input= new int[numTestCases];
		
		for(i = 0; i< numTestCases; i++)
		{
			input[i]= Integer.parseInt(br.readLine());
		}
		i=0;
		while(i < numTestCases)
		{
			for(j=0;j<10;j++)
			{
				set[j]=0;
			}
			N = input[i];
	
			flag = 0;
			mult =1;
			while(N != 0 && flag != 1)
			{
				
				num = N;
	
				while(num != 0)
				{
					digit = num % 10;
					set[digit]=1;
					num = num / 10;
				}
				for(int k = 0; k < 10; k++)
				{
					if(set[k]==0)
					{
						flag=0;
						break;
					}
					else
					{
						flag =1;
						fin = N;
					}
				
				}
				if(flag != 1)
				{
					N = input[i] * mult;
				}
				mult++;
			}
			if(input[i] != 0)
			{
				System.out.println("Case #"+(i+1)+": "+fin);
		
			}
			else
			{
				System.out.println("Case #"+(i+1)+": INSOMNIA");
			}
			i++;
		}
	}
}
