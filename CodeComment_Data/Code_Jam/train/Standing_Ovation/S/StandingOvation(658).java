package methodEmbedding.Standing_Ovation.S.LYD1453;

import java.io.*;
public class StandingOvation {
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int T = Integer.parseInt(line);
		//for each test case
		int max = 0;
		String maxline = "";
		int space = 0;
		int need  = 0;
		int sum = 0;
		int test = 0;
		int posi = -1;
		for( int t = 1 ; t <=T; t++ )
		{
			line = br.readLine();
			int len = line.length();
			//find the space
			for ( int i = 0; i < len; i++)
			{
				char c = line.charAt(i);
				if (c == ' ')
				{
					break;
				}
				maxline += c;
				space = i;
			}
			max = Integer.parseInt(maxline);
			//' '  is @ position space + 1
			//max is the maximum integer
			
			//start reading the Si
			for ( int i = space + 2; i < len; i++ )
			{
				posi++;
				char c = line.charAt(i);
				test = Character.getNumericValue(c);
				if (test == 0)
					continue;
				if ( posi > sum)	//no of people required are less
				{	
					need = need + (posi - sum);
					sum = sum + test + need;
				}
				else
				{
					sum += test;
				}
				//System.out.println("posi = " + posi + " SUM = " + sum + "need = " + need + "test= " +test);
				test = 0;
				
			}
			
			System.out.println("Case #" + t + ": " + need);
			sum = 0;
			need = 0;
			test = 0;
			max = 0;
			posi = -1;
			maxline = "";
		}
	}
}
