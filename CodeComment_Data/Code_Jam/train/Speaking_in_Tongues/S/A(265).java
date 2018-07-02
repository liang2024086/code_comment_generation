package methodEmbedding.Speaking_in_Tongues.S.LYD400;

import java.io.PrintStream;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		int n = 'z'-'a'+1;
		char map[] = new char[n];
		map['y'-'a'] = 'a';
		map['e'-'a'] = 'o';
		map['q'-'a'] = 'z';
		String ins[] = new String[] {"ejp mysljylc kd kxveddknmc re jsicpdrysi", 
				"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
				"de kr kd eoya kw aej tysr re ujdr lkgc jv"};
		String outs[] = new String[] {
				"our language is impossible to understand",
				"there are twenty six factorial possibilities",
				"so it is okay if you want to just give up"};
		for (int i=0; i<ins.length; i++) {
			String in = ins[i];
			String out = outs[i];
			for (int j=0; j<in.length(); j++) {
				if (in.charAt(j)!=' ')
					map[ in.charAt(j) - 'a' ] = out.charAt(j);
			}
		}
		map['z'-'a'] = 'q';
		boolean inv[] = new boolean[n];
		for (int i=0; i<n; i++) {
			if (map[i]>0)
				inv[ map[i]-'a' ] = true;
			else
				System.err.printf("%c", i+'a');
		}
		for (int i=0; i<n; i++) {
			if (!inv[i])
				System.err.printf("%c", i+'a');
		}
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); scanner.nextLine();
		PrintStream out = System.out;
		for (int i=0; i<N; i++) {
			out.printf("Case #%d: ", i+1);
			String s = scanner.nextLine();
			for (char c : s.toCharArray()) {
				if (c!=' ')
					c = map[c-'a'];
				out.print(c);
			}
			out.println();
		}
	}
}
