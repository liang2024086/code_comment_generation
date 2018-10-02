package methodEmbedding.Counting_Sheep.S.LYD446;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class CountingSheep {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner((Readable) new BufferedReader(new InputStreamReader(System.in)));
	    int numOfTestCases = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
	    for (int i = 1; i <= numOfTestCases; ++i) {
	      
	      int testCase = in.nextInt();
	      //0
	      if(testCase==0){
	    	  //int n = in.nextInt();
		      //int m = in.nextInt();
		      System.out.println("Case #" + i + ": " +"INSOMNIA");
	      }
	      else{
	    	  int digitsToFind=10;
		      int[] digitsFound = new int[10];
		      int temp=testCase;
		      while(temp>0){
		    	  if(digitsFound[temp%10]==0){
		    		  digitsFound[temp%10]=1;
		    		  --digitsToFind;
		    	  }
		    	  temp=temp/10;
		      }
		      int j=1;
		      int temp1=testCase;
		      while(digitsToFind>0){
		    	  ++j;
		    	  temp1=j*testCase;
		    	  while(temp1>0){
		    	  	if(digitsFound[temp1%10]==0){
		    		  	digitsFound[temp1%10]=1;
		    		  	--digitsToFind;
		    	  	}
		    	  	temp1=temp1/10;
		    	  }
		     	 
		      }
		      System.out.println("Case #" + i + ": " +(j*testCase));
	      	}
	      
	    }	
	       
	}

}
