package methodEmbedding.Speaking_in_Tongues.S.LYD299;

import java.util.Scanner;
import java.util.TreeMap;


public class SpeakingInTongues {
 public static void main(String[]args){
	 Scanner sc = new Scanner(System.in);
	 TreeMap<Character, Character> m = new TreeMap<Character, Character>();
	 m.put('a', 'y');
	 m.put('b', 'h');
	 m.put('c', 'e');
	 m.put('d', 's');
	 m.put('e', 'o');
	 m.put('f', 'c');
	 m.put('g', 'v');
	 m.put('h', 'x');
	 m.put('i', 'd');
	 m.put('j', 'u');
	 m.put('k', 'i');
	 m.put('l', 'g');
	 m.put('m', 'l');
	 m.put('n', 'b');
	 m.put('o', 'k');
	 m.put('p', 'r');
	 m.put('q', 'z');
	 m.put('r', 't');
	 m.put('s', 'n');
	 m.put('t', 'w');
	 m.put('u', 'j');
	 m.put('v', 'p');
	 m.put('w', 'f');
	 m.put('x', 'm');
	 m.put('y', 'a');
	 m.put('z', 'q');
	 m.put(' ', ' ');
	 
	//Read in the T int -- Test Cases
	int T = Integer.parseInt(sc.nextLine());
	for (int t = 1; t <= T; t++) {
		//START OF CODE
		String sen = sc.nextLine();
		String out = "";
		for (int i = 0; i < sen.length(); i++) {
			out += m.get(sen.charAt(i));
		}
		//END OF CODE
		//OUTPUT
		System.out.format("Case #%d: %s\n", t, out);
	}
 }
}
