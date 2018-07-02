package methodEmbedding.Revenge_of_the_Pancakes.S.LYD920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RevengeofthePancakes 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader ip = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(ip.readLine());
		String stack;
		char pastState;
		char currState;
		for(int i =1; i<=testCases; i++)
		{
			stack = ip.readLine();
			int flips =0;
			pastState = stack.charAt(0);
			currState = stack.charAt(0);
			for(int index=1; index < stack.length(); index++)
			{
				currState = stack.charAt(index);
				if(currState != pastState)
					flips++;
				pastState = currState;
			}
			if(pastState =='-')
				flips++;;
			System.out.println("Case #" + i + ": " +flips );
		}
	}
}
