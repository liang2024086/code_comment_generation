package methodEmbedding.Standing_Ovation.S.LYD716;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class StandingO
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer myTokens = new StringTokenizer(in.readLine());
		
		int T = Integer.parseInt(myTokens.nextToken());
		
		//read input
		for (int numCase=1; numCase<=T; numCase++)
		{
			myTokens = new StringTokenizer(in.readLine());
			
			int maxShy = Integer.parseInt(myTokens.nextToken());
			
			int currentStand = 0;
			int numNeeded = 0;
			
			String shyLev = myTokens.nextToken();
			char[] myLevels = shyLev.toCharArray();
			
			for (int i=0; i<(maxShy+1); i++)
			{
				if (currentStand < i)
				{
					int toBeAdded = i - currentStand;
					numNeeded += toBeAdded;
					currentStand += toBeAdded;
				}
				
				currentStand += myLevels[i] - 48;
			}
			
			System.out.println("Case #" + numCase + ": " + numNeeded);
			
		}
		

	}

}
