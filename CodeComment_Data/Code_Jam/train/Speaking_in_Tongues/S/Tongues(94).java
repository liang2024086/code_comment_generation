package methodEmbedding.Speaking_in_Tongues.S.LYD1186;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tongues {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		String[] ins = {"ejp mysljylc kd kxveddknmc re jsicpdrysi"
						, "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd"
						, "de kr kd eoya kw aej tysr re ujdr lkgc jv"};
		String[] outs = {"our language is impossible to understand"
						 , "there are twenty six factorial possibilities"
						 , "so it is okay if you want to just give up"};
		char[] rosetta = new char[26];
		for ( int i = 0; i < 3; i++ ) {
			char[] in = ins[i].toCharArray()
				, out = outs[i].toCharArray();
			for ( int j = 0; j < in.length; j++ ) {
				if ( in[j] != ' ' ) {
					//					System.out.println("Attempting to decode " + in[j] + " to " + out[j]);
					rosetta[in[j]-97] = out[j];
				}
			}
		}
		rosetta['q'-97] = 'z';
		rosetta['z'-97] = 'q';

		for ( int i = 1; i <= T; i++ ) {
			char[] G = br.readLine().toCharArray();
			StringBuffer out = new StringBuffer();
			for ( int j = 0; j < G.length; j++ ) {
				char c = G[j];
				if ( c != ' ' ) {
					c = rosetta[c-97];
				}
				out.append(c);
			}
			System.out.println("Case #" + i + ": " + out.toString());
		}
	}
}
