package methodEmbedding.Speaking_in_Tongues.S.LYD31;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new BufferedReader(new FileReader(args[0])));
		int T = scanner.nextInt();
		scanner.nextLine();
		
		StringBuilder gBuilder = new StringBuilder();
		StringBuilder sBuilder = new StringBuilder();
		
		gBuilder.append("ejp mysljylc kd kxveddknmc re jsicpdrysi");
		sBuilder.append("our language is impossible to understand");
		
		gBuilder.append("rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd");
		sBuilder.append("there are twenty six factorial possibilities");
		
		gBuilder.append("de kr kd eoya kw aej tysr re ujdr lkgc jv");
		sBuilder.append("so it is okay if you want to just give up");
		
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put(' ', ' ');
		map.put('q', 'z');
		map.put('z', 'q');
		for (int i = 0; i < gBuilder.length(); ++i)
			map.put(gBuilder.charAt(i), sBuilder.charAt(i));
		
		//for (char c = 'a'; c <= 'z'; ++c)
		//	System.out.println(c + " => " + map.get(c));
		
		for (int x = 1; x <= T; ++x) {
			String G = scanner.nextLine();
			System.out.print("Case #" + x + ": ");
			
			for (char c: G.toCharArray())
				System.out.print(map.get(c));
			
			System.out.println();			
		}
	}

}
