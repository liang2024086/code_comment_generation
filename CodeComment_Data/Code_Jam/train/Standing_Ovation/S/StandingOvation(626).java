package methodEmbedding.Standing_Ovation.S.LYD2008;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class StandingOvation {

	public static void main(String[] args)throws IOException {
		Scanner in = new Scanner(new File("in.in"));
		PrintWriter writer = new PrintWriter("output.out");
		int t = in.nextInt();
		for(int i = 1; i <= t; i++) {
			int smax = in.nextInt();
			String s = in.next();
			int count = s.charAt(0) - '0';
			int required = 0;
			for (int j = 1; j < s.length() ; j++) {
				int temp = s.charAt(j) - '0';
				if (j <= count) {
					count += temp;
				}
				else {
					required += j - count;
					count += temp + (j - count); 
				}
			}
			writer.println("Case #"+i+": "+required);
			
		}
		in.close();
		writer.close();
	}

}
