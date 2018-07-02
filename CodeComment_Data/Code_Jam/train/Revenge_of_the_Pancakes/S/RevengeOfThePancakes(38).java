package methodEmbedding.Revenge_of_the_Pancakes.S.LYD498;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RevengeOfThePancakes {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int numCases = Integer.parseInt(in.readLine());
		for (int caseNumber = 1; caseNumber <= numCases; caseNumber++) {
			String s = in.readLine();
			int count=0;
			char t = s.charAt(0);
			for(int i=1;i<s.length();i++)
			{
				if(t==s.charAt(i))
				{
					continue;
				}
				else
				{
					count++;
					t=s.charAt(i);
				}
			}
			if(t=='-')
				count++;
			System.out.println("Case #" + caseNumber + ": " + count);
		}

	}

}
