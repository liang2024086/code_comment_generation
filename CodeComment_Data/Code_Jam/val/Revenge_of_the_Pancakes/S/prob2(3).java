package methodEmbedding.Revenge_of_the_Pancakes.S.LYD865;


import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Stack;
import java.io.BufferedReader;
import java.io.File;

public class prob2 {

	
	public static void main(String[] args) {
		
		
		 File inputFile = new File("B-small-attempt0.in");
		  BufferedReader br = null;
		  StringBuilder output = new StringBuilder();
		  PrintWriter pr = null;
		  
		  try {
			  br = new BufferedReader(new FileReader(inputFile));    
		      int numberoOfTest = Integer.parseInt(br.readLine());
		      
		      for(int i = 1; i <= numberoOfTest; i++) {
		    	  output.append("Case #" + i + ": ");
		    	  String dataset = br.readLine(); 
		    	  Stack<Character> dataStack = new Stack<Character>();
		    	  int steps = 0;
		    	  for(int j = 0; j < dataset.length(); j++) {
		    		  if(j == 0)
		    			  dataStack.push(dataset.charAt(j));
		    		  else
		    			  if(dataset.charAt(j) == dataStack.peek()) {
		    				  dataStack.push(dataset.charAt(j));
		    			  }
		    			  else {
		    				  steps++;
		    				  dataStack.push(dataset.charAt(j));
		    			  }
		    	  }
		    	  if(dataStack != null && !dataStack.isEmpty()
		    			  && dataStack.peek() == '-') {
		    		  steps++;
		    	  }
		    	  output.append(steps);
		    	  output.append("\n");
		      }
		      
		      
		      pr = new PrintWriter(new File("Pancakes-Output.out"));
		      pr.print(output);        

		  }
		  catch (Exception e) {
			// TODO: handle exception
		}
	 finally {
		if(pr != null) {
			pr.close();
		}
	} 

	}
	
}
