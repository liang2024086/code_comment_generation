package methodEmbedding.Speaking_in_Tongues.S.LYD855;


import java.util.HashMap;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<Character, Character> hm = new HashMap<Character, Character>();
		String[] a = new String[6];
		for (int i = 0; i < 6; i++)
			a[i] = in.nextLine();
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < a[i].length(); j++)
				hm.put(a[i].charAt(j), a[i+3].charAt(j));
		hm.put(' ', ' ');
		hm.put('z', 'q');
		hm.put('q', 'z');
		int n = Integer.parseInt(in.nextLine());
		String s;
		int t = 1;
		for (int i = 0; i < n; i++) {
			s = in.nextLine();
			System.out.printf("Case #%d: ", t++);
			for (int j = 0; j < s.length(); j++) {
				System.out.print(hm.get(s.charAt(j)));
			}
			System.out.println();
		}
	}
}

