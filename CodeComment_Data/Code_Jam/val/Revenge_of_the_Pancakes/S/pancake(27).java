package methodEmbedding.Revenge_of_the_Pancakes.S.LYD986;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;

public class pancake {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		for (int cn = 0; cn < cases; cn++) {
			String stack = in.next();
			ArrayDeque<String> q = new ArrayDeque<String>(1 << stack.length());
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			String ans = "";
			while (ans.length() < stack.length()) {
				ans += "+";
			}
			map.put(stack, 0);
			q.add(stack);
			if (!stack.equals(ans)) {
				out: while (q.size() > 0) {
					String here = q.poll();
					int cost = map.get(here);
					for (int i = 0; i < here.length(); i++) {
						StringBuilder sb = new StringBuilder(here.length());
						for (int j = i; j >= 0; j--) {
							sb.append(here.charAt(j) == '+' ? '-' : '+');
						}
						for (int j = i+1; j < here.length(); j++) {
							sb.append(here.charAt(j));
						}
						String next = sb.toString();
						if (!map.containsKey(next)) {
							map.put(next, cost+1);
							q.add(next);
							if (next.equals(ans))
								break out;
						}
					}
					
					
				}
			}
			System.out.printf("Case #%d: %d\n", cn + 1, map.get(ans));
		}
	}
}
