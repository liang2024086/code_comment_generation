package methodEmbedding.Standing_Ovation.S.LYD2167;

import java.util.*;
import java.io.*;

public class StandingOvation {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("A-small-attempt0.in"));
		int T = in.nextInt();
		PrintWriter out = new PrintWriter(new FileWriter("A-small-attempt0.out"));
		for(int loop = 1; loop <= T; loop++) {
			int k = in.nextInt();
			String ppl = in.next();
			int count = 0, friends = 0;
			for(int i = 0; i <= k; i++) {
				if(count < i) {
					friends += i - count;
					count = i;
				}
				count += ppl.charAt(i) - '0';
			}
			out.printf("Case #%d: %d\n", loop, friends);
			System.out.printf("Case #%d: %d\n", loop, friends);
		}
		out.close();
	}
}
			
