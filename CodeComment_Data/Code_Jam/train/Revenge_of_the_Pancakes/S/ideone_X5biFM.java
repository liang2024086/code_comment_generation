package methodEmbedding.Revenge_of_the_Pancakes.S.LYD147;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		DataInputStream in = new DataInputStream(System.in);
		int n;
		String s;
		n= Integer.parseInt(in.readLine());
		for(int t=1;t<=n;t++)
		{
			int count=0;
			s=in.readLine();
			int l= s.length();
			if(l==1)
			{
				if(s.equals("+"))
					System.out.println("Case #"+t+": "+count);
				else
					System.out.println("Case #"+t+": "+1);
				
				continue;
			}
			for(int i=0;i<l;i++)
			{
				char ch=s.charAt(i);
				i++;
				while(i<l && ch==s.charAt(i)){
					i++;
				}
				if(i<l)
				{
					if(s.charAt(i-1)=='-')
					{
						s=s.substring(0,i).replace('-','+')+s.substring(i);
						//System.out.println(s);
						count++;
					}
					else
					{
						s=s.substring(0,i).replace('+','-')+s.substring(i);
						//System.out.println(s);
						count++;
					}
					i=i-1;
				}
				else
				{
					if(s.charAt(i-1)=='-')
					{
						s=s.substring(0,i).replace('-','+')+s.substring(i);
						//System.out.println(s);
						count++;
					}
				}
			}
			System.out.println("Case #"+t+": "+count);
		}
	}
}
