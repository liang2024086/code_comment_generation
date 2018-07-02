package methodEmbedding.Speaking_in_Tongues.S.LYD972;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SpeakingInTongues {
	public static void main(String[] args) throws Exception{
		Map<Character,Character> map = new HashMap<Character,Character>();
		map.put('a', 'y');
		map.put('b', 'h');
		map.put('c', 'e');
		map.put('d', 's');
		map.put('e', 'o');
		map.put('f', 'c');
		map.put('g', 'v');
		map.put('h', 'x');
		map.put('i', 'd');
		map.put('j', 'u');
		map.put('k', 'i');
		map.put('l', 'g');
		map.put('m', 'l');
		map.put('n', 'b');
		map.put('o', 'k');
		map.put('p', 'r');
		map.put('q', 'z');
		map.put('r', 't');
		map.put('s', 'n');
		map.put('t', 'w');
		map.put('u', 'j');
		map.put('v', 'p');
		map.put('w', 'f');
		map.put('x', 'm');
		map.put('y', 'a');
		map.put('z', 'q');
		
		Scanner scanner = new Scanner(new File("A-small-attempt0.in"));
		int num = scanner.nextInt();
		scanner.nextLine();
		for(int i = 1;i<=num;i++) {
			String line = scanner.nextLine();
			String answer = "";
			for(int x = 0;x<line.length();x++) {
				if(line.charAt(x)!=' ')
					answer+=map.get(line.charAt(x));
				else 
					answer+=" ";
			}
			System.out.println("Case #" + i + ": " + answer);
		}
	}
}
