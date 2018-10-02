package methodEmbedding.Cookie_Clicker_Alpha.S.LYD458;

import java.text.*;
import java.util.*;
import java.io.*;

public class Program
{
	public static void main(String[] args)throws Exception
	{
		int T, k;
		double C, F, X;
		double s, r, t;

		Scanner sc=new Scanner(new File("B-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new FileWriter("B-small-attempt0.out"));
		DecimalFormat df=new DecimalFormat("0.0000000");

		T=sc.nextInt();
		for(k=1;k<=T;k++)
		{
			C=sc.nextDouble();
			F=sc.nextDouble();
			X=sc.nextDouble();

			s=0;
			r=2;
			while(true)
			{
				if((s+(X/r))<(s+(C/r)+(X/(r+F))))
				{
					s+=(X/r);
					break;
				}
				else
				{
					s+=(C/r);
					r+=F;
				}
			}
			out.println("Case #"+k+": "+df.format(s));
		}

		out.close();
	}
}
