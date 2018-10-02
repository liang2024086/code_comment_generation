package methodEmbedding.Speaking_in_Tongues.S.LYD1638;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Main {
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new FileWriter("out.txt")); 
		GoogleRese a = new GoogleRese();
		
		String inString = "";
		int t = Integer.parseInt(in.readLine());
		
		for(int i = 0; i < t; i++) {
			
			inString = in.readLine();
			out.println("Case #" + (i+1) + ": " + a.backToEnglish(inString));
			
		}
		in.close();
		out.close();
		
	}

}
