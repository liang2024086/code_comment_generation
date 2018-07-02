package methodEmbedding.Cookie_Clicker_Alpha.S.LYD759;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class CookieClickerAlpha {
	public static void main(String[] arrrg) {
		try {
		    BufferedReader in = new BufferedReader(new FileReader("in.txt"));
		    BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
		    String line = in.readLine();
		    int cases = Integer.parseInt(line);
		    for (int caseNum =1; caseNum<=cases; caseNum++) {
		    	line = in.readLine();
		    	String[] cfx = line.split(" ");
		    	double c = new Double(cfx[0]);
		    	double f = new Double(cfx[1]);
		    	double x = new Double(cfx[2]);
		    	
		    	double rate = 2.0;
		    	
		    	double answer = x/rate;
		    	double timeElapsed = 0.0;
		    	
		    	while ((c/rate + x/(rate+f))<answer) {
		    		timeElapsed+=c/rate;
		    		rate = rate+f;
		    		answer = x/rate;
		    	}
		    	answer+=timeElapsed;
		    	
		    	out.write("Case #"+caseNum+": "+answer+"\n");
		    	
		    }
		    
		    out.flush();
		    out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
