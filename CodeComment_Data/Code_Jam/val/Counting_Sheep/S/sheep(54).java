package methodEmbedding.Counting_Sheep.S.LYD349;

import java.util.*;
import java.lang.*;

class sheep {
	static boolean[] seen;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();

		for (int t = 1; t <= T; t++) {
			seen = new boolean[10];
			boolean seen_all = true;

			int n = in.nextInt();

			for (int i = 1; i < 101; i++) {
				seen_all = true;

				String s = Integer.toString(n*i);
				for (int j = 0; j < s.length(); j++) {
					seen[s.charAt(j)-'0'] = true;
				}
				for (int j = 0; j < 10; j++) {
					if (!seen[j]) {
						seen_all = false;
						break;
					} 
				}
				if (seen_all) {
					System.out.printf("Case #%d: %s\n",t,s);
					break;
				}
			}
			if (!seen_all) System.out.printf("Case #%d: INSOMNIA\n", t);
		}
	}
}
