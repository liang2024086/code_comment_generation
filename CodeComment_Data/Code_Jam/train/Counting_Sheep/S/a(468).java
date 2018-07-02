package methodEmbedding.Counting_Sheep.S.LYD475;

import java.util.*;
import java.io.*;

public class a {
	  public static void main(String ... blue) throws Exception
	    {
	       Scanner input = new Scanner(System.in);
	       float numCases = input.nextFloat();
			//System.out.println("total cases"+numCases);
		    for (int n = 0; n < numCases; n++)
		    {
		    	int N=input.nextInt();
		    	if(N==0)
		    	{
		    		System.out.println("Case #"+(n+1)+": INSOMNIA");//INSOMNIA occurs only in N=0
		    	}
		    	else
		    	{
		    		ArrayList<String> al=new ArrayList<String>();
		    		int count=0;
		    		while(al.size()<10)
		    		{
		    			count++;
		    			int M=count*N;
		    			String s=""+M;
		    			char[] ch=s.toCharArray();
		    			
		    			for(int i=0;i<ch.length;i++)
		    			{
		    				boolean b=false;
			    			for(String sal : al)
			    			{
			    				if(sal.equals(""+ch[i]))
			    				{
			    					b=true;
			    					break;
			    				}
			    			}
			    			if(!b)
			    			{
			    				al.add(""+ch[i]);
			    			}
		    			}
		    		}
		    		int M=count*N;
		    		System.out.println("Case #"+(n+1)+": "+M);
		    	}
		    }
		}
}
