package methodEmbedding.Counting_Sheep.S.LYD191;

import java.util.*;
import java.io.*;
public class digits {
  public static void main(String[] args) throws java.io.IOException{
	 // Scanner in = new Scanner(System.in);
	  Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	  //System.out.println("1");
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    for (int i = 1; i <= t; ++i) {
    	//System.out.println("2");
      int m = in.nextInt();
      if(m==0)
      {
    	  System.out.println("Case #" + i + ": INSOMNIA");
      }
      else
      {
    	  //System.out.println("3");
    	  int check = 0;
    	  int length = (int)(Math.log10(m)+1);
    	  //System.out.println(length);
    	  boolean[] tracker = new boolean[10];
    	  for(int j=0; j<10;j++){
    		  tracker[j]=false;
    	  }
    	  int current = m;
    	  int base= m;
    	  int n=0;
    	  int currentCheck;
    	  do {
    		  n++;
    		  m=base*n;
    		  length = (int)(Math.log10(m)+1);
    		  for(int j =1; j<= length; j++)
    		  {
    			  //System.out.println(m+ " " + check);
    			  currentCheck = m%10;
    			  if(tracker[currentCheck]!=true)
    			  {
    				  tracker[currentCheck]=true;
    				  check++;
    			  }
    			  m=m/10;
    			  
    		  }
    		  
    		  //System.out.println(m+ " " + check);
    		  
    	  }while (check != 10);
    	  System.out.println("Case #" + i + ": "+ base*n);
      }
    }
  }
}
