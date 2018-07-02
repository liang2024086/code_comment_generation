package methodEmbedding.Speaking_in_Tongues.S.LYD1425;

import java.io.*;

class A
{
	public static void main(String args[])throws Exception
	{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		String ip="ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jvqz";
		String rs="our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give upzq";
		int T=Integer.parseInt(x.readLine());
		int j=0;
		while(j++ < T)
		{
			String a =x.readLine();
			String b="";
			for(int i=0;i<a.length();i++)
			{
				b=b+rs.charAt(ip.indexOf(a.charAt(i)));
			}
			System.out.println("Case #"+j+": "+b);
		}
	}
}
