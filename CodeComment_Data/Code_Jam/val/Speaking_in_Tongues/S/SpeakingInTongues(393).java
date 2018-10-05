package methodEmbedding.Speaking_in_Tongues.S.LYD336;


import java.util.*;
import java.io.*;

public class SpeakingInTongues {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt1.in"));
		PrintWriter out = new PrintWriter(new File("out.txt"));
		
		char[] map = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r',
				'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
		
		int T = Integer.parseInt(in.readLine());
		for (int t = 1; t <= T; ++t) {
			char[] code = in.readLine().toCharArray();
			String res = "";
			for (char c : code) {
				char s = c;
				if (c != ' ')
					s = map[c - 'a'];
				res += s;
			}
			out.println("Case #" + t + ": " + res);
		}
		
		in.close();
		out.close();
		System.exit(0);
	}
}
