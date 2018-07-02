package methodEmbedding.Revenge_of_the_Pancakes.S.LYD741;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class PanCakeFlips {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner((Readable) new BufferedReader(new InputStreamReader(System.in)));
	    int numOfTestCases = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
	    for (int i = 1; i <= numOfTestCases; ++i) {
	    	String panCakes = in.next();
	    	
	    	if(panCakes.length()==1){
	    		if(panCakes.equals("-")){
	    			System.out.println("Case #" + i + ": " + 1);
	    		}else{
	    			System.out.println("Case #" + i + ": " + 0);
	    		}
	    	}else{
	    		int minNoOfFlips=0;
	    		int j=0;
	    		while(j+1<panCakes.length()){
	    			if(panCakes.charAt(j)!=panCakes.charAt(j+1)){
	    				++minNoOfFlips;
	    			}
	    			++j;
	    		}
	    		if(panCakes.charAt(j)=='-'){
	    			++minNoOfFlips;
	    		}
	    		System.out.println("Case #" + i + ": " + minNoOfFlips);
	    	}
	    }
	    
	    

	}

}
