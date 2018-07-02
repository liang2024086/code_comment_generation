package methodEmbedding.Revenge_of_the_Pancakes.S.LYD277;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class B {
	  public static void main(String[] args) {
		    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
		    for (int i = 1; i <= t; ++i) {
		      String line = in.next();
		      
		      int changes = 0;
		      char current = line.charAt(0);
		      for (char c : line.toCharArray()) {
		    	  if (c != current) {
		    		  current = c;
		    		  changes++;
		    	  }
		      }
		      if (line.charAt(line.length()-1) == '-') {
		    	  changes++;
		      }
		      
		      System.out.println("Case #" + i + ": " + changes);
		    }
		    
		    
		    in.close();
		  }

}
