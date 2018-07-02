package methodEmbedding.Revenge_of_the_Pancakes.S.LYD804;

import java.io.*;
import java.util.*;

public class revengeofthepancakes {


	  public static void main (String [] args) throws IOException {
	    // Use BufferedReader rather than RandomAccessFile; it's much faster
	    BufferedReader f = new BufferedReader(new FileReader("B-small-attempt1.in"));
	                                                  // input file name goes above
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ROpancakes.out")));
	    // Use StringTokenizer vs. readLine/split -- lots faster
	    StringTokenizer st = new StringTokenizer(f.readLine());
							  // Get line, break into tokens
	    
	   //enter program here
	    int cases = Integer.parseInt(st.nextToken());
	    for (int i = 0; i<cases; i++){
	    	st = new StringTokenizer(f.readLine());
	    	String curr = st.nextToken();
	    	int ct = 0;
	    	boolean pos = true;
	    	if (curr.charAt(0)=='-') {ct = 1; pos = false;}
	    	for (int j = 1; j<curr.length(); j++){
	    		if (curr.charAt(j)=='+'){ pos = true;}
	    		else{
	    			if (pos){
	    				ct+=2;
	    			}
	    			pos = false;
	    		}
	    	}
	    	System.out.println("Case #"+(i+1)+": "+ct);
	    	out.println("Case #"+(i+1)+": "+ct);
	    }
	
	    
	    // answer output

    	out.close();	    
	    System.exit(0);                               // don't omit this!
	  }

}
