package methodEmbedding.Standing_Ovation.S.LYD931;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;


public class A {
	public static Scanner in;
	public static PrintWriter out;
	public static final String IN_FILE = "A-small-attempt0.in";
	public static final String OUT_FILE = "A-small-attempt0.out";
	
	static boolean debug = false;
	
	
	public static void main(String[] args) throws IOException {
		if (debug) {
			in = new Scanner(new InputStreamReader(System.in));
			out = new PrintWriter(System.out);
			
		} else {		
			in = new Scanner(new FileReader(IN_FILE));
			out = new PrintWriter(new FileWriter(OUT_FILE));
		}
		
		int caseCount = in.nextInt();
		
		for (int caseNum = 1; caseNum <= caseCount; caseNum++) {
			int d = in.nextInt();
			String s = in.next();
			
			int needed = 0;
			int total = s.charAt(0) - '0';
			
			for (int i = 1; i <= d; i++) {
				int cur = s.charAt(i) - '0';
				if (cur > 0 && total < i) {
					int inc = i - total;
					needed += inc;
					total += inc;
				}
				total += cur;
			}
			
			out.println(String.format("Case #%d: %d", caseNum, needed));
		}
		out.flush();
		out.close();
		in.close();
	}
}
