package methodEmbedding.Cookie_Clicker_Alpha.S.LYD159;

import java.io.*;
import java.util.*;

public class Cookie {
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new FileReader(new File("/Users/atai/Play/Codejam/input.txt")));
		PrintWriter prn = new PrintWriter(new FileWriter("output.txt"));
		
		int numTests = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < numTests; i++) {
			String[] temp = br.readLine().trim().split(" ");
			double C = Double.parseDouble(temp[0]);
			double F = Double.parseDouble(temp[1]);
			double X = Double.parseDouble(temp[2]);
			
			double total = 0;
			double rate = 2;
			// each round, check if X/r \leq C/r + X/(r+F).
			// If yes --> Stop, and add X/r to the total, and we are done.
			// If no ---> Build a cookie farm, and update r, and go through the loop again.
			//				add C/r to the total.
			while ((X/rate) > ((C/rate) + (X/(rate+F)))) {
				total += C/rate;
				rate = rate + F;
			}
			total += (X/rate);
			
			prn.printf("Case #%d: %f\n", i+1, total);
		}
		
		prn.close();
	}
}
