package methodEmbedding.Standing_Ovation.S.LYD343;

import java.io.*;
class pract
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()),i,N,j,k,diff,t=T;
		//char c1,c2;
		String s,str[];
		while(T-->0)
		{
			k=0;diff=0;j=0;
			s=br.readLine();
			str=s.split(" ");
			N=Integer.parseInt(str[0]);
			if(N==0)
				j=0;
			else
			{
				for(i=0;i<str[1].length();i++)
				{
					if(i>k)
					{
						diff=i-k;
						if(diff>j)
							j=diff;
					}
					k+=str[1].charAt(i)-48;
				}
			}
			System.out.println("case #"+(t-T)+": "+j);
		}
	}

}
