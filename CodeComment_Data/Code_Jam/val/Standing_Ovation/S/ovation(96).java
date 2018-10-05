package methodEmbedding.Standing_Ovation.S.LYD318;

import java.io.*;
import java.util.*;


public class ovation {
	
	public static void main (String args[]) throws IOException
	{
		BufferedReader cin  = new BufferedReader(new FileReader("c:\\input.txt"));
		//BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter cout = new PrintWriter("c:\\users\\johng_000\\output.txt");
		StringTokenizer sT = new StringTokenizer(cin.readLine());
		int T = Integer.parseInt(sT.nextToken());
		for (int count = 0; count < T; count++)
		{
			sT = new StringTokenizer(cin.readLine());
			int max = Integer.parseInt(sT.nextToken());
			String s = sT.nextToken();
			int [] people = new int [max + 1];
			//int [] standing = new int [max + 1];
			for (int i = 0; i < s.length(); i++)
			{
				people[i] = Integer.parseInt(s.substring(i, i + 1));
			}
			int numStanding = 0;
			int numNeeded = 0;
			for (int i = 0; i < s.length(); i++)
			{
				if (numStanding >= i)
					numStanding += people[i];
				else
				{
					numNeeded += i - numStanding;
					numStanding += i - numStanding + people[i];
				}
			}
			cout.println("Case #" + (count + 1) + ": " + numNeeded);
		}
		cout.close();
	}
}
