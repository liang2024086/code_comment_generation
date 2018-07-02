package methodEmbedding.Speaking_in_Tongues.S.LYD187;

import java.util.HashMap;
import java.util.Scanner;

public class cj2 {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>(); 
		hm.put("a", "y");
		hm.put("b", "h");
		hm.put("c", "e");
		hm.put("d", "s");
		hm.put("e","o");
		hm.put("f", "c");
		hm.put("g", "v");
		hm.put("h", "x");
		hm.put("i", "d");
		hm.put("j", "u");
		hm.put("k", "i");
		hm.put("l", "g");
		hm.put("m", "l");
		hm.put("n", "b");
		hm.put("o", "k");
		hm.put("p", "r");
		hm.put("q", "z");
		hm.put("r", "t");
		hm.put("s", "n");
		hm.put("t", "w");
		hm.put("u", "j");
		hm.put("v", "p");
		hm.put("w", "f");
		hm.put("x", "m");
		hm.put("y","a");
		hm.put("z","q");
		hm.put(" "," ");
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		s.nextLine();
		for (int i=1; i<=T;i++) {
			System.out.print("Case #" +i+": ");
			String str = s.nextLine();
			String str1 = "";
			for(int j=0; j<str.length();j++) {
				str1 += hm.get(Character.toString(str.charAt(j)));
			}
			System.out.println(str1);
		}
	}
}
