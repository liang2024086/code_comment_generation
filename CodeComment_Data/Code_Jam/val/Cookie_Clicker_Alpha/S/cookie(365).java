package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1216;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class cookie {
    public static void main(String[] args) {

    	int i=0;
    	int n_case;
    	Double C, F, X;
        Double T, s;
        
        String[] tokens = null;
        String delims = " ";
        
        BufferedReader reader = null;
        PrintWriter pw=null;
        
		try {
	        File file = new File("input2.txt");
            reader = new BufferedReader(new FileReader(file));

            File file_out = new File("output2.txt");
		    FileWriter fw = new FileWriter(file_out, false);
			pw = new PrintWriter(fw);
		     
            String text = null;
            text = reader.readLine();
            n_case = Integer.parseInt(text);
            
            while ( i++ < n_case )
            {
            	text = reader.readLine();
            	tokens = text.split(delims);
            	C = Double.parseDouble(tokens[0]);
            	F = Double.parseDouble(tokens[1]);
            	X = Double.parseDouble(tokens[2]);
            	
            	T=0.0; s=2.0;
            	while (X/s > (C/s + X/(s+F)))
            	{
            		T += C/s;
            		s += F;
            	}
        		T += X/s;
            	
            	pw.printf("Case #"+i+": %1$.7f",T);
            	pw.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }        

		try {
		            if (reader != null)
		                reader.close();
		  			if (pw != null)
		  		        pw.close();
		} catch (IOException e1) { e1.printStackTrace(); };
    }
}
