package methodEmbedding.Speaking_in_Tongues.S.LYD702;

import java.util.*;

public class A{
	static TreeMap<Character, Character> map = new TreeMap<Character, Character>();
	public static void main(String[] args){
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
		map.put(' ', ' ');

		Scanner input = new Scanner(System.in);

		int num = input.nextInt();
		input.nextLine();
		for (int n = 1; n <= num; n++){
			String currLine = input.nextLine();
			StringBuilder sb = new StringBuilder();
			sb.append("Case #" + n + ": ");
			for (int i = 0; i < currLine.length(); i++){
				sb.append(map.get(currLine.charAt(i)));
			}
			System.out.println(sb);
		}
		
	}
}
