package methodEmbedding.Cookie_Clicker_Alpha.S.LYD590;

import java.util.*;
import java.io.*;
public class cookie
{
	public static void main(String[]args)throws FileNotFoundException
	{
		//File Input
		FileInputStream fin = new FileInputStream("B-small-attempt0.in");
		Scanner sc = new Scanner(fin);
		
		//File Output
		FileOutputStream fout = new FileOutputStream("cookie.out");
		PrintStream ps=new PrintStream(fout);
		
		int t,i;
		
		double c,f,x,r=2,tm,nsp=0,tc,tx,tx1;
		t=sc.nextInt();
		for(i=1;i<=t;i++)
		{
			r=2;
			nsp=0;
			tm=0;
			c=sc.nextDouble();
			f=sc.nextDouble();
			x=sc.nextDouble();
			while(true)
			{
				tc=c/r;
				tx=x/r;
				if(tx<=tc)
				{
					tm+=tx;
					ps.println("Case #"+i+": "+tm);
					break;
				}				
				else
				{										
					r+=f;
					tx1=x/r;
					if((tx1+tc)<tx)
						tm+=tc;
					else
					{
						tm+=tx;
						ps.println("Case #"+i+": "+tm);
						break;
					}					
				}
			}
		}
	}
}
			
			
		
		
