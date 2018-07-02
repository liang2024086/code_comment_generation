package methodEmbedding.Revenge_of_the_Pancakes.S.LYD310;


import java.util.*;
import java.io.*;

public class QB {
	private static Reader in;
	private static PrintWriter out;
	public static final String NAME = "B-small-attempt0";

	public static void main(String[] args) throws IOException {	
		
		out = new PrintWriter(new BufferedWriter(new FileWriter(NAME + ".out")));
		File file = new File(NAME+".in");
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		    int T = Integer.parseInt(br.readLine());
		    String line;
		    for(int i=0; i<T; i++){
		    	line = br.readLine();
		    	int count = 0;
		    	
		    	int idx = 1;
		    	if(line.charAt(0) == '-'){
		    		count++;
		    		while(idx < line.length() && line.charAt(idx) == '-'){
		    			idx++;
		    		}
		    	}
		    	
		    	while(idx < line.length()){
		    		while(idx < line.length() && line.charAt(idx) == '+'){
		    			idx++;
		    		}

		    		if(idx < line.length()){ count+=2; }
		    			
		    		while(idx < line.length() && line.charAt(idx) == '-'){
		    			idx++;
		    		}
		    	}
		    	out.println("Case #" + (i+1) + ": " + count);
		    }
		    
		}
		
		out.close();
	    System.exit(0);
		
	}
}

