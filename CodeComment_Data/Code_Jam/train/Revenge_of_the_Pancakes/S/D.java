package methodEmbedding.Revenge_of_the_Pancakes.S.LYD636;

import java.util.*;
import java.io.*;
public class D {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();
    for (int i = 1; i <= t; ++i) {
      long r = 0;
      
      String s = in.next();
      
      for(int j = s.length() - 1; j >= 0; j --)
      {
    	  if(s.charAt(j) == '-')
    	  {
    		  r ++;
    		  
    		  String q = "";
    		  
    		  for(int x = 0; x <= j; x ++)
    		  {
    			  if(s.charAt(x) == '+') q += "-";
    			  else q += "+";
    		  }
    		  
    		  s = q + s.substring(j + 1, s.length());
    	  }
      }
      
      System.out.println("Case #" + i + ": " + r);
    }
  }
}
