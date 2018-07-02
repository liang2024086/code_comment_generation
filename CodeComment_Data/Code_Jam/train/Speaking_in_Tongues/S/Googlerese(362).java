package methodEmbedding.Speaking_in_Tongues.S.LYD649;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.TreeMap;


public class Googlerese {
	static String[] coded = {
		"y qee",
		"ejp mysljylc kd kxveddknmc re jsicpdrysi",
		"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
		"de kr kd eoya kw aej tysr re ujdr lkgc jv"
	};
	
	static String[] original = {
		"a zoo",
		"our language is impossible to understand",
		"there are twenty six factorial possibilities",
		"so it is okay if you want to just give up"
	};

	public static void main(String[] args) throws IOException {
		TreeMap<Character, Character> map = new TreeMap<Character, Character>();
		for (int a = 0; a < coded.length; a++) {
			int l = coded[a].length();
			for (int b = 0; b < l; b++) {
				map.put(coded[a].charAt(b), original[a].charAt(b));
			}
		}
		
		char missingCoded = 0;
		char missingOrig = 0;
		for (char c = 'a'; c <= 'z'; c++) {
			if (!map.containsKey(c))
				missingCoded = c;
			if (!map.containsValue(c))
				missingOrig = c;
		}
		map.put(missingCoded, missingOrig);
		
		LineNumberReader in = new LineNumberReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine().trim());
		for (int a = 1; a <= n; a++) {
			String l = in.readLine();
			System.out.print("Case #" + a + ": ");
			for (int b = 0; b < l.length(); b++)
				System.out.print(map.get(l.charAt(b)));
			System.out.println();
		}
	}
}
