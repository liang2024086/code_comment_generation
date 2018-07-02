package methodEmbedding.Magic_Trick.S.LYD1911;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;




public class Main {
	static int gridSize = 4;
	static String input = "/Users/zliu/Downloads/A-small-attempt2.in";
	static String output = "/Users/zliu/Downloads/A-small.out";
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new FileInputStream(input));
		PrintWriter out = new PrintWriter(output);
		int T = scanner.nextInt();
		for (int t = 1; t <= T; ++t) {
			Set<Integer> cand1 = new HashSet<Integer>();
			Set<Integer> cand2 = new HashSet<Integer>();
			
			int ans1 = scanner.nextInt();
			for (int i = 0; i < gridSize; ++i) {
				for (int j = 0; j < gridSize; ++j) {
					int c = scanner.nextInt();
					if (i + 1 == ans1) {
						cand1.add(c);
					}
				}
			}
			int ans2 = scanner.nextInt();
			for (int i = 0; i < gridSize; ++i) {
				for (int j = 0; j < gridSize; ++j) {
					int c = scanner.nextInt();
					if (i + 1 == ans2) {
						cand2.add(c);
					}
				}
			}
			
			cand1.retainAll(cand2);
			
			if (cand1.size() == 0) {
				out.format("Case #%d: Volunteer cheated!\n", t);
			} else if (cand1.size() > 1) {
				out.format("Case #%d: Bad magician!\n", t);
			} else {
				out.format("Case #%d: %d\n", t, cand1.iterator().next());
			}
		}
		
		out.close();
	}
}
