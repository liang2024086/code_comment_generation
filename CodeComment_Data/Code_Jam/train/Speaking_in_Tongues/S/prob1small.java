package methodEmbedding.Speaking_in_Tongues.S.LYD208;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class prob1small {

	
	public static void main(String[] args) {
		
		
	    
	    BufferedReader in;
	    String line;
	    PrintWriter out;
	   
	    // Inputting File.
		try {
			in = new BufferedReader(new FileReader("C:\\Users\\imumair\\Desktop\\A-small-attempt0.in"));
			
			
			int i = Integer.parseInt( in.readLine() );
			ArrayList<String> outputlist = new ArrayList<String>();

			Hashtable<String, String> mapp = new Hashtable<String, String>();
			
			mapp.put("y", "a");
			mapp.put("n", "b");
			mapp.put("f", "c");
			mapp.put("i", "d");
			mapp.put("c", "e");
			mapp.put("w", "f");
			mapp.put("l", "g");
			mapp.put("b", "h");
			mapp.put("k", "i");
			mapp.put("u", "j");
			mapp.put("o", "k");
			mapp.put("m", "l");
			mapp.put("x", "m");
			mapp.put("s", "n");
			mapp.put("e", "o");
			mapp.put("v", "p");
			mapp.put("z", "q");
			mapp.put("p", "r");
			mapp.put("d", "s");
			mapp.put("r", "t");
			mapp.put("j", "u");
			mapp.put("g", "v");
			mapp.put("t", "w");
			mapp.put("h", "x");
			mapp.put("a", "y");
			mapp.put("q", "z");
			mapp.put(" ", " ");
			
			String outstring = "";
			
			String initstring = "" ;
			
		    int count = 1 ; 
		    
		    
			
			while(in.ready() && count <= i){
				
				initstring = "Case #" + count+": " ;
				
				try {
					line = in.readLine();
					
					
					outstring = "";
					
					for(int j = 0; j<line.length(); j++){
						
						outstring = outstring.concat(mapp.get(Character.toString(line.charAt(j))));
					
						
					}
					
					outstring = initstring+outstring;
					
					//System.out.println(outstring);
					outputlist.add(outstring);
					
					//System.out.println(line);
					
							
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("readline fails!!");
				}
				
				count++;
				
			}
				
			in.close();
			
			
			//Outputting File.
			
            out = new PrintWriter(new FileWriter("C:\\Users\\imumair\\Desktop\\A-small-output.out"));
			if(i >0){
				int k;
				for (k = 0; k < i ; k++){
					out.println(outputlist.get(k));
				}
			}else{
				out.println("");
			}
				
				
			out.close();			
			
			
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Ready Input fails.");
		}
		
	
		
	}

}
