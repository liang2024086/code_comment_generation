package methodEmbedding.Revenge_of_the_Pancakes.S.LYD374;

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="";
		String s2="";
		int flips=0;
		char lf;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=1;i<=t;i++)
		{
			s=br.readLine();
			flips=0;
			while(true)
			{
				if(s.indexOf('+')==-1)
				{
					flips++;
					break;
				}
				if(s.indexOf('-')==-1)
				{
					break;
				}
				if(s.charAt(0)=='+')
					lf='-';
				else
					lf='+';
				
				for(int k=1;k<s.length();k++)
				{
					if(s.charAt(k)==lf && lf=='+')
					{
						for(int l=0;l<k;l++)
						{
							s2+="+";
						}
						s2+=s.substring(k);
						flips++;
						s=s2;
						s2="";
						break;
					}
					else if(s.charAt(k)==lf && lf=='-')
					{
						for(int l=0;l<k;l++)
						{
							s2+="-";
						}
						s2+=s.substring(k);
						flips++;
						s=s2;
						s2="";
						break;
					}
				}
			}
			System.out.println("Case #"+(i)+": "+flips);
		}
	}
}
