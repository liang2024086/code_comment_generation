package methodEmbedding.Standing_Ovation.S.LYD326;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class StandingOvation {
	public static void main(String [] args) throws FileNotFoundException, IOException {
		  String line;
		  int lineNum = 0;
		  String data [] = new String [2];
		  int lengthInput = 0;
		  try (
		      InputStream fis = new FileInputStream("A-small-attempt2.in");
		      InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
		      BufferedReader br = new BufferedReader(isr);
		      BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
		  ) {
		      while ((line = br.readLine()) != null) {
		    	  data = line.split(" ");
		    	  if (lengthInput == 0){
		    		  lengthInput = Integer.parseInt(data[0]) ;
		    	  } else {
		    		  lineNum++;
		    		  int current = 0;
		    		  int friends  = 0;
		    		  for(int i = 0; i<data[1].length(); i++){
		    			  
		    			  
		    			  if (Character.getNumericValue(data[1].charAt(i)) != 0){
		    				 if(current >= i) {
		    				 } else {
		    					 if (i <= (friends + current)) {
		    						 //already have enough
		    					 } else {
			    					 friends = i - current;
		    					 }
		    				 }
		    			  } 
		    			  current = current + Character.getNumericValue(data[1].charAt(i));
		    		  }
		    		  String output = "Case #" + lineNum + ": " + friends;
		    		  
		    		  out.write(output);
		              out.newLine();
		    		  System.out.println("Case #" + lineNum + ": " + friends );
		    		  
		    	  }
		      }
		  }
		  
	}
}
