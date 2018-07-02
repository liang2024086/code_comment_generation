package methodEmbedding.Counting_Sheep.S.LYD1246;

import java.util.*;
import java.io.*;
class Sheep
{
	public static void main(String args[])
	{
		int n,m,d,j;
		int a[] = new int[10];
		try{
		Scanner sc = new Scanner(new File("A-small-attempt0 (1).in"));
		System.setOut(new PrintStream(new File("output1.txt")));
		
		int t = sc.nextInt();
		for(int i=1;i<=t;i++)
		{
			for(int k=0;k<a.length;k++)
			a[k] = -1;
			
			n = sc.nextInt();
			m=n;
			if(n==0)
				System.out.println("Case #"+i+": INSOMNIA");
			else
			{
				j=1;
				while(a[0]!=0 || a[1]!=1 || a[2]!=2 || a[3]!=3 || a[4]!=4 || a[5]!=5 || a[6]!=6 || a[7]!=7 || a[8]!=8 || a[9]!=9)
				{
			//		System.out.println("hello");
					m=n;
					m=m*j;
					j++;
			//		System.out.println("m="+m+"n="+n+"j="+j);
					while(m!=0)
					{
						d = m%10;
						m = m/10;
						a[d] = d;
					}
			//		for(int k=0;k<a.length;k++)
			//			System.out.println("a["+k+"] = "+a[k]);
			//		m=n;
			//		j++;
			//		m = m*j;
				}
				j--;
				System.out.println("Case #"+i+": "+(j*n));
				
			}	
		
			
		}
		}
		catch(Exception e)
		{}
	}
}
