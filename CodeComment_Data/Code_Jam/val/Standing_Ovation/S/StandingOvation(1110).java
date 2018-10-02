package methodEmbedding.Standing_Ovation.S.LYD1255;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class StandingOvation {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner(new File("A-small-attempt0.in"));
		
		int cases = Integer.valueOf(in.nextLine());
		StringTokenizer st;
		
		PrintWriter pw = new PrintWriter(new File("output.out"));
		
		for (int i = 0; i < cases; i++) {
			st = new StringTokenizer(in.nextLine());
			int max = Integer.valueOf(st.nextToken());
			
			int total = 0;
			int additional = 0;
			String[] people = st.nextToken().split("");
			
			for (int j = 0; j <= max; j++) {
				if (total<j) {
					additional+=j-total;
					total+=j-total;
				}
				total+=Integer.valueOf(people[j]);
			}
			
			
			pw.println("Case #" + (i+1) + ": " + additional);
			
			
		}
		
		pw.close();
	}

}
