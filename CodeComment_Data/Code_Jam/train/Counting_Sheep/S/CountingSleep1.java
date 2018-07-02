package methodEmbedding.Counting_Sheep.S.LYD1010;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CountingSleep1 {
	
	
	
	
	public static void main(String[] args) throws Exception {
		
		String inFile = "A-small-attempt2.in";
		String outFile = "A-small-attempt2.out";
		  Scanner in = new Scanner(new File(inFile));
		  PrintWriter writer = new PrintWriter(outFile);
		    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
		    for (int i = 1; i <= t; ++i) {
		      Integer number ;
		      Map<Integer, String> digitContainer  = new HashMap<Integer, String>();
		    	 
		      int n = in.nextInt();
			      int count = 1;
			      
			      do{
			    	   number = count *n;
			    	 int decimal = number;
			    	  while (decimal > 0) {
			    		  int d = decimal / 10;
			    		  int k = decimal - d * 10;
			    		  decimal = d;
			    		  digitContainer.put(k, "A");
			    		}
			    	  
			    	  count++;
			    	  
			      }while(digitContainer.size()!=10 && number !=0);
			      
			     if(number!=0){
			    	 writer.println("Case #" + i + ": " + number);
			     }else{
			    	 writer.println("Case #" + i + ": " + "INSOMNIA");	
			     }
			      
		      
		     
		    }
		    in.close();
		    writer.close();
	}
}
