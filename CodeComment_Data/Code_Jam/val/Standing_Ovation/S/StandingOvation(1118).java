package methodEmbedding.Standing_Ovation.S.LYD1606;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class StandingOvation
{

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner in = new Scanner (new File ("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter ("ovationoutput");
		int T = in.nextInt();
		for (int test=1; test<=T; test++)
		{
	
			int S = in.nextInt();
			String audience = in.next();
			int total =0;
			int added=0;
			for (int i=0; i<= S; i++)
			{
				int Si = audience.charAt(i)-'0';
				if (Si>0 && i>total)
				{
					added+=i-total;
					total+=i-total;
				}
				total+=Si;
			}
			out.println("Case #"+test+": "+added);
		}
		in.close();
		out.close();
		
	}

}
