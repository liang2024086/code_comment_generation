package methodEmbedding.Standing_Ovation.S.LYD1587;

import java.util.*;
import java.io.*;

public class ovation {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(new File("input/ovation-sm.in"));
		PrintStream out = new PrintStream(new File("output/ovation-sm.out"));
//		Scanner input = new Scanner(System.in);
//		PrintStream out = System.out;
		int T = input.nextInt();
		input.nextLine();
		primary: for (int oncase = 1; oncase <= T; oncase++) {
			out.printf("Case #%d: ", oncase);
			
			int n = input.nextInt();
			String line = input.nextLine().trim();
			int total, def;
			total = def = 0;
			for (int i=0; i<n + 1; i++) {
				if (total < i) {
					def = Math.max(def, i - total);
				}
				total += Integer.parseInt("" + line.charAt(i));
			}
			out.println(def);
		}
		out.close();
		System.out.println("Done");
	}
}
