package methodEmbedding.Speaking_in_Tongues.S.LYD1122;

import java.io.*;
import java.util.*;
public class language
{
	public static void main(String[] args)
	{
		String goog1="ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv yeq";
		String reg1= "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up aoz";
		
		char[] mapping=new char[26];
		for(int i=0;i<26;i++)
			mapping[i]='1';
		boolean[] used=new boolean[26];
		for(int i=0;i<goog1.length();i++)
		{
			if(goog1.charAt(i)!=' ')
			{
				mapping[(int)goog1.charAt(i)-97]=reg1.charAt(i);
				used[(int)reg1.charAt(i)-97]=true;
			}
		}
		
		for(int j=0;j<mapping.length;j++)
		{
			if(mapping[j]=='1')
			{
				for(int k=0;k<used.length;k++)
				{
					if(!used[k])
					{
						mapping[j]=(char)(k+97);
					}
				}
			}
		}
		
		for(int j=0;j<mapping.length;j++)
			System.out.println(j+" "+mapping[j]+" "+used[j]);
		
		try
		{
			FileReader fread = new FileReader(new File("A-small-attempt0.in"));
			BufferedReader br = new BufferedReader(fread);
			FileWriter fwrite = new FileWriter(new File("output.txt"));
			PrintWriter pw = new PrintWriter(fwrite);
			int cases = new Integer(br.readLine());
			for (int i = 1; i <= cases; i++)
			{
				pw.print("Case #"+i+": ");
				System.out.print("Case #"+i+": ");
				String line=br.readLine();
				for(int j=0;j<line.length();j++)
				{
					if(line.charAt(j)==' ')
					{
						pw.print(" ");
						System.out.print(" ");
					}
					else
					{
						pw.print(mapping[(int)line.charAt(j)-97]);
						System.out.print(mapping[(int)line.charAt(j)-97]);
					}
				}
				pw.println();
				System.out.println();
			}
			pw.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
