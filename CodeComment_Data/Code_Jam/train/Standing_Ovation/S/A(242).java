package methodEmbedding.Standing_Ovation.S.LYD1283;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class A {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int numCases = Integer.parseInt(r.readLine());
		
		for(int numC = 0; numC < numCases; ++numC)
		{
			String l = r.readLine();
			StringTokenizer t = new StringTokenizer(l);
			int n = Integer.parseInt(t.nextToken());
			char[] s = t.nextToken().toCharArray();
			int[] real = new int[n+1];
			for(int i = 0; i < n+1; ++i)
			{
				real[i] = Integer.parseInt(String.valueOf(s[i]));
			}
			
			for(int numAdded = 0; numAdded < n+2; ++numAdded)
			{
				int numClapping = real[0];
				boolean valid = true;
			
				for(int i = 1; i < n+1; ++i)
				{
					if(real[i] > 0)
					{
						if(numClapping >= i)
						{
							numClapping += real[i];
						}else
						{
							valid = false;
							break;
						}
					}
				}
				
				if(valid)
				{
					System.out.print("Case #");
					System.out.print(numC+1);
					System.out.print(": ");
					System.out.println(numAdded);
					break;
				}
				
				real[0]++;
			}
			
		}
		

	}

}
