package methodEmbedding.Speaking_in_Tongues.S.LYD260;

import java.io.*;
public class SpeakingInTongues {
	public static void main(String[] args) {
		String[] result;
		try {
			FileWriter fout = new FileWriter("A-small-attempt0.out");
		    BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
		    BufferedWriter out = new BufferedWriter(fout);
		    
		    int T = Integer.parseInt(in.readLine());
		    result = new String[T];
		    
		    for(int i=0; i<T; i++)
		    {
		    	
		    	String cur = in.readLine();
		    	System.out.println("Before: " + cur);
		    	result[i] = cur.toUpperCase();
		    	result[i] = result[i].replaceAll("A", "y");
		    	result[i] = result[i].replaceAll("B", "h");
		    	result[i] = result[i].replaceAll("C", "e");
		    	result[i] = result[i].replaceAll("D", "s");
		    	result[i] = result[i].replaceAll("E", "o");
		    	result[i] = result[i].replaceAll("F", "c");
		    	result[i] = result[i].replaceAll("G", "v");
		    	result[i] = result[i].replaceAll("H", "x");
		    	result[i] = result[i].replaceAll("I", "d");
		    	result[i] = result[i].replaceAll("J", "u");
		    	
		    	result[i] = result[i].replaceAll("K", "i");
		    	result[i] = result[i].replaceAll("L", "g");
		    	result[i] = result[i].replaceAll("M", "l");
		    	result[i] = result[i].replaceAll("N", "b");
		    	result[i] = result[i].replaceAll("O", "k");
		    	result[i] = result[i].replaceAll("P", "r");
		    	result[i] = result[i].replaceAll("Q", "z");
		    	result[i] = result[i].replaceAll("R", "t");
		    	result[i] = result[i].replaceAll("S", "n");
		    	result[i] = result[i].replaceAll("T", "w");
		    	
		    	result[i] = result[i].replaceAll("U", "j");
		    	result[i] = result[i].replaceAll("V", "p");
		    	result[i] = result[i].replaceAll("W", "f");
		    	result[i] = result[i].replaceAll("X", "m");
		    	result[i] = result[i].replaceAll("Y", "a");
		    	result[i] = result[i].replaceAll("Z", "q");
		    	System.out.println("After: " + result[i]);
		    	fout.write("Case #" + (i+1) + ": " + result[i]);
		    	out.newLine();
		    	out.flush();
		    	
		    }
		    in.close();
		    out.close();
		    
		} catch (Exception e) {
			System.out.println("error. ");
			e.printStackTrace();
		}
		
	}

}
