package methodEmbedding.Speaking_in_Tongues.S.LYD265;

import java.util.*;

public class A {
	public static void main(String[] args) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('a', 'y');;
		map.put('b', 'h');;
		map.put('c', 'e');;
		map.put('d', 's');;
		map.put('e', 'o');;
		map.put('f', 'c');;
		map.put('g', 'v');;
		map.put('h', 'x');;
		map.put('i', 'd');;
		map.put('j', 'u');;
		map.put('k', 'i');;
		map.put('l', 'g');;
		map.put('m', 'l');;
		map.put('n', 'b');;
		map.put('o', 'k');; // what?
		map.put('p', 'r');;
		map.put('q', 'z');;
		map.put('r', 't');;
		map.put('s', 'n');;
		map.put('t', 'w');;
		map.put('u', 'j');;
		map.put('v', 'p');;
		map.put('w', 'f');;
		map.put('x', 'm');;
		map.put('y', 'a');;
		map.put('z', 'q');;
		Scanner in = new Scanner(System.in);
		int cases = Integer.parseInt(in.nextLine());
		for(int z=1;z<=cases;++z) {
			char[] cur = in.nextLine().toCharArray();
			System.out.print("Case #" + z + ": ");
			for(char c : cur) {
				if (c == ' ') {
					System.out.print(c);
				}
				else {
					System.out.print(map.get(c));
				}
			}
			System.out.println();
		}
	}
}
