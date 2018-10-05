package methodEmbedding.Revenge_of_the_Pancakes.S.LYD207;

import java.util.*;
import java.lang.*;

class pancake {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int t = 1; t <= T; t++) {
			String s = in.next();
			boolean[] stack = new boolean[s.length()];
			for (int i = 0; i < s.length(); i++) {
				stack[i] = (s.charAt(i) == '+');
			}

			int count = 0;
			boolean last = stack[s.length()-1];
			if (!last) count = 1;

			for (int i = s.length() - 2; i >= 0; i--) {
				if (stack[i] != last) count++;
				last = stack[i];
 			}
 			System.out.printf("Case #%d: %d\n", t, count);
		}		
	}
}
