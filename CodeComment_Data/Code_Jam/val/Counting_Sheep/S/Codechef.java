package methodEmbedding.Counting_Sheep.S.LYD951;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
	     int x=1;
		while(x<=t)
		{
		    	Map<Character,Integer> map=new HashMap<>();
		    long n=sc.nextLong();
		    if(n==0)
		    {
	
		        System.out.println("Case #"+x+": INSOMNIA");
		        	        x++;
		        continue;
		    }
		   
		   
		    int count=0;
		    long temp=0;
		   
		    for(int j=1;count<10;j++)
		    {
		         temp=j*n;
		         String s=Long.toString(temp);
		         int i=0;
		         while(i<s.length())
		    {
		        if(map.get(s.charAt(i))==null)
		        {
		            count++;
		            map.put(s.charAt(i),1);
		        }
		        i++;
		        if(count==10)
		         break;
		    }
		    }
		    System.out.println("Case #"+x+": "+temp);
		    x++;
		    
		}
	}
}

