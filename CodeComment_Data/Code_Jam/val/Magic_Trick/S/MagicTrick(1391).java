package methodEmbedding.Magic_Trick.S.LYD1279;

import java.io.*;
import java.util.*;

public class MagicTrick
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("C:\\inputs\\A-small-attempt2.in"));
		PrintWriter out = new PrintWriter(new FileWriter("MagicTrick.out"));
		int test = Integer.parseInt(br.readLine());
		for(int m=0;m<test;m++)
		{
			byte ans1 = Byte.parseByte(br.readLine());
			int check1[] = new int[4];
			for(byte i=0;i<4;i++)
			{
				StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
				for(byte j=0;j<4;j++)
				{
					if((i+1)==ans1)
						check1[j]=Integer.parseInt(st1.nextToken());
				}
			}

			byte ans2 = Byte.parseByte(br.readLine());
			Integer check2[] = new Integer[4];
			for(byte i=0;i<4;i++)
			{
				StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
				for(byte j=0;j<4;j++)
				{
					if((i+1)==ans2)
					{
						check2[j]=Integer.parseInt(st2.nextToken());
					}
				}
			}
			int count=0;
			int ans=0;
			for(byte k=0;k<4;k++)
				if(Arrays.asList(check2).contains(check1[k]))
				{
					++count;
					if(count==1)
						ans=check1[k];
				}

			if(count==4||count==2||count==3)
				out.println("Case #"+(m+1)+": Bad magician!");
			if(count==1)
				out.println("Case #"+(m+1)+": "+ans);
			if(count==0)
				out.println("Case #"+(m+1)+": Volunteer cheated!");
		}

		out.close();
	}
}
