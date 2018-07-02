package methodEmbedding.Magic_Trick.S.LYD2037;

import java.io.*;
import java.util.*;

public class A 
{

	public static void main(String[] args) throws IOException 
	{

		BufferedReader in = new BufferedReader(new FileReader("A-small.in"));
		
		//BufferedReader in = new BufferedReader(new FileReader("A-large.in"));
		
		PrintWriter out = new PrintWriter(new FileWriter("A-small-out"));
		
		//PrintWriter out = new PrintWriter(new FileWriter("A-large-out"));
		
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//PrintWriter out = new PrintWriter(System.out);
		
		int T = Integer.parseInt(in.readLine());
		int[] v1=new int[4];
		int[] v2=new int[4];
		int match=0;
		int match_int=0;
		for (int i = 1; i <= T; i++) 
		{
			int n = Integer.parseInt(in.readLine());
			
			for(int j=0;j<4;j++)
			{
				String []s=in.readLine().split(" ");
				if(j+1==n)
				{
					for(int x=0;x<4;x++)
						{v1[x]=Integer.parseInt(s[x]);}
				}
			}
			n = Integer.parseInt(in.readLine());
			for(int j=0;j<4;j++)
			{
				String []s=in.readLine().split(" ");
				if(j+1==n)
				{
					for(int x=0;x<4;x++)
						v2[x]=Integer.parseInt(s[x]);
				}			
			}
			for(int x=0;x<4;x++)
			{		
				for(int y=0;y<4;y++)
				{	
					if(v1[x]==v2[y])
					{
						match++;
						match_int=v1[x];
					}
				}
				
			}
			if(match==0)
				out.println("Case #" +i + ": " + "Volunteer cheated!");
			else if(match==1)
				out.println("Case #" +i + ": " + match_int);
			else if(match>1)
				out.println("Case #" +i + ": " + "Bad magician!");
			match=0;
						
		}
		
		out.flush();

	}

}
