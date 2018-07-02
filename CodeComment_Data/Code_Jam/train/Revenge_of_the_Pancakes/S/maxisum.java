package methodEmbedding.Revenge_of_the_Pancakes.S.LYD114;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Collection;
import java.lang.Object;
import java.util.Arrays;
import java.lang.Math;
import java.util.*;
 
class maxisum
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int i,j;
        int m;
        for(i=1;i<=t;i++)
        {
        	String s = br.readLine().toString();
        	long fr=0L,ans=0L;
        	int temp =0;
        	if(s.charAt(0)=='+')
        	{
        		temp=1;
	            for(j=1;j<s.length();j++)
	            {
	                  if(temp==1 && s.charAt(j)=='-')
	                  {
	                       temp=0;
	                       fr++;
	                  }
	                  else if(temp==0 && s.charAt(j)=='+')
	                  {
	                       temp=1;
	                  }

	            }
	            ans = 2*fr;
        	}
        	if(s.charAt(0)=='-')
        	{
        		temp=0;
        		fr=1L;
	            for(j=1;j<s.length();j++)
	            {
	                  if(temp==1 && s.charAt(j)=='-')
	                  {
	                       temp=0;
	                       fr++;
	                  }
	                  else if(temp==0 && s.charAt(j)=='+')
	                  {
	                       temp=1;
	                  }

	            }
	            ans = 2*fr-1;
        	}
        	System.out.println("Case #"+i+": "+ans);
        }
    }
} 
