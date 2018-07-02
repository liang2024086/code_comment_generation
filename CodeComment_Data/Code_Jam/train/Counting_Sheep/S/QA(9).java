package methodEmbedding.Counting_Sheep.S.LYD1213;


import java.util.*;
import java.io.*;

public class QA {
	private static Reader in;
	private static PrintWriter out;
	public static final String NAME = "A-small-attempt0";

	public static void main(String[] args) throws IOException {	
		
		out = new PrintWriter(new BufferedWriter(new FileWriter(NAME + ".out")));
		File file = new File(NAME+".in");
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		    int T = Integer.parseInt(br.readLine());
		    String line;
		    for(int i=0; i<T; i++){
		    	line = br.readLine();
		    	int n = Integer.parseInt(line);
		    	
		    	if(n == 0){ 
		    		out.println("Case #" + (i+1) + ": INSOMNIA");
		    	}else{
		    		Set<Integer> s = new HashSet<>();
		    		int tmp = 0;
		    		int currNo = 0;
		    		while(s.size() < 10){
		    			tmp = (currNo += n);
		    			while(tmp > 0){
		    				s.add(tmp%10);
		    				tmp/=10;
		    			}
		    		}
		    		
		    		out.println("Case #" + (i+1) + ": " + currNo);
		    	}
		    }
		    
		}
		
		out.close();
	    System.exit(0);
		
	}
}

