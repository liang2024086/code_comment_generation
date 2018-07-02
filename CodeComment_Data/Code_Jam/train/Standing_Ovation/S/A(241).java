package methodEmbedding.Standing_Ovation.S.LYD1189;

import java.util.*;
public class A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int tc = 1;
		while(T-->0) {
			in.nextLine();
			int m = in.nextInt();
			String token = in.next();
			int standing = 0;
			int needed = 0;
			for(int i = 0; i <= m; ++i) {
				int num = token.charAt(i) - '0';
				if(num > 0 && i > standing) {
					needed += i - standing;
					standing += needed;
				}
				standing += num;
			}
			System.out.println("Case #" + tc + ": " + needed);
			++tc;
		}
	}

}
