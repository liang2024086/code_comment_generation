package methodEmbedding.Revenge_of_the_Pancakes.S.LYD247;



import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		long cp=0,l;
		while(t-->0)
		{
		    cp++;
		    String s;long c=0;
		    s = sc.next();
		    for(int i =0;i<s.length()-1;i++)
		    {
		        if(s.charAt(i)!=s.charAt(i+1))
		        c++;
		    }
		    if(s.charAt(s.length()-1)=='-')
		    c++;
		    System.out.println("case #"+cp+": "+c);
		    
		    
		}
	}
}
