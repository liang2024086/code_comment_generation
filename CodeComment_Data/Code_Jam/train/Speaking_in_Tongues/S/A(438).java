package methodEmbedding.Speaking_in_Tongues.S.LYD475;


import java.util.Arrays;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		String[] os = { "ejp mysljylc kd kxveddknmc re jsicpdrysi",
				"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
				"de kr kd eoya kw aej tysr re ujdr lkgc jv" };
		String[] gs = { "our language is impossible to understand",
				"there are twenty six factorial possibilities",
				"so it is okay if you want to just give up" };
		int[] map = new int[26];
		Arrays.fill(map, -1);
		for (int i = 0; i < os.length; i++) {
			for (int j = 0; j < os[i].length(); j++) {
				char o = os[i].charAt(j);
				char g = gs[i].charAt(j);
				if (o == ' ')
					continue;
				if (map[o - 'a'] == -1) {
					map[o - 'a'] = g - 'a';
				}
			}
		}
		map['z' - 'a'] = 'q' - 'a';
		map['q' - 'a'] = 'z' - 'a';

		Scanner sc = new Scanner(System.in);
		long times = Integer.parseInt(sc.nextLine());
		for (long n = 0; n < times; n++) {
			String b = sc.nextLine();
			String ret = "";
			for (int i = 0; i < b.length(); i++) {
				char c = b.charAt(i);
				if (c == ' ') {
					ret += c;
					continue;
				} else
					ret += (char) (map[c - 'a'] + 'a');
			}
			System.out.println("Case #" + (n + 1) + ": " + ret);
		}

	}

}
