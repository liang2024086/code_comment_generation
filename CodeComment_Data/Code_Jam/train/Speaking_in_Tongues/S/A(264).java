package methodEmbedding.Speaking_in_Tongues.S.LYD1395;

import java.io.*;
import java.util.*;
import java.math.*;

public class A {
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("A-small-attempt0.in"));
		BufferedReader br = new BufferedReader(new InputStreamReader(bis));
		PrintWriter out = new PrintWriter("A-small-attempt0.out");
		int cases = Integer.parseInt(br.readLine().trim());
		char [] mapping = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
		StringTokenizer st;
		for(int c = 1; c <= cases; c++) {
			String conv = br.readLine();
			String res = "";
			for (int i = 0; i < conv.length(); i++) {
				char ch1 = conv.charAt(i);
				if(ch1 >= 'a' && ch1 <= 'z')
					ch1 = mapping [ch1-'a'];
				res += ch1;
			}
			out.println("Case #" + c + ": "+res);
		}
		out.close();
	}
}
