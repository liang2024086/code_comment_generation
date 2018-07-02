package methodEmbedding.Revenge_of_the_Pancakes.S.LYD530;

import java.util.*;
import java.io.*;

public class main {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int T = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    
    if(T>=1&&T<=100){
    for (int i = 1; i <= T; ++i) {
    	int x=1;
    	String temp= in.next();
    	StringBuilder N = new StringBuilder(temp);

    	int count=0;
    	int tt=0;
    	while(true)
    	{ tt++;
    		int index=-1;
    		char first =N.charAt(0);
    		if(first=='+')
    			index=N.indexOf("-");
    		else if(first=='-')
    			index=N.indexOf("+");
    		if(index==-1&&first=='-')
    		{
    			count++;
    			break;
    		}
    		else if(index==-1)
    		{
    			break;
    		}
    		if(first=='+')
    		{
    			if(index!=N.length()-1)
    			{
    				if(N.charAt(index+1)=='-')
    				{
    					int newindex=N.substring(index).indexOf('+');
    					if(newindex==-1)
    					{
    						newindex=N.substring(index).length();
    					}
    					index+=newindex-1;
    				}    				
    			}
    		}
    		for(int j=0;j<=index;j++)
    		{
    			if(N.charAt(j)=='+'&&j!=index)
    				N.setCharAt(j,'-');
    			else if(N.charAt(j)=='-')
    				N.setCharAt(j,'+');
    		}
    	count++;
    	if(tt>1000)
    	{

    		System.out.println("break");
    		break;
    	}
    	}
    	
    	System.out.print("Case #"+i+": ");
    	
    		System.out.println(count);
    	 }
    }
  }
}
