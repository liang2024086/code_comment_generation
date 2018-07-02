package methodEmbedding.Speaking_in_Tongues.S.LYD189;


import java.util.*;
import java.util.regex.Pattern;

import static java.lang.Math.*;

public class A {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Hashtable<String, String> googlerese = new Hashtable<String, String>();
		googlerese.put("a", "y");
		googlerese.put("b", "h");
		googlerese.put("c", "e");
		googlerese.put("d", "s");
		googlerese.put("e", "o");
		googlerese.put("f", "c");
		googlerese.put("g", "v");
		googlerese.put("h", "x");
		googlerese.put("i", "d");
		googlerese.put("j", "u");
		googlerese.put("k", "i");
		googlerese.put("l", "g");
		googlerese.put("m", "l");
		googlerese.put("n", "b");
		googlerese.put("o", "k");
		googlerese.put("p", "r");
		googlerese.put("q", "z");
		googlerese.put("r", "t");
		googlerese.put("s", "n");
		googlerese.put("t", "w");
		googlerese.put("u", "j");
		googlerese.put("v", "p");
		googlerese.put("w", "f");
		googlerese.put("x", "m");
		googlerese.put("y", "a");
		googlerese.put("z", "q");
		googlerese.put(" ", " ");
		
		int T = in.nextInt();
		in.nextLine();
		for(int lines = 1; lines <= T; lines++){
			String line, translationline = "";
			line = in.nextLine();
			for (int i = 0; i < line.length(); i++) {
				String chr = line.substring(i, i+1);
				translationline += googlerese.get(chr);
			}
			System.out.format("Case #%d: %s\n", lines, translationline);
		}
	}
}
