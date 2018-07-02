package methodEmbedding.Revenge_of_the_Pancakes.S.LYD431;

import java.util.*;
import java.io.*;

public class test2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new BufferedReader(new FileReader("fichier.in")));
	    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
	    for (int i = 1; i <= t; ++i) {
	    String s = in.next();
	      int tmp=1;
	      for(int j=1 ; j<s.length(); j++){
	    	  if(s.charAt(j-1)!=s.charAt(j)){
	    		  tmp++;
	    	  }
	      }
	      if(s.charAt(s.length()-1)=='+'){
	    	  tmp--; 
	      }    
	      System.out.println("Case #"+i+": "+tmp); 	      
		}
	  

	}

	
}
