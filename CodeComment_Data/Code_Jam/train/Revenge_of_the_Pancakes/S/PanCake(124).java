package methodEmbedding.Revenge_of_the_Pancakes.S.LYD992;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class PanCake {

	public static void main(String[] args) {
	    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	    int t = in.nextInt();  
	    for (int i = 1; i <= t; ++i) {
	    	String stackString = in.next();
	    	// Convert stackString in binary format, 1 represents + and 0 represents -
	    	int[] stackInt = new int[stackString.length()];
	    	
	    	for(int l=0; l<stackString.length(); l++) {
	    		if(stackString.charAt(l) == '+') {
	    			stackInt[l] = 1;
	    		} else {
	    			stackInt[l] = 0;
	    		}
	    	}

	    	int maneuver = 0;
	    	while(true) {
	    		int sumOfStackInt=0;
	    		for(int k:stackInt) {
	    			sumOfStackInt+=k;
	    		}
//		    	System.out.println("**" + Arrays.toString(stackInt));
	    		// If sum is length of string meaning all values are 1 or +
	    		if(sumOfStackInt == stackString.length()) {
	    			System.out.println("Case #" + i + ": " + maneuver); 
	    			break;
	    		}
	    		// replace 0 with all 1 in just next maneuver
	    		if(0 == sumOfStackInt) {
	    			System.out.println("Case #" + i + ": " + (maneuver + 1)); 
	    			break;
	    		}
	    		int startIndex = 0;
	    		// Anytime 0/1 or 1/0 flip takes place, change sub string before flip point.
	    		int prev = startIndex;
	    		for(int l=1; l<stackString.length(); l++) {
	    			if(stackInt[prev] == stackInt[l]) {
	    				prev = l;
	    				continue;
	    			}
	    			int replaceWithPivotVal = stackInt[l];
//	    			System.out.println("Replace with " + replaceWithPivotVal );
	    			for(int k=0; k<l; k++) {
	    				stackInt[k] = replaceWithPivotVal;
	    			}	    		
    				maneuver++;
//			    	System.out.println("After replace**" + Arrays.toString(stackInt));

	    		}
	    		
	    	}
	    }
	    in.close();

	}
}
