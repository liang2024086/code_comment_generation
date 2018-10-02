package methodEmbedding.Speaking_in_Tongues.S.LYD1208;

import java.util.HashMap;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('y', 'a');
		map.put('e', 'o');
		map.put('q', 'z');
		map.put('z', 'q');
		String[][] in = {
				{"ejp mysljylc kd kxveddknmc re jsicpdrysi","our language is impossible to understand"},
				{"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd","there are twenty six factorial possibilities"},
				{"de kr kd eoya kw aej tysr re ujdr lkgc jv","so it is okay if you want to just give up"}
		};

		for(String[] t : in)
			for(int i=0; i<t[0].length(); i++)
				map.put(t[0].charAt(i), t[1].charAt(i));
		
		map.put(' ', ' ');
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=1; i<=n; i++){
			System.out.print("Case #"+i+": ");
			String s = sc.nextLine();
			for(int j=0; j<s.length(); j++)
				System.out.print(map.get(s.charAt(j)));
			System.out.println();
		}
	}

}
