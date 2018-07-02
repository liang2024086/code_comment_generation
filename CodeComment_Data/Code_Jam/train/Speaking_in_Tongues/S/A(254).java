package methodEmbedding.Speaking_in_Tongues.S.LYD297;

import java.io.*;
import java.util.TreeSet;

public class A {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(
				new FileInputStream("A.in")));
		PrintWriter out = new PrintWriter("A.out");
		char[] t = { 'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i',
				'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f',
				'm', 'a', 'q', };
		int tc = Integer.parseInt(in.readLine());
		for (int i = 1; i <= tc; i++) {
			String inp = in.readLine();
			String o = "";
			for (int j = 0; j < inp.length(); j++)
				if (inp.charAt(j) == ' ')
					o += ' ';
				else
					o += t[inp.charAt(j) - 'a'];
			out.printf("Case #%d: %s\n", i, o);
		}
		in.close();
		out.close();
	}
}
