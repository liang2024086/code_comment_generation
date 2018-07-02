package methodEmbedding.Cookie_Clicker_Alpha.S.LYD516;

import java.io.*;
import java.util.*;
class CookieSunny
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String it[];
		double pvsm=0.0,sm=0.0,ciks=2.0,c,f,x,lvsm=0.0;
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++)
		{
			ciks=2.0;
			pvsm=sm=lvsm=0.0;
			it=(br.readLine()).split(" ");
			c=Double.parseDouble(it[0]);
			f=Double.parseDouble(it[1]);
			x=Double.parseDouble(it[2]);

			pvsm=x/ciks;
			sm=c/ciks+x/(f+ciks);
			lvsm=c/ciks;
			while(sm<pvsm)
			{
				ciks=ciks+f;
				pvsm=sm;
				lvsm=lvsm+c/ciks;
				sm=lvsm+x/(ciks+f);
			}
			System.out.println("Case #"+(i+1)+": "+pvsm);
		}
		System.exit(0);
	}
}
