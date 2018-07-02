package methodEmbedding.Cookie_Clicker_Alpha.S.LYD389;

import java.io.*;
import java.util.*;
class CookieTaannyae
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		String inpt[];
		double prsu1=0.0,su1=0.0,coks1=2.0,c1,f1,x1,lrsu1=0.0;
		for(int i=0;i<t;i++)
		{
			inpt=(br.readLine()).split(" ");
			c1=Double.parseDouble(inpt[0]);
			f1=Double.parseDouble(inpt[1]);
			x1=Double.parseDouble(inpt[2]);

			coks1=2.0;
			prsu1=su1=lrsu1=0.0;

			prsu1=x1/coks1;
			su1=c1/coks1+x1/(f1+coks1);
			lrsu1=c1/coks1;

			while(su1<prsu1)
			{
				prsu1=su1;
				coks1=coks1+f1;
				lrsu1=lrsu1+c1/coks1;
				su1=lrsu1+x1/(coks1+f1);
			}
			System.out.println("Case #"+(i+1)+": "+prsu1);
		}
		System.exit(0);
	}
}
