package methodEmbedding.Cookie_Clicker_Alpha.S.LYD141;

import java.io.*;
import java.util.*;
class ProblemB
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		double ps=0.0,s=0.0,cook=2.0,c,f,x,ls=0.0;
		String in[];
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++)
		{
			in=(br.readLine()).split(" ");
			c=Double.parseDouble(in[0]);
			f=Double.parseDouble(in[1]);
			x=Double.parseDouble(in[2]);

			cook=2.0;
			ps=s=ls=0.0;

			ps=x/cook;
			s=c/cook+x/(f+cook);
			ls=c/cook;
			while(s<ps)
			{
				ps=s;
				cook=cook+f;
				ls=ls+c/cook;
				s=ls+x/(cook+f);
			}
			System.out.println("Case #"+(i+1)+": "+ps);
		}
		System.exit(0);
	}
}
