package methodEmbedding.Speaking_in_Tongues.S.LYD339;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SpeakingInTongues {
	
	public static void main(String[] args) throws IOException {
		String file = "A-small-attempt0";
		Scanner sc = new Scanner(new FileReader(file + ".in"));
		PrintWriter pw = new PrintWriter(new FileWriter(file + ".out"));
		int T = new Integer(sc.nextLine());
		Map<String, String> map = new HashMap<String, String>();
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
		for (int i=1; i <= T; i++) {
			String G = sc.nextLine();
			pw.print("Case #" + i + ": ");
			StringBuilder st = new StringBuilder();
			for(int j = 0;j < G.length();j++) {
				st.append(map.get(String.valueOf(G.charAt(j))));
			}
			pw.println(st.toString());
		}
		pw.flush();
		pw.close();
		sc.close();
	}

}
