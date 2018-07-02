package methodEmbedding.Speaking_in_Tongues.S.LYD1031;

import java.util.*;

public class A {
		
	public static void main(String[] args){
		Hashtable <Character, Character> map = new Hashtable <Character, Character> ();
		map.put('y', 'a');
		map.put('n', 'b');
		map.put('f', 'c');
		map.put('i', 'd');
		map.put('c', 'e');
		map.put('w', 'f');
		map.put('l', 'g');
		map.put('b', 'h');
		map.put('k', 'i');
		map.put('u', 'j');
		map.put('o', 'k');
		map.put('m', 'l');
		map.put('x', 'm');
		map.put('s', 'n');
		map.put('e', 'o');
		map.put('v', 'p');
		map.put('z', 'q'); //Z?
		map.put('p', 'r');
		map.put('d', 's');
		map.put('r', 't');
		map.put('j', 'u');
		map.put('g', 'v');
		map.put('t', 'w');
		map.put('h', 'x');
		map.put('a', 'y');
		map.put('q', 'z'); //Q?
		
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		in.nextLine();
		
		for(int line = 1; line <= T; line++){ // loop through lines
			char[] encodedLine = in.nextLine().toCharArray();
			char[] decodedLine = new char[encodedLine.length];
			for(int i = 0; i < encodedLine.length; i++){ // decode a line
				char encodedChar = encodedLine[i];
				char decodedChar;
				if(map.containsKey(encodedChar)){
					decodedChar = map.get(encodedChar);
				}else{
					decodedChar = encodedChar;
				}
				decodedLine[i] = decodedChar;
				
			}
			String result = new String(decodedLine);
			System.out.format("Case #%d: %s\n", line, result);
		}
	}
}
