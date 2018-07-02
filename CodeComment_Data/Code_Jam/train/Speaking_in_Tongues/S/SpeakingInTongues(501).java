package methodEmbedding.Speaking_in_Tongues.S.LYD241;

import java.util.*;

public class SpeakingInTongues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine().trim());
		HashMap<Character, Character> hm = new HashMap<Character, Character>();		
		hm.put('e', 'o');
		hm.put('j', 'u');
		hm.put('p', 'r');
		hm.put('m', 'l');
		hm.put('y', 'a');
		hm.put('s', 'n');
		hm.put('l', 'g');
		hm.put('j', 'u');
		hm.put('c', 'e');
		hm.put('k', 'i');
		hm.put('d', 's');
		hm.put('x', 'm');
		hm.put('v', 'p');
		hm.put('n', 'b');
		hm.put('r', 't');
		hm.put('b', 'h');
		hm.put('t', 'w');
		hm.put('a', 'y');
		hm.put('h', 'x');
		hm.put('w', 'f');
		hm.put('f', 'c');		
		hm.put('o', 'k');
		hm.put('u', 'j');
		hm.put('g', 'v');
		hm.put('i', 'd');
		hm.put('n', 'b');
		hm.put('q', 'z');
		hm.put('z', 'q');
		for(int i = 1; i <= a; i++){
			System.out.print("Case #" + i + ": ");
			String s = sc.nextLine().trim();
			String new_S = "";
			for(int j = 0; j < s.length(); j++){
				if(s.charAt(j) == ' '){
					new_S = new_S + " ";
					continue;
				}
				char c = hm.get(s.charAt(j));
				new_S = new_S + c;
			}
			System.out.println(new_S);
		}		
	}
}
