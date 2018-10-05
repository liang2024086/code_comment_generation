package methodEmbedding.Standing_Ovation.S.LYD1913;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StandingOvation {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
	    int N = in.nextInt();			// No. of Test Cases
	    
	    for (int i=1; i<=N; i++) {
	    	int max = in.nextInt();
	    	String level = in.next();	    	
	    	int invite = 0;
	    	
	    	if (max == 0)
	    		invite = 0;
	    	
	    	else {	    	
			    for (int j=1; j<=max; j++) {
			    	int now = Integer.parseInt(Character.toString(level.charAt(j)));
			    	if ( now != 0 ) {
			    		// front
			    		int total = 0;
			    		for (int k=0; k<=j-1; k++) {
					    	int now2 = Integer.parseInt(Character.toString(level.charAt(k)));
				    			total += now2;
			    		}
			    		
			    		if ( total + invite < j ) {
				    		invite += j - total;
			    		}
			    	}
			    }
	    	}
    		
		    System.out.println("Case #" + i + ": " + invite);
	    }
	}
    
}
