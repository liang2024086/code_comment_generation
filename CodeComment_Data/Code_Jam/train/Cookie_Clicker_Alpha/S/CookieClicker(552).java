package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1302;

import java.io.*;
import java.util.*;
class CookieClicker
{
	public static void main(String arg[])throws IOException
	{
		String ip[];
		double prsu=0.0,su=0.0,coks=2.0,c,f,x,lrsu=0.0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++)
		{
			ip=(br.readLine()).split(" ");
			c=Double.parseDouble(ip[0]);
			f=Double.parseDouble(ip[1]);
			x=Double.parseDouble(ip[2]);

			coks=2.0;
			prsu=su=lrsu=0.0;

			prsu=x/coks;
			su=c/coks+x/(f+coks);
			lrsu=c/coks;
			while(su<prsu)
			{
				prsu=su;
				coks=coks+f;
				lrsu=lrsu+c/coks;
				su=lrsu+x/(coks+f);
			}
			System.out.println("Case #"+(i+1)+": "+prsu);
		}
		System.exit(0);
	}
}
