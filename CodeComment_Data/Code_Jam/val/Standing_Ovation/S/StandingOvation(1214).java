package methodEmbedding.Standing_Ovation.S.LYD1825;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class StandingOvation {
	public static void main(String[]args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		PrintWriter out = new PrintWriter(new FileWriter("StandingOvation.out"));
		
		int t = in.nextInt();
		
		for(int i = 0; i < t; i++) {
			in.nextInt();
			String peeps = in.next();
			
			int total = 0;
			int need = 0;
			
			for(int j = 0; j < peeps.length(); j++) {
				int cur = peeps.charAt(j) - '0';
				
				if(total < j) {
					need += j - total;
					total += j - total;
				}
				
				total += cur;
			}
			
			System.out.println("Case #" + (i+1) + ": " + need);
			out.println("Case #" + (i+1) + ": " + need);
		}
		
		in.close();
		out.close();
	}
}
