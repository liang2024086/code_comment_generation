package methodEmbedding.Speaking_in_Tongues.S.LYD342;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class SpeakingTongues {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int total = in.nextInt();
		
		Hashtable<Character, Character> letters = new Hashtable<Character, Character>();
		
		letters.put('a', 'y'); //aaa
		letters.put('b', 'h');//aaa
		letters.put('c', 'e');//aaa
		letters.put('d', 's');//aaa
		letters.put('e', 'o');//aaa
		letters.put('f', 'c');//aaa
		letters.put('g', 'v');//aaa
		letters.put('h', 'x');//aaa
		letters.put('i', 'd');//aaa
		letters.put('j', 'u');//aaa
		letters.put('k', 'i');//aaa
		letters.put('l', 'g');//aaa
		letters.put('m', 'l');//aaa
		letters.put('n', 'b');//aaa
		letters.put('o', 'k');//aaa
		letters.put('p', 'r');//aaa
		letters.put('q', 'z');//duvida
		letters.put('r', 't');//aaa
		letters.put('s', 'n');//aaa
		letters.put('t', 'w');//aaa
		letters.put('u', 'j');//aaa
		letters.put('v', 'p');//aaa
		letters.put('w', 'f');//aaa
		letters.put('x', 'm');//aaa
		letters.put('y', 'a');//aaa
		letters.put('z', 'q');//aaa
		letters.put(' ', ' ');
		
		String text = in.nextLine();
		String result = "";
		for (int i = 1; i <= total; i++) {
			text = in.nextLine();
			result = "";
				
			for (Character string : text.toCharArray()) {
				Enumeration<Character> keys = letters.keys();
				while(keys.hasMoreElements()){
					Character nextElement = keys.nextElement();
					if(string.equals(nextElement)){
						result = result + letters.get(nextElement);
					}
				}
			}
				
			System.out.format("Case #%d: %s\n", i, result);
		}
	}
}
