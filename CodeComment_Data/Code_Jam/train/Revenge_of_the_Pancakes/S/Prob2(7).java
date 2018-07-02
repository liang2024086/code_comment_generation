package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1112;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Prob2
{


	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer myTokens = new StringTokenizer(in.readLine());
		
		int N = Integer.parseInt(myTokens.nextToken());
		
		for (int i=0; i<N; i++)
		{
			myTokens = new StringTokenizer(in.readLine());
			
			String faces = myTokens.nextToken();
			
			int numFlips = 0;
			int myLen = faces.length();
			int[] plate = new int[myLen];
			
			for (int j=0; j<myLen; j++)
			{
				if (faces.charAt(j) == '-')
				{
					plate[myLen-j-1] = 0;
				}
				else
				{
					plate[myLen-j-1] = 1;
				}
			}
			
			while (true)
			{
				int numHappy = 0;
				for (int k=0; k<myLen; k++)
				{
					if (plate[k] == 1)
					{
						numHappy++;
					}
				}
				if (numHappy == myLen)
				{
					break;
				}
				
				for (int a=0; a<myLen; a++)
				{
					if (plate[a]==0)
					{
						plate[a] = 1;
						numFlips++;
						
						for (int b=a+1; b<myLen; b++)
						{
							if (plate[b] == 0)
							{
								plate[b] = 1;
							}
							else
							{
								plate[b] = 0;
							}
						}
						
						break;
					}
				}
			}
			
			System.out.println("Case #" + (i+1) + ": " + numFlips);
		}
		

	}

}
