package methodEmbedding.Speaking_in_Tongues.S.LYD1166;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class A {
	public static void main(String[] args) throws Exception {
		String from = "y qee ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jvz";
		String to = "a zoo our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give upq";
		Map<Character, Character> TABLE = new HashMap<Character, Character>();
		for (int i = 0; i < from.length(); ++i)
			TABLE.put(from.charAt(i), to.charAt(i));
		
//		char[] test = new char[26];
//		char[] test2 = new char[26];
//		for (int i = 0; i < from.length(); ++i) {
//			char t = to.charAt(i);
//			char f = from.charAt(i);
//			if (t != ' ')
//			test[t-'a'] = f;
//			if (f != ' ')
//			test2[f-'a'] = t;
//		}
//		for (int i = 0 ; i < 26; ++i) {
//			if (test[i] == 0)
//				System.out.println("to : "+(char)(i+'a'));
//			if (test2[i] == 0)
//				System.out.println("from : "+(char)(i+'a'));
//		}
		
		System.out.println(TABLE.size());
		
		Scanner in = new Scanner(new File("A-small-attempt0.bin"));
//		Scanner in = new Scanner(new File("A-test.in"));
		int T = in.nextInt();
		in.nextLine();
		for (int zz = 1; zz <= T; ++zz) {
			final String L = in.nextLine();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < L.length(); ++i) {
				Character c = TABLE.get(L.charAt(i));
				if (c == null)
					System.err.println(L.charAt(i));
				sb.append((char)c);
			}
			
			System.out.println("Case #"+zz+": "+sb.toString());
		}
		
	}
}
