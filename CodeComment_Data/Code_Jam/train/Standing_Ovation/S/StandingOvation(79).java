package methodEmbedding.Standing_Ovation.S.LYD344;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandingOvation 
{

	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		int testCase = 1;
		while(T-- > 0)
		{
			String[] input = in.readLine().split(" ");
			int sMax = Integer.parseInt(input[0]);
			int shyInt = Integer.parseInt(input[1]);
			int[] shy = new int[sMax+1];
			for(int i = sMax; i >= 0; --i)
			{
				shy[i] = shyInt % 10;
				shyInt /= 10;
			}
			/*for(int i = 0; i <= sMax; ++i)
			{
				System.out.print(shy[i]);
			}*/
			int standing = shy[0];
			//System.out.println();
			int invite = 0;
			for(int i = 1; i <= sMax; ++i)
			{
				
				while(standing < i)
				{
					++invite;
					++standing;
				}
				standing += shy[i];
			}
			System.out.println("Case #" + testCase+": " + invite);
			++testCase;
		}

	}

}
