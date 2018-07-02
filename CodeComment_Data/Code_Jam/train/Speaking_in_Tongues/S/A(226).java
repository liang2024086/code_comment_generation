package methodEmbedding.Speaking_in_Tongues.S.LYD90;

import java.util.Hashtable;
import java.util.Scanner;
import java.io.BufferedInputStream;
public class A
{
	public static void main(String[] args)
	{
		Hashtable<Character, Character> map = new Hashtable<Character, Character>();
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
		
		Scanner scanner = new Scanner(new BufferedInputStream(System.in));
		
		int n = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 0; i < n; i++)
		{
			String s = scanner.nextLine();
			String result = "";
			int len = s.length();
			for (int j = 0; j < len; j++)
			{
				char c = s.charAt(j);
				if (c != ' ')
					result += map.get(c);
				else
					result += ' ';
			}
			System.out.println("Case #" + (i+1) + ": " + result);
		}
	}
}
