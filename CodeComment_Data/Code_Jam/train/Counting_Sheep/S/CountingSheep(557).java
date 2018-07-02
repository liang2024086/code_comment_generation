package methodEmbedding.Counting_Sheep.S.LYD1200;

import java.io.*;
import java.util.*;
public class CountingSheep {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File ("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new File("off-a.out"));
		PrintWriter debug = new PrintWriter(new File("debug-a.txt"));
		
		int a = sc.nextInt();
		
		Set<Character> digits = new HashSet<>();
		for (int i = 0; i < a; i++) {
			debug.printf("CASE #%d:%n", i+1);
			int num = sc.nextInt();
			if (num==0) {
				debug.println();
				out.printf("CASE #%d: INSOMNIA%n", i+1);
				
				out.flush();
				debug.flush();
				continue;
			}
			
			long inc = 0;
			
			while (digits.size() < 10){
				
				inc += num;
				
				String s = "" + inc;
				
				for (int j = 0; j < s.length(); j++) {
					digits.add(s.charAt(j));
				}
				
				debug.println(inc);
			}
			
			out.printf("CASE #%d: %d%n", i+1, inc);
			
			debug.println();
			out.flush();
			digits.clear();
		}
		
		out.close();
		debug.close();
		sc.close();
	}

}
