package methodEmbedding.Speaking_in_Tongues.S.LYD11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SpeakingInTongues {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map map = new HashMap();
		map.put("a", "y");
		map.put("b", "h");
		map.put("c", "e");
		map.put("d", "s");
		map.put("e", "o");
		map.put("f", "c");
		map.put("g", "v");
		map.put("h", "x");
		map.put("i", "d");
		map.put("j", "u");
		map.put("k", "i");
		map.put("l", "g");
		map.put("m", "l");
		map.put("n", "b");
		map.put("o", "k");
		map.put("p", "r");
		map.put("q", "z");
		map.put("r", "t");
		map.put("s", "n");
		map.put("t", "w");
		map.put("u", "j");
		map.put("v", "p");
		map.put("w", "f");
		map.put("x", "m");
		map.put("y", "a");
		map.put("z", "q");
		map.put(" ", " ");
		int x = Integer.valueOf(scan.nextLine());
		String[] s = new String[x];
		String[] ss = new String[x];
		for (int i = 0; i < x; i++)
			ss[i] = "";
		for (int i = 0; i < x; i++) {
			s[i] = scan.nextLine();
		}
		for (int i = 0; i < x; i++)
			for (int j = 0; j < s[i].length(); j++) {
				ss[i] += map.get(s[i].substring(j, j + 1));
			}
		for (int i = 1; i <= x; i++)
			System.out.println("Case #" + i + ": " + ss[i - 1]);
	}
}
