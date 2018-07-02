package methodEmbedding.Speaking_in_Tongues.S.LYD1351;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

class a {
	public static void main(String[] args) throws FileNotFoundException {
		String src[] = { "ejp mysljylc kd kxveddknmc re jsicpdrysi",
				"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
				"de kr kd eoya kw aej tysr re ujdr lkgc jv" };
		String dst[] = { "our language is impossible to understand",
				"there are twenty six factorial possibilities",
				"so it is okay if you want to just give up" };
		char mp[] = new char[128];
		boolean visSrc[] = new boolean[128], visDst[] = new boolean[128];
		mp['a'] = 'y';
		mp['o'] = 'e';
		mp['z'] = 'q';
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < src[i].length(); j++)
				mp[src[i].charAt(j)] = dst[i].charAt(j);
		for (int i = 'a'; i <= 'z'; i++)
			if (mp[i] != '\0') {
				visSrc[i] = true;
				visDst[mp[i]] = true;
			}
		for (int i = 'a'; i <= 'z'; i++)
			if (!visSrc[i])
				for (int j = 'a'; j <= 'z'; j++)
					if (!visDst[j])
						mp[i] = (char) j;
		Scanner in = new Scanner(new File("1.in"));
		PrintStream out = new PrintStream(new File("1.out"));
		int T = Integer.parseInt(in.nextLine());

		for (int tt = 0; tt < T; tt++) {

			out.printf("Case #%d: ", tt + 1);
			String str = in.nextLine();
			for (int i = 0; i < str.length(); i++)
				out.printf("%c", mp[str.charAt(i)]);
			out.println();
		}
	}
}
