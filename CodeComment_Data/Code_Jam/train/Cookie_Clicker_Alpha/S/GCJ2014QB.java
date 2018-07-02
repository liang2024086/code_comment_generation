package methodEmbedding.Cookie_Clicker_Alpha.S.LYD925;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import com.sun.org.apache.regexp.internal.recompile;

public class GCJ2014QB {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("B-small-attempt0.in")));
	    int caseCount = Integer.parseInt(in.readLine());
	    for (int i = 0 ; i < caseCount ;i ++){
	    	String[] vals = in.readLine().split("\\s");
	    	double c = Double.parseDouble(vals[0]);
	    	double f = Double.parseDouble(vals[1]);
	    	double x = Double.parseDouble(vals[2]);
	    	double n = Math.ceil(((x*f - 2*c)/(c*f)) - 1);
	    	double s = 0;
	    	double r = 2;
//	    	System.out.print(n+" ");
	    	for (long j = 0; j < n; j++) {
	    		s += c / r; 
				r += f;
			}
	    	s += x / r;
	    	System.out.println("Case #"+(i+1)+": "+s);
	    	
	    }
	}

}
