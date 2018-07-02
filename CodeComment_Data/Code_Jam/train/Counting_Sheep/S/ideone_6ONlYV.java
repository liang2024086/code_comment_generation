package methodEmbedding.Counting_Sheep.S.LYD1285;

import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc=new Scanner(System.in);
		long t=sc.nextLong();
		for(long k=1;k<=t;k++)
		{
		    long n=sc.nextLong();
		    long f=n,i=1,g=n;
		    Set h=new HashSet();
		    if(n==0)
		    System.out.println("Case #"+k+": INSOMNIA");
		    else
		    {
		    while(h.size()!=10)
		    {
		        f=i*n;
		        g=f;
		        while(f>0 && h.size()!=10)
		        {
		            h.add(f%10);
		            f=f/10;
 
		        }
		        i++;
		    }
		    System.out.println("Case #"+k+": "+g);
		    }
 
		}
	}
}
