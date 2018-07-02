package methodEmbedding.Revenge_of_the_Pancakes.S.LYD100;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PanCake {

	public static void main(String[] args) {
		
		Scanner in = null;
		try {
			in = new Scanner(new BufferedReader(new FileReader("B-small-attempt0.in")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		PrintWriter out = null;
	    try {
			out = new PrintWriter(new FileWriter("output.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
	    for (int i = 1; i <= t; ++i) {
	    	
	      String n = in.next();
	      
	      int numOfSpins = 0;
	      int top = 0;
	      
	      String[] arr = n.split("");
	      
	      if(arr.length == 1){
	    	  
	    	  if(arr[0].equalsIgnoreCase("+")){
	    		  
			  }else if(arr[0].equalsIgnoreCase("-")){
				  numOfSpins++;
				  arr[0] = "+";
			  }
	    	  
		  }else{
			  
			  
			  for(int j=1 ; j<arr.length ; j++){
		    	  
		    	  if(arr[top].equalsIgnoreCase(arr[j])){
		    		  top++;
		    	  }else{
		    		  numOfSpins++;
		    		  
		    		  //spin array
		    		  for(int k=0 ; k<j ; k++){
		    			  if(arr[k].equalsIgnoreCase("+")){
		    				  arr[k] = "-";
		    			  }else if(arr[k].equalsIgnoreCase("-")){
		    				  arr[k] = "+";
		    			  }
		    		  }
		    		  top++;
		    		  
		    	  }
		    	  
		      }
			  
			  if(arr[0].equalsIgnoreCase("-")){
	    		  numOfSpins++;
	    		  for(int k=0 ; k<arr.length ; k++){
	    			  arr[k] = "+";
	    		  }
	    	  }
			  
		  }
	      
//	      for(int p =0 ; p<arr.length ; p++){
//	    	  System.out.print(arr[p]);
//	      }
	      
	      //System.out.println("no of flips : " + numOfSpins);
	      //System.out.println("Case #" + i + ": " + numOfSpins);
	      out.println("Case #" + i + ": " + numOfSpins); 
	      
	    }
	    
	    in.close();
	    out.close();
	}
}
