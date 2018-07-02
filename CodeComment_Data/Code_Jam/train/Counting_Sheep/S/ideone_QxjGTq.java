package methodEmbedding.Counting_Sheep.S.LYD1101;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc=new Scanner(System.in);
		long t=sc.nextLong();
		for(long k=1;k<=t;k++)
		{
		    long n=sc.nextLong();
		    long f=n,i=1,g=n;
		    Set s=new HashSet();
		    if(n==0)
		    System.out.println("Case #"+k+": INSOMNIA");
		    else
		    {
		    while(s.size()!=10)
		    {
		        f=i*n;
		        g=f;
		        while(f>0 && s.size()!=10)
		        {
		            s.add(f%10);
		            f=f/10;
		           
		        }
		        i++;
		    }
		    System.out.println("Case #"+k+": "+g);
		    }
		    
		}
		
	}
}
