package methodEmbedding.Speaking_in_Tongues.S.LYD622;

import java.util.*;
import java.io.*;
public class A {
	char[] map = new char[]{'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
	public A(Scanner in, PrintWriter out) {
		int T = in.nextInt();
		in.nextLine();
		for (int t=0; t<T; t++) {
			out.printf("Case #%d: ", t+1);
			String s = in.nextLine();
			StringBuilder sb = new StringBuilder();
			for (int i=0; i<s.length(); i++) {
				if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
					sb.append(map[s.charAt(i)-'a']);
				else
					sb.append(s.charAt(i));
			}
			out.println(sb);
		}
		out.close();
	}
	public static void main(String[] args) throws FileNotFoundException {
		new A(new Scanner(new File("a.in")),new PrintWriter(new File("a.out")));
	}
}
