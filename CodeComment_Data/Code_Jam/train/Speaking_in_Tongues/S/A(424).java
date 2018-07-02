package methodEmbedding.Speaking_in_Tongues.S.LYD399;

import java.util.*;
import static java.lang.Math.*;

public class A {
	static String enc = "ejp mysljylc kd kxveddknmc re jsicpdrysirbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcdde kr kd eoya kw aej tysr re ujdr lkgc jv";
	static String dec = "our language is impossible to understandthere are twenty six factorial possibilitiesso it is okay if you want to just give up";
	public static void main(String[] args) {
		HashMap<Character, Character> hm = new HashMap<Character, Character>();
		hm.put('z', 'q');
		hm.put('q', 'z');
		
		for (int i = 0; i < enc.length(); i++) {
			hm.put(enc.charAt(i), dec.charAt(i));
		}
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		in.nextLine();
		for(int zz = 1; zz <= T; zz++) {
			String ans = "";
			String S = in.nextLine();
			for (int i = 0; i < S.length(); i++) {
				ans += hm.get(S.charAt(i));
			}
			System.out.format("Case #%d: %s\n", zz, ans);
		}
	}
}
