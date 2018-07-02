package methodEmbedding.Speaking_in_Tongues.S.LYD1219;


import java.util.HashMap;

import utils.IOHelper;

public class SpeakingInTongues
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put(' ', ' ');
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
		//
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
		//
		map.put('z', 'q');

		try
		{
			String[] input = IOHelper.readFile(args[0]);
			String[] results = new String[input.length];

			for (int line = 0; line < input.length; line++)
			{
				String curLine = input[line];
				StringBuilder builder = new StringBuilder(100);
				for (int i = 0; i < curLine.length(); i++)
				{
					builder.append(map.get(curLine.charAt(i)).charValue());
				}

				results[line] = builder.toString();
			}

			IOHelper.writeFile(args[0].replace(".in", ".out"), results);
		}
		catch (IndexOutOfBoundsException e)
		{

		}
	}
}
