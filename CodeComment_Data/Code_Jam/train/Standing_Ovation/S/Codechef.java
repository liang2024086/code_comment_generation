package methodEmbedding.Standing_Ovation.S.LYD1219;

import java.util.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws Exception
	{
	    int t,l=0;
	    String x;
	    File file=new File("A-small-attempt2.in");
	    Scanner sc=new Scanner(file);
	    t=sc.nextInt();
	      PrintWriter pw =new PrintWriter("outputx.txt","UTF-8");
	    for(int i=1;i<=t;i++)
	    {
	        l=sc.nextInt();
	        x=sc.next();
	        int arr[]=new int[l+1];
	        for(int j=0;j<=l;j++)
	        {
	            arr[j]=(x.charAt(j))-'0';
	            
	        }
	        int c=0,s=0;
	        for(int j=0;j<=l;j++)
	        {
	           
	            if(s<j)
	            {
	                c+=(j-s);
	                s+=(j-s);
	                
	            }
	            s+=arr[j]; 
	        }
	        
	      
	       pw.println("Case #"+i+": "+c); 
	           
	        
	    }
	    pw.close();
	}
}
