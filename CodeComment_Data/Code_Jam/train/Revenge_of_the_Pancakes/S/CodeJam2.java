package methodEmbedding.Revenge_of_the_Pancakes.S.LYD585;


import java.util.*;
import java.lang.*;
import java.io.*;

class CodeJam2
{
	public static void main(String [] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int lp=0;lp<t;lp++)
		{
			String s=sc.next();
			int cnt=0;
			int n=s.length();
			StringBuffer sb=new StringBuffer(s);
			for(int i=0;;i++)
			{
				char ch=sb.charAt(0);
				int j=0;
				for(j=1;j<n;j++)
				{
					char c=sb.charAt(j);
					if(c!=ch)
					{
						cnt++;
						String z="";
						if(ch=='-')
						for(int k=0;k<j;k++)
							z=z+'+';
						else
						for(int k=0;k<j;k++)
							z=z+'-';
						sb.replace(0,j,z);
						break;
					}
				}
				if(j==n)
				{
					if(ch=='-')
						cnt++;
					break;
				}		
			}
			System.out.println("Case #"+(lp+1)+": "+cnt);
		}
			
	}	
}
