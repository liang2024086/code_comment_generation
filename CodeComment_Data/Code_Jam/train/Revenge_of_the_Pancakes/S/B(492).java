package methodEmbedding.Revenge_of_the_Pancakes.S.LYD633;

import java.io.*;
import java.util.*;

public class B {

	public static void main(String args[]) throws Exception {
		String fn = args.length > 0 ?  args[0] :
		//	"b1.in";
			"B-small-attempt0.in";
		//	"B-large.in";
		LineNumberReader in = new LineNumberReader(new FileReader(fn));
		PrintWriter out = new PrintWriter(new FileWriter(fn.replace(".in", ".out")));
		int T = Integer.parseInt(in.readLine());
		for(int i = 0; i < T; i++) {
			out.print("Case #" + (i+1) + ": ");
			String S = in.readLine();
			int cnt = 0;
			int pos = S.length();
			char ch = '+';
			while(--pos >= 0) {
				if(S.charAt(pos) != ch) {
					cnt++;
					ch ^= '+' ^ '-';
				}
			}
			out.print(cnt);
			out.println();
			out.flush();
		}
		out.close();
	}
}
