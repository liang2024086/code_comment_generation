package methodEmbedding.Speaking_in_Tongues.S.LYD588;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.HashMap;

public class A {

	public static void main(String[] args) throws Exception {
		String[] s1 = new String[] {"ejp mysljylc kd kxveddknmc re jsicpdrysi",
									"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
									"de kr kd eoya kw aej tysr re ujdr lkgc jv"};
		
		String[] s2 = new String[] {"our language is impossible to understand",
									"there are twenty six factorial possibilities",
									"so it is okay if you want to just give up"};
		
		HashMap<Character, Character> map = new HashMap<>();
		map.put('y', 'a');
		map.put('e', 'o');
		map.put('q', 'z');
		map.put('z', 'q');
		for (int i = 0; i < s1.length; i++)
			for (int j = 0; j < s1[i].length(); j++)
				map.put(s1[i].charAt(j), s2[i].charAt(j));

		BufferedReader in = new BufferedReader(new FileReader("input"));
		System.setOut(new PrintStream(new File("output")));
		
		int T = Integer.parseInt(in.readLine().trim());
		for (int t = 1; t <= T; t++) {
			String s = in.readLine();
			System.out.print("Case #" + t + ": ");
			for (char c : s.toCharArray())
				if (map.containsKey(c))
					System.out.print(map.get(c));
				else
					System.out.print(c);
			System.out.println();
		}
	}
}

/*
3
ejp mysljylc kd kxveddknmc re jsicpdrysi
rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd
de kr kd eoya kw aej tysr re ujdr lkgc jv

Case #1: our language is impossible to understand
Case #2: there are twenty six factorial possibilities
Case #3: so it is okay if you want to just give up
*/
