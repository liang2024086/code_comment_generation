package methodEmbedding.Revenge_of_the_Pancakes.S.LYD184;

import java.util.*;
import java.io.*;

class Solution
{
	static String filename= "output.txt";
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
       int t=in.nextInt();
       for(int k=1;k<=t;k++)
       {
       		String s=in.next();
       		int l=s.length();
       		//int frst=1,last=0;
       		int count=0;
       		int i=0;
       		boolean went=false;
       		boolean all=false;
       		while(s.charAt(i)=='-')
       		{
       			went=true;
       			i++;
       			if(i>=l)
       				{
       					all=true;
       					break;
       				}	
       		}
       		if(went)count++;
       		while(i<l)
       		{    			
       			
       			while(i<l && s.charAt(i)!='-')
       			{
       				i++;
       			}
       			//System.out.println("i=="+i);
       			while(i<l && s.charAt(i)!='+')
				{
					i++;
				}

       			if(i<l)count+=2;
       			
       		}

       		if(l!=1 && i==l && s.charAt(l-1)=='-' && all==false)count+=2;

       		System.out.println("Case #"+k+": "+count);

       }
    }
}       
       		
