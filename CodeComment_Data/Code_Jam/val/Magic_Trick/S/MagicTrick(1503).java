package methodEmbedding.Magic_Trick.S.LYD2072;

import java.io.*;
import java.util.*;

public class MagicTrick {

	static final String SRC = "A-small-attempt0.in";

	public static void main (String[] args) throws IOException {
		Scanner sc = new Scanner(new File(SRC));
		PrintWriter out = new PrintWriter(SRC + ".out");

		int m = sc.nextInt();

		for (int q = 1; q <= m; q++) {
			HashSet<Integer>[] sets = new HashSet[2];
			
			for (int i = 0; i < 2; i++) {
				sets[i] = new HashSet<Integer>();
				int r = sc.nextInt();
				for (int j = 1; j <= 4; j++) {
					for (int k = 1; k <= 4; k++) {
						if (j == r)
							sets[i].add(sc.nextInt());
						else
							sc.nextInt();
					}
				}
			}

			for (HashSet set : sets)
				System.out.println(set);


			sets[0].retainAll(sets[1]);

			out.printf("Case #%d: ", q);

			switch (sets[0].size()) {
				case 0:  out.println("Volunteer cheated!"); break;
				case 1:  out.println(sets[0].iterator().next()); break;
				default: out.println("Bad magician!"); break;
			}
		}

		out.close();
	}
}
