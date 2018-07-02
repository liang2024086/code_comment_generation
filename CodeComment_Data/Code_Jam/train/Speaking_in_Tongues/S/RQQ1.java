package methodEmbedding.Speaking_in_Tongues.S.LYD136;


import java.util.*;
import java.io.*;
import java.lang.*;

public class RQQ1 {
	
	public static void main(String[] args)
	{
		try
		{
			HashMap<Character,Character> map = new HashMap<Character,Character>();
			Scanner s = new Scanner(new File("A-small-attempt0.in"));
			FileWriter o = new FileWriter(new File("out.txt"));
			
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
			
			Integer lines = Integer.parseInt(s.nextLine());
			String str;
			
			for (int i = 0; i < lines; i++)
			{
				o.write("Case #" + ( i + 1) + ": ");
				str = s.nextLine();
				for (int j = 0; j < str.length(); j++)
				{
					if (map.containsKey(str.charAt(j)))
					{
						o.write(map.get(str.charAt(j)));
					}
					else
					{
						o.write(" ");
					}
				}
				o.write("\n");
			}
			
			s.close();
			o.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace(System.out);
		}
	}
}
