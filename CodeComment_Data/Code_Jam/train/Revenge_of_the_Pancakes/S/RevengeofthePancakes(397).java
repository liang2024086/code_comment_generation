package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1193;

import java.util.Scanner;


public class RevengeofthePancakes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int x = 1; x <= T; ++x) {
			String S = sc.next();
			char last = S.charAt(0);
			int inversion = 0;
			for (int i = 1; i < S.length(); ++i) {
				if (S.charAt(i) != last)
					++inversion;
				last = S.charAt(i);
			}
			if (last == '-')
				++inversion;
			System.out.println("Case #" + x + ": " + inversion);
		}
		sc.close();
	}

}
/*
5
-
-+
+-
+++
--+-
*/
