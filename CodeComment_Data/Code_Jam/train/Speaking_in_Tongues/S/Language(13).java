package methodEmbedding.Speaking_in_Tongues.S.LYD346;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Language{

	public static void main (String[] args){

            
	    int X = 0;
	    int testcase = 0;
            int i,len = 0;

	    try{
	      BufferedReader input =  new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
	      FileOutputStream out = new FileOutputStream("output.txt");     
	      String given = " yhesocvxduiglbkrztnwjpfmaq";
          String changed = " abcdefghijklmnopqrstuvwxyz";

	      String line = null;        
	      line = input.readLine();
	      int T = Integer.parseInt(line); // No. of test cases
	  
	      for ( testcase = 0; testcase < T; testcase++){	         
	    	line = input.readLine();
                len = line.length();
	        String temp = "";
                for(i=0;i<len;i++) {
                  temp = temp + given.charAt(changed.indexOf(line.charAt(i)));
                }
	         	                 
	        X = testcase +1;
                out.write(("Case #" + X + ": " + temp + "\n").getBytes());
	        line = null;
                
	      }     // for test case < T
	      
	      input.close();
	      out.close();
	     
	    } catch (Exception e) {
	    	
	    	System.out.println("Exception!" + e.toString());
	    }
	}
		
}
