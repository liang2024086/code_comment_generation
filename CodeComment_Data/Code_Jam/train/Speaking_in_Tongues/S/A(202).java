package methodEmbedding.Speaking_in_Tongues.S.LYD457;

import java.util.*;

public class A {
	public static void main (String[] args) {
		Scanner x = new Scanner(System.in);
		Hashtable code = new Hashtable();
		code.put("a", "y");
		code.put("b", "h");
		code.put("c", "e");
		code.put("d", "s");
		code.put("e", "o");
		code.put("f", "c");
		code.put("g", "v");
		code.put("h", "x");
		code.put("i", "d");
		code.put("j", "u");
		code.put("k", "i");
		code.put("l", "g");
		code.put("m", "l");
		code.put("n", "b");
		code.put("o", "k");
		code.put("p", "r");
		code.put("q", "z");
		code.put("r", "t");
		code.put("s", "n");
		code.put("t", "w");
		code.put("u", "j");
		code.put("v", "p");
		code.put("w", "f");
		code.put("x", "m");
		code.put("y", "a");
		code.put("z", "q");
		code.put(" ", " ");
		
		String TT = x.nextLine();
		Scanner bla = new Scanner(TT);
		int T = bla.nextInt();
		for(int i = 1; i <= T; i++) {
			String linea = x.nextLine();
			System.out.print("Case #" +i+ ": ");
			for (int j = 0; j < linea.length(); j++)
				System.out.print(code.get(Character.toString(linea.charAt(j))));
			System.out.println();
		}
	}
}
