package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1055;

import java.io.*;
import java.util.*;

public class RQB {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		int nCases = s.nextInt();
		for (int z = 0; z < nCases; z++) {
			String stack = s.next();

			int length = stack.length();
			boolean[] visited = new boolean[1 << length];
			int x = 0;
			for (int i = 0; i < length; i++) {
				if (stack.charAt(i) == '-') {
					x |= (1 << i);
				}
			}

			Queue<Integer> q = new LinkedList<Integer>();
			q.add(x);
			visited[x] = true;

			int steps = -1;
			boolean found = false;
			while (!found) {
				steps++;
				Queue<Integer> nextQ = new LinkedList<Integer>();
				while (!q.isEmpty()) {
					int cur = q.poll();
					if (cur == 0) {
						found = true;
						break;
					}

					for (int i = 1; i <= length; i++) {
						int topmask = (1 << i) - 1;
						int top = cur & topmask;
						int bottom = cur & ~topmask;
						int neighbor = (Integer.reverse(~top) >>> (32 - i)) | bottom;
						if (!visited[neighbor]) {
							nextQ.add(neighbor);
							visited[neighbor] = true;
						}
					}
				}
				q = nextQ;
			}

			System.out.printf("Case #%d: %d\n", z + 1, steps);
		}
		s.close();
	}
}
