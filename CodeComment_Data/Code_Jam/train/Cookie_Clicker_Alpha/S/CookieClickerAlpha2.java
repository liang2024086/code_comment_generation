package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1155;

import java.util.*;
import java.io.*;
public class CookieClickerAlpha2
{
	public static void main(String args[])throws IOException
	{
		Scanner sc = new Scanner(new File("CCA_s.in"));
		PrintWriter pw = new PrintWriter(new FileWriter("CCA_s.out"));
		int T=sc.nextInt();
		double C,F,X,time,check,t;
		int n,j;
		for(int i=1;i<=T;i++)
		{
			time=0;
			C=sc.nextDouble();
			F=sc.nextDouble();
			X=sc.nextDouble();
			for(t=2;;t+=F)
			{
				check=C/t+X/(t+F)-X/t;
				if(check<0)
					time+=(C/t);
				else
					break;
			}
			time+=(X/t);
			pw.println("Case #"+i+": "+time);
		}
		sc.close();
		pw.close();
	}
}
