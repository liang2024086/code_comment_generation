package methodEmbedding.Revenge_of_the_Pancakes.S.LYD113;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class RevengeOfPancakes {
	public static void main(String[] args) {
	    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
	    for (int i = 1; i <= t; ++i) {
	      String pancakes = in.next();
	      StringBuilder result = new StringBuilder("");
	      char prev=' ';
	      for(int j=0;j<pancakes.length();j++){
	    	  char cur = pancakes.charAt(j);
	    	  if(cur!=prev){
	    		  if(cur=='+')
	    			  result.append("1");
	    		  else
	    			  result.append("0");	
	    	  }
	    	  prev=cur;
	      }
	      if(result.charAt(result.length()-1)=='1')
	    	  System.out.println("Case #" + i + ": "+ (result.length()-1));
	      else
	    	  System.out.println("Case #" + i + ": "+ result.length());
	    }
	 }
}
