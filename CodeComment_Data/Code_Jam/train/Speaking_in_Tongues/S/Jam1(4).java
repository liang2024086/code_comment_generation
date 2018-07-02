package methodEmbedding.Speaking_in_Tongues.S.LYD708;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;


public class Jam1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Map<Character,Character> convertionTable = new HashMap<Character,Character>();
		String outputString = "";
		try {
		      //use buffering, reading one line at a time
		      //FileReader always assumes default encoding is OK!
		      BufferedReader input =  new BufferedReader(new FileReader("Jam1Short"));
		      try {
		        String line = null; //not declared within while loop
		        /*
		        * readLine is a bit quirky :
		        * it returns the content of a line MINUS the newline.
		        * it returns null only for the END of the stream.
		        * it returns an empty String if two newlines appear in a row.
		        */
		        // Read first line
		        line = input.readLine();
		        int lineNumber = 0;
		        Vector<String> solutionList = new Vector<String>();
		        solutionList.add("our language is impossible to understand");
		        solutionList.add("there are twenty six factorial possibilities");
		        solutionList.add("so it is okay if you want to just give up");
		        
		        convertionTable.put('a', 'y');
		        convertionTable.put('o', 'e');
		        convertionTable.put('z', 'q');
		        convertionTable.put('q', 'z');
		        
		        while (( line = input.readLine()) != null){
		        	
		        	// Read character one by one
		        	for (int i = 0; i < line.length(); i++){
		        	    char original = line.charAt(i);
		        	    char decoded = solutionList.get(lineNumber).charAt(i);
		        	    convertionTable.put(original, decoded);
		        	    
		        	}		        	
		        	lineNumber++;
		        	
		        }
		      }
		      finally {
		        input.close();
		      }
		    }
		    catch (IOException ex){
		      ex.printStackTrace();
		    }
		
		
		    try {
			      //use buffering, reading one line at a time
			      //FileReader always assumes default encoding is OK!
			      BufferedReader input =  new BufferedReader(new FileReader("Jam1ShortInput"));
			      
			      try {
			        String line = null; //not declared within while loop
			        
			        // Read first line
			        line = input.readLine();
			        int lineNumber = 0;
			       
			        while (( line = input.readLine()) != null){
			        	
			        	outputString +=  "Case #" + (lineNumber + 1) + ": ";
			        	// Read character one by one
			        	for (int i = 0; i < line.length(); i++){
			        	    
			        	    outputString += convertionTable.get(line.charAt(i));
			        	}		        	
			        	lineNumber++;
			        	outputString += "\n";
			        }
			      }
			      finally {
			        input.close();
			      }
			    }
			    catch (IOException ex){
			      ex.printStackTrace();
			    }
		    
			    
			  //use buffering
			    Writer output = new BufferedWriter(new FileWriter(new File("Jam1ShortOutput")));
			    try {
			      //FileWriter always assumes default encoding is OK!
			      output.write( outputString );
			      System.out.print(outputString);
			    }
			    finally {
			      output.close();
			    }
	}

}
