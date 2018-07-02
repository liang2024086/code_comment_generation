package methodEmbedding.Revenge_of_the_Pancakes.S.LYD866;

/* Andy Rock
 * April 8, 2016
 * 
 * Qualification Round 2016: Problem B. Revenge of the Pancakes
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class B
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in  = new BufferedReader(new FileReader( "in.txt"));
		BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));

		int T = Integer.parseInt(in.readLine());
		for(int t=1;t<=T;t++)
		{
			char[] S = in.readLine().toCharArray();

			int ans = 0;
			for(int i=1;i<S.length;i++)
				if(S[i] != S[i-1])
					ans++;
			if(S[S.length-1] == '-')
				ans++;

			out.write("Case #"+t+": "+ans+"\n");
		}

		 in.close();
		out.close();
	}
}
