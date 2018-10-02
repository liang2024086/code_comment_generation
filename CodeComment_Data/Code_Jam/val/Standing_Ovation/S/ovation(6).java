package methodEmbedding.Standing_Ovation.S.LYD752;

/*
ID: akshath
LANG: JAVA
TASK: ovation
*/

import java.io.*;
import java.util.*;

public class ovation {
	public static void main (String [] args) throws IOException {
	    BufferedReader in = new BufferedReader(new FileReader("ovation.in"));
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ovation.out")));
	    StringTokenizer st = new StringTokenizer(in.readLine());
	    
	    int numCases = Integer.parseInt(st.nextToken());
	    int maxShyness, last, ret, total;
	    char[] shyArray;
	    
	    for(int i = 0; i < numCases; i++) {
	    	st = new StringTokenizer(in.readLine());
	    	maxShyness = Integer.parseInt(st.nextToken());
	    	shyArray = st.nextToken().toCharArray();
	    	ret = 0;
	    	total = 0;
	    	
	    	for(int j = 0; j < shyArray.length; j++) {
	    		total += Character.getNumericValue(shyArray[j]);
	    		last = j+1;
	    		if (last < shyArray.length) {
	    			if (Character.getNumericValue(shyArray[last]) != 0 && last > total) {
	    				ret += (last - total);
	    				total += (last - total);
	    			}
	    		} else if(last > total) {
	    			ret += (last - total);
	    		}
	    	}
	    	
	    	out.println("Case #" + (i+1) + ": " + ret);
	    }
	    
	    in.close();
	    out.close();                                
	    System.exit(0);                               
	  }
}
