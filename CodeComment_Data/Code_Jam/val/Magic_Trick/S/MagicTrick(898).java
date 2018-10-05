package methodEmbedding.Magic_Trick.S.LYD1551;

import java.io.*;
import java.util.*;
public class MagicTrick
{
	static int first[][] = new int[4][4];
	static int sec[][] = new int[4][4];
	public static void main(String[] args) throws Exception
	{
		File file = new File("A-small-attempt0.in");
		BufferedReader  buf = new BufferedReader(new FileReader(file));
		
		int cases = Integer.parseInt(buf.readLine());
		for(int i=1;i<=cases;i++)
		{
			int first_ans=Integer.parseInt(buf.readLine());
			for(int j=0;j<4;j++)
			{
				StringTokenizer tok = new StringTokenizer(buf.readLine());
				for(int k=0;k<4;k++)
				{
					first[j][k] = Integer.parseInt(tok.nextToken());
				}
			}
			int sec_ans = Integer.parseInt(buf.readLine());
			for(int j=0;j<4;j++)
			{
				StringTokenizer tok = new StringTokenizer(buf.readLine());
				for(int k=0;k<4;k++)
				{
					sec[j][k] = Integer.parseInt(tok.nextToken());
				}
			}
			int ans=0;
			int print=0;
			for(int j=0;j<4;j++)
			{
				for(int k=0;k<4;k++)
				{
					if(first[first_ans-1][j] == sec[sec_ans-1][k])
					{
						ans++;
						print=first[first_ans-1][j];
					}
				}
			}
			if(ans == 1)
			{
				System.out.println("Case #"+i+": "+print);
				
			}
			else if(ans == 0)
			{
				System.out.println("Case #"+i+": Volunteer cheated!");
			}
			else
			{
				System.out.println("Case #"+i+": Bad magician!");
			}
		}
		
	}
}
