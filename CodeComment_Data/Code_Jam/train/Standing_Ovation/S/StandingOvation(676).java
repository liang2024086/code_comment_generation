package methodEmbedding.Standing_Ovation.S.LYD1859;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class StandingOvation {
	public static void main(String[] args) throws IOException
	{
		BufferedReader f = new BufferedReader(new FileReader("test.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		int testCases =  Integer.parseInt(st.nextToken());
		
		for (int t = 0; t < testCases; t++)
		{
			out.print("Case #" + (t + 1) + ": ");
			st = new StringTokenizer(f.readLine());
			int Smax = Integer.parseInt(st.nextToken());
			String people = String.valueOf(st.nextToken());
			int length = people.length();
			int sum = 0;
			int ans = 0;
			for (int i = 0; i < length; i++)
			{
				if (sum < i)
				{
					ans += i - sum;
					sum = i;
				}
				sum += people.charAt(i) - '0';
			}
			
			out.println(ans);
			out.flush();
			
		}
		
		
		
		
		
	}

}
