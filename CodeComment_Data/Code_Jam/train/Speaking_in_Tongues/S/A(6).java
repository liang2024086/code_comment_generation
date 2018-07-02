package methodEmbedding.Speaking_in_Tongues.S.LYD74;


import java.io.*;
import java.util.*;

public class A {
	static char[] _G = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv".toCharArray();
	static char[] _S = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up".toCharArray();
	static char[] F = new char[26];
	static char[] F2 = new char[26];
	static {
		F['a' - 'a'] = 'y'; F2['y' - 'a'] = 1;
		F['o' - 'a'] = 'e'; F2['e' - 'a'] = 1;
		F['z' - 'a'] = 'q'; F2['q' - 'a'] = 1;
		for (int i = 0; i < _G.length; i++)
			if (_G[i] != ' ') {
				F[_G[i] - 'a'] = _S[i];
				F2[_S[i] - 'a'] = 1;
			}
		F['q' - 'a'] = 'z';
	}
	
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(new File("in/A-small-attempt2.in"));
		int T = scan.nextInt(); scan.nextLine();
		PrintWriter out = new PrintWriter(new File("out/A-small-attempt2.txt"));
		for (int z = 1; z <= T; z++) {
			char[] G = scan.nextLine().toCharArray();
			for (int i = 0; i < G.length; i++)
				if (G[i] != ' ')
					G[i] = F[G[i] - 'a'];
			out.println("Case #" + z + ": " + new String(G));
		}
		out.close();
	}
}
