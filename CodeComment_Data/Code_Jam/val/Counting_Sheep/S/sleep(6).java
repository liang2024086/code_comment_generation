package methodEmbedding.Counting_Sheep.S.LYD758;

import java.util.*;
import java.io.*;
public class sleep {
  public static void main(String[] args) {
    Scanner in;
	try {
		in = new Scanner(new BufferedReader(new FileReader("A-small-practice.in")));
		int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
	    for (int i = 1; i <= t; ++i) {
	      int n = in.nextInt(), multi = 1, cn = n;
	      int print;
	      HashSet<Integer> set = new HashSet<>();
	      if(n == 0) {
	    	  System.out.println("Case #" + i + ": " + "INSOMNIA");
	      }
	      else{
	    	  while(set.size() < 10){
	    		  int tmp = cn;
	    		  while(tmp > 0){
	    			  set.add(tmp%10);
	    			  tmp/=10;
	    		  }
	    		  multi+=1;
	    		  cn = n*multi;
	    	  }
	    	  print = cn-n;
	    	  System.out.println("Case #" + i + ": " + (print) );

	      }
	      
	    }
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
  }
}
