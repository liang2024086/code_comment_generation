package methodEmbedding.Counting_Sheep.S.LYD1647;

import java.util.*;
import java.io.*;
public class ex1 
{
  public static void main(String[] args) 
  {
	  try
	 {
	    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
	    for (int i = 1; i <= t; ++i) 
	    {
	      String n = in.next();
	      int n_int = Integer.parseInt(n);
	      HashMap<String, String> map = new HashMap<String, String>();
	      int k=1;
	      while(true)
	      {
	    	  //System.out.println(n);
	    	  if(n.equals("0"))
	    	  {
	    		  System.out.println("Case #" + i + ": INSOMNIA");
	    		  break;
	    	  }
	    	  char[] dig = n.toCharArray();
	    	  for(int j=0; j<dig.length; j++)
	    	  {
	    		  map.put(String.valueOf(dig[j]), "");
	    		  
	    	  }
	    	  if(map.size()==10)
	    	  {
	    		  //Case #2: 10
	    		  System.out.println("Case #" + i + ": " + n);
	    		  break;
	    	  }
	    	  k++;
	    	  n=String.valueOf(n_int*k);
	    		  
	      }
	    }
	 }catch(Exception ex)
	 {
		 
	 }
  }
}
