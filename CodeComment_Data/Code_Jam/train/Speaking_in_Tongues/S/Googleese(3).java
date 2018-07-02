package methodEmbedding.Speaking_in_Tongues.S.LYD850;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;


public class Googleese {
	private static final HashMap<Character,Character> map = new HashMap<Character,Character>();
	
	static
	{
		//z
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
		map.put('z', 'q');
		map.put('p', 'r');
		map.put('d', 's');
		map.put('r', 't');
		map.put('j', 'u');
		map.put('g', 'v');
		map.put('t', 'w');
		map.put('h', 'x');
		map.put('a', 'y');
		map.put('q', 'z');
		map.put(' ', ' ');
	}
	
	public static void main(String [] args) throws NumberFormatException, IOException
	{
		BufferedReader in = new BufferedReader(new StringReader(args[0]));
		int rows = Integer.parseInt(in.readLine());
		for ( int i = 1; i <= rows; i++)
		{
			System.out.print("Case #" + i + ": ");
			String line = in.readLine();
			for ( int j=0; j<line.length();j++)
			{
				System.out.print(map.get(line.charAt(j)));
			}
			System.out.println("");
		}
	}
}
