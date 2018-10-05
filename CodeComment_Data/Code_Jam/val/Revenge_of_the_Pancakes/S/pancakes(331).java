package methodEmbedding.Revenge_of_the_Pancakes.S.LYD214;


import java.io.*;
import java.util.Scanner;

public class pancakes {
	
	public static void main(String args[]) throws IOException {
	
		
		FileInputStream in = null;
		PrintWriter out = null;

	    try {
	         in = new FileInputStream("B-small-attempt0.in");
	         out = new PrintWriter( "outputB.txt" );
	        	    
	        	    
	         Scanner sc = new Scanner (in);
	         String line = sc.nextLine();
	           
	         int T = Integer.parseInt(line);
	         
	         for(int i=1; i<=T; i++) {
	        	 String pancakes = sc.nextLine() + "+";
	        	 int flip = 0;
	        	 
	        	 for(int index=0; index < pancakes.toCharArray().length-1; index++) {
	        		 if(pancakes.charAt(index) != pancakes.charAt(index+1) )
	        			 flip++;
	        	 }
	        	
	        	 String output = "Case #" + i + ": " + flip;
	        	 out.println( output );
	         }
	         
	     }finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
	}

}
