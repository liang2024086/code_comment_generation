package methodEmbedding.Speaking_in_Tongues.S.LYD134;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class First {

	private static final String OUT = "C:/workspaces/tc/CodeJam/src/A.out";
	private static final String IN = "D:/downloads/A-small-attempt1.in";
	public static String[] in = { "ejp mysljylc kd kxveddknmc re jsicpdrysi",
			"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd", "de kr kd eoya kw aej tysr re ujdr lkgc jv" };
	public static String[] out = { "our language is impossible to understand",
			"there are twenty six factorial possibilities", "so it is okay if you want to just give up" };

	public static void main(String[] args) throws NumberFormatException, IOException {
		Map<Character, Character> relation = new TreeMap<Character, Character>();
		for (int i = 0; i < in.length; i++) {
			for (int j = 0; j < in[i].length(); j++) {
				relation.put(in[i].charAt(j), out[i].charAt(j));
			}
		}
		relation.put('z', 'q');
		relation.put('q', 'z');
		BufferedReader br = new BufferedReader(new FileReader(IN));
		BufferedWriter bw = new BufferedWriter(new FileWriter(OUT));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String G = br.readLine();
			StringBuilder sb = new StringBuilder(G.length() + 8);
			sb.append("Case #");
			sb.append(i + 1);
			sb.append(": ");
			for (char ch : G.toCharArray()) {
				Character converted = relation.get(ch);
				if (converted == null) {
					throw new IllegalArgumentException("Met #" + ch + " in " + G);
				}
				sb.append(converted);
			}
			sb.append('\n');
			bw.write(sb.toString());
		}
		bw.close();
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (!relation.values().contains(ch)) {
				System.out.println("Missed value " + ch);
			}
		}
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (!relation.keySet().contains(ch)) {
				System.out.println("Missed key " + ch);
			}
		}
		System.out.println(relation);
	}

}
