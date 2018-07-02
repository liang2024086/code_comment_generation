package methodEmbedding.Revenge_of_the_Pancakes.S.LYD802;


import java.util.*;
import java.io.*;
public class B  {
	public static void main(String[] args) {
	    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	    int cases = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
	    for (int c = 1; c <= cases; ++c) {
	    	String s = in.next();
	    	char currentChar = '\0';
	    	int steps = 0;
	    	for (int i=0; i<s.length(); i++){
	    		if (currentChar != s.charAt(i)){
	    			steps +=1;
	    			currentChar = s.charAt(i);
	    		}
	    	}
	    	if (s.charAt(s.length()-1) == '+')
	    		steps -=1;
	    	System.out.println("Case #" + c + ": "+steps);
	    }
  }
}
