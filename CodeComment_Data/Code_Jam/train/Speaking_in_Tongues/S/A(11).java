package methodEmbedding.Speaking_in_Tongues.S.LYD945;

import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class A
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		char[] map = new char[256];
		map['a'] = 'y';
		map['b'] = 'h';
		map['c'] = 'e';
		map['d'] = 's';
		map['e'] = 'o';
		map['f'] = 'c';
		map['g'] = 'v';
		map['h'] = 'x';
		map['i'] = 'd';
		map['j'] = 'u';
		map['k'] = 'i';
		map['l'] = 'g';
		map['m'] = 'l';
		map['n'] = 'b';
		map['o'] = 'k';
		map['p'] = 'r';
		map['q'] = 'z';
		map['r'] = 't';
		map['s'] = 'n';
		map['t'] = 'w';
		map['u'] = 'j';
		map['v'] = 'p';
		map['w'] = 'f';
		map['x'] = 'm';
		map['y'] = 'a';
		map['z'] = 'q';
		int T = Integer.parseInt(br.readLine());
		for (int c = 1; c <= T; c++)
		{
			String s = br.readLine();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < s.length(); i++)
			{
				if (s.charAt(i) == ' ') sb.append(' ');
				else sb.append(map[s.charAt(i)]);
			}
			out.printf("Case #%d: %s\n", c, sb.toString());
		}
	}
}
