package methodEmbedding.Counting_Sheep.S.LYD9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Prob1
{


	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer myTokens = new StringTokenizer(in.readLine());
		
		int T = Integer.parseInt(myTokens.nextToken());
		
		for (int i=0; i<T; i++)
		{
			myTokens = new StringTokenizer(in.readLine());
			
			int x = Integer.parseInt(myTokens.nextToken());
			
			int[] numSoFar = new int[10];
			int myMuls = 1;
			
			if (x == 0)
			{
				System.out.println("Case #" + (i+1) + ": " + "INSOMNIA");
			}
			else
			{
				while (true)
				{
					int temp = myMuls*x;
					while (temp > 0)
					{
						numSoFar[temp%10]++;
						temp = temp/10;
					}
					
					int count = 0;
					for (int j=0; j<10; j++)
					{
						if (numSoFar[j] > 0)
						{
							count++;
						}
					}
					
					if (count == 10)
					{
						System.out.println("Case #" + (i+1) + ": " + myMuls*x);
						break;
					}
					else
					{
						myMuls++;
					}
				}
			}
			
		}
		

	}

}
