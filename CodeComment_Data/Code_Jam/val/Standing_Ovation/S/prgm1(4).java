package methodEmbedding.Standing_Ovation.S.LYD696;

import java.util.*;
import java.io.*;
class prgm1
{
	public static void main(String args[])throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int lines=Integer.parseInt(br.readLine());
		if(lines>1 && lines<101)
		for(int i=0;i<lines;i++)
		{
			String str=br.readLine();
			String words[]=str.split(" ");
			int loop=Integer.parseInt(words[0])+1;
			int total=0,stand=0;
			for(int j=0;j<loop;j++)
			{
				if(total<j)
				{
					stand++;
					total++;
				}
				total+=Integer.parseInt((words[1]).charAt(j) + "");
			}
			System.out.println("case #" + (i+1) + ": " + stand);
		}
	}
}
