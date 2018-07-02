package methodEmbedding.Standing_Ovation.S.LYD1727;

import java.util.*;
import java.io.*;

public class StandingOvation
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new BufferedReader(new FileReader("A-small.in")));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("A-small.out")));

		
		int t = in.nextInt();
		int tmp;
		for (int i = 1; i <= t; i++)
		{
			int n = in.nextInt() +1;
			int frd=0;
			String s=in.next();
			int sum=0;
			int aud;
			for(int j=0;j<n;j++)
			{
				aud=(int)(s.charAt(j)-'0');
				if(sum>=j)
					sum+=aud;
				else
				{
					tmp=(j-sum);
					frd+=tmp;
					sum+=tmp+aud;
				}

			}
			out.println("Case #" + i + ": "+frd);
			
		}
		out.flush();
		out.close();
	}
}
