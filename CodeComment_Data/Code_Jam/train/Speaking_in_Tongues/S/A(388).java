package methodEmbedding.Speaking_in_Tongues.S.LYD378;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class A {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		String sin = "ejp mysljylc kd kxveddknmc re jsicpdrysirbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcdde kr kd eoya kw aej tysr re ujdr lkgc jv";
		String sout = "our language is impossible to understandthere are twenty six factorial possibilitiesso it is okay if you want to just give up";

		Map<Character, Character> map = new HashMap<Character, Character>();

		for (int i = 0; i < sin.length(); i++)
			map.put(sin.charAt(i), sout.charAt(i));

		map.put('z', 'q');
		map.put('q', 'z');

		File file = new File(args[0]);

		BufferedReader reader = new BufferedReader(new FileReader(file));
		PrintStream printer = new PrintStream(new File("A-small.txt"));

		int t = Integer.parseInt(reader.readLine());

		for (int i = 0; i < t; i++) {
			String s = reader.readLine();
			printer.print("Case #" + (i + 1) + ": ");
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < s.length(); j++)
				sb.append(map.get(s.charAt(j)));

			printer.println(sb.toString());
		}
	}
}
