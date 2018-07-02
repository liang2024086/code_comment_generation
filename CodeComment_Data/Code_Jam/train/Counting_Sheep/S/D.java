package methodEmbedding.Counting_Sheep.S.LYD922;

import java.util.*;
import java.io.*;
public class D {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();
    for (int i = 1; i <= t; ++i) {
      int k = in.nextInt();
      long ris = k;
      int x = 2;
      String r = "INSOMNIA";
      
      if(ris > 0)
      {
    	  boolean v[] = new boolean[10];
          
          boolean stop = false;
          
          do
          {
        	  stop = true;
        	  
        	  String s = "" + ris;
        	  
        	  for(int j = 0; j < s.length(); j ++)
        	  {
        		  int n = Integer.parseInt(s.charAt(j) + "");
        		  
        		  v[n] = true;
        	  }
        	  
        	  for(int j = 0; j < 10; j ++)
        	  {
        		  if(!v[j])
        		  {
        			  stop = false;
        		  }
        	  }
        	  
        	  
        	  if(!stop)
        	  {
        		  try
            	  {
            		  ris = k * x;
            		  x ++;
            	  }
            	  catch(Exception e)
            	  {
            		  stop = true;
            	  }
        	  }
        	  else
        	  {
        		  r = "" + ris;
        	  }
          }while(!stop);
      }
      
      System.out.println("Case #" + i + ": " + r);
    }
  }
}
