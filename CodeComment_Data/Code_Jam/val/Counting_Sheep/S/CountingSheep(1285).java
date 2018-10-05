package methodEmbedding.Counting_Sheep.S.LYD665;

import java.io.*;
import java.util.*;

public class CountingSheep {

	public static void main(String args[]) throws Exception {
		String fn = args.length > 0 ?  args[0] :
		//	"a1.in";
			"A-small-attempt0.in";
		LineNumberReader in = new LineNumberReader(new FileReader(fn));
		PrintWriter out = new PrintWriter(new FileWriter(fn.replace(".in", ".out")));
		int T = Integer.parseInt(in.readLine());
		for(int i = 0; i < T; i++) {
			long N = Long.parseLong(in.readLine());
			out.print("Case #" + (i+1) + ": ");
			if(N == 0)
				out.print("INSOMNIA");
			else {
				long n = N;
				int digits = 0;
				for(;;) {
					String s = Long.toString(n);
					for(int j = s.length(); --j >= 0; )
						digits |= 1 << (s.charAt(j) - '0');
					if(digits == (1 << 10) - 1) {
						out.print(n);
						break;
					}
					n += N;
				}
			}
			out.println();
			out.flush();
		}
		out.close();
	}
}
