package methodEmbedding.Speaking_in_Tongues.S.LYD202;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SpeakingTonges {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File(
				"./src/google/gcj/speakingintonges/A-small-attempt3.in"));

		String googlerese = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv qz";
		String maybeEnglish = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up zq";

		int T = in.nextInt();

		Pattern patt = Pattern.compile(".*");
		in.useDelimiter("[\\r\\n]+");
		char[] tmp;
		char[] translated;
		int pos;
		for (int zz = 0; zz < T; zz++) {
			tmp = in.next(patt).toCharArray();
			translated = new char[tmp.length];
			for (int i = 0; i < tmp.length; i++) {
				pos = googlerese.indexOf(tmp[i]);
				translated[i] = (pos != -1) ? maybeEnglish.charAt(pos) : tmp[i];
			}

			System.out.format("Case #%d: %s\n", zz + 1,
					String.valueOf(translated));
		}
	}
}
