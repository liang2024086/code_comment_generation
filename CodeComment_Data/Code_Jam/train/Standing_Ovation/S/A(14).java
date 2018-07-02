package methodEmbedding.Standing_Ovation.S.LYD1225;

import java.io.*;
import java.util.*;

public class A {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader("A.in"));
		// BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintStream out = new PrintStream("A.out");

		int t = Integer.parseInt(in.readLine());
		for(int i = 0; i < t; i++) {
			String str = in.readLine();
			int a = Integer.parseInt(str.substring(0, str.indexOf(" ") ));
			char[] c = str.substring(str.indexOf(" ") + 1).toCharArray();
			boolean works = false;
			for(int j = 0; j <= a && !works; j++) {
				boolean works2 = true;
				int tot = c[0] - 48;
				for(int k = 1; k < c.length; k++) {
					if(tot < k) {
						works2 = false;
					}
					tot += c[k] - 48;
				}
				if(works2) {
					works = true;
					out.println("Case #" + (i + 1) + ": " + j);
				}
				c[0]++;
			}
		}
	}
}
